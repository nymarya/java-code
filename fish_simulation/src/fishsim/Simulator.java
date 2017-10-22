package fishsim;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * (Fill in description and author info here)
 */

public class Simulator extends JFrame
{
	private Ocean ocean;
	private SimulatorView simView;
	private int speed;
	private boolean paused;
	private int steps;
	private int currentStep;


	public static void main(String[] args) 
	{
		Simulator sim = new Simulator(50, 60);
		sim.setSteps(1000);
	}

	/**
	 * Set up the simulation
	 * @param height ocean dimension
	 * @param width ocean dimension
	 */
	public Simulator(int height, int width)
	{
		// Create simple fish parameter objects for the three
		// kinds of fish. These could be replaced by control panels
		SFPs herringParams = new SFPs();
		herringParams.initParams(4.0, 1.0, 0.8, 2.0, 6.0, 3, 30, 0, 0.0);
		SFPs groperParams = new SFPs();
		groperParams.initParams(8.0, 1.0, 0.8, 0.0, 16.0, 3, 30, 1, 8.0);
		SFPs sharkParams = new SFPs();
		sharkParams.initParams(16.0, 1.0, 0.8, 0.0, 32.0, 3, 30, 4, 12.0);
		ocean = new Ocean(height, width, herringParams, groperParams, sharkParams);
		simView = new SimulatorView(height, width);

		// define in which color fish should be shown
		simView.setColor(Herring.class, Color.red);
		simView.setColor(Groper.class, Color.blue);
		simView.setColor(Shark.class, Color.black);

		//Init params
		paused = true;
		speed = 512;
		currentStep = 0;

		//Draw control panel
		draw();

		//Init thread.
		Thread t = new Thread(new SimulatorRun(), 
				"simulation");
		t.setDaemon(true);
		t.start();
	}

	/**
	 * Run the simulation propper
	 * @param steps number of iterations
	 */
	public void run(int steps)
	{
		// put the simulation main loop here
		ocean.act(steps);
		simView.showStatus(steps, ocean);

	}

	/**
	 * Draw control panel.
	 */
	public void draw() {
		Container contents = simView.getContentPane();

		JPanel panel = new JPanel(new FlowLayout());

		JTextField txtSteps = new JTextField(5);

		panel.add(txtSteps);

		JPanel pnlButtons = new JPanel(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();
		c.weighty = 1;
		c.weightx = 0.1;
		c.anchor = GridBagConstraints.FIRST_LINE_END;


		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,10, 0, 0);
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JButton btnPlay = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_play.png"));
			btnPlay.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		//c.insets = new Insets(10,0,10,0);

		btnPlay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String ic = paused ? "/resources/ic_play.png" : "/resources/ic_pause.png";
					Image img = ImageIO.read(getClass().getResource(ic));
					btnPlay.setIcon(new ImageIcon(img));
					txtSteps.setEnabled(false);
					pause(!paused);
					
					txtSteps.setVisible(false);
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		pnlButtons.add(btnPlay, c);

		c.gridx = 1;
		c.gridy = 0; 
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,10,0,0);
		JButton btnAdvance = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_fast_forward.png"));
			btnAdvance.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}

		btnAdvance.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				speed /= 2;
			}
		});

		pnlButtons.add(btnAdvance, c);
		
		c.gridx = 2;
		c.gridy = 0; 
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,10,0,0);
		JButton btnSlow = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_fast_rewind.png"));
			btnSlow.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}

		btnSlow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				speed *= 2;
			}
		});

		pnlButtons.add(btnSlow, c);

		c.gridx = 3;
		c.gridy = 0; 
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,10,10,0);
		c.gridwidth = 2;
		JButton btnStop = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_stop.png"));
			btnStop.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		pnlButtons.add(btnStop, c);

		panel.add(pnlButtons);


		contents.add(panel, BorderLayout.NORTH);
		simView.pack();
		simView.setVisible(true);
	}

	/**
	 * Set number of steps of the simulation
	 * @param steps
	 */
	public void setSteps(int steps) {
		this.steps = steps;
	}

	/**
	 * Pause simulation thread.
	 * @param paused
	 */
	public synchronized void pause(boolean paused) {
		this.paused = paused;

		if (!this.paused)
			notifyAll();
	}

	/**
	 * Nesse método, verificamos a condição que desejamos. 
	 * Se a variável pausada valer true, isso nos indica que a thread 
	 * deve dormir. Portanto, damos um wait() nela. 
	 * Caso contrário, ela deve continuar.
	 */
	private synchronized void checkState() 
			throws InterruptedException {


		while (paused) {
			wait();
		}
	}

	/**
	 * Runnable with thread for the simulation.
	 *
	 */
	private class SimulatorRun implements Runnable {
		public void run() {
			try {

				while(currentStep < steps) {

					checkState();
					Simulator.this.run(currentStep++);
					Thread.sleep(speed);
				}
			} catch (InterruptedException e) {

			}
		}
	}
}
