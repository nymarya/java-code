package fishsim;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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

/**
 * (Fill in description and author info here)
 */

public class Simulator extends JFrame
{
    private Ocean ocean;
    private SimulatorView simView;
    
    
    public static void main(String[] args) 
    {
        Simulator sim = new Simulator(50, 60);
        sim.run(10);
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
        
        //Draw control panel
        draw();
    }
    
    /**
     * Run the simulation propper
     * @param steps number of iterations
     */
    public void run(int steps)
    {
        // put the simulation main loop here
        for (int i = 0; i < steps; i++)
        {
            ocean.act(i);
            simView.showStatus(i, ocean);
        }
    }
    
    /**
     * Draw control panel.
     */
    public void draw() {
    	Container contents = simView.getContentPane();
        
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
					Image img = ImageIO.read(getClass().getResource("/resources/ic_play.png"));
					btnPlay.setIcon(new ImageIcon(img));
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
		JButton btnPause = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_pause.png"));
			btnPause.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		btnPause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Image img = ImageIO.read(getClass().getResource("/resources/ic_play.png"));
					btnPause.setIcon(new ImageIcon(img));
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		
		pnlButtons.add(btnPause, c);
		
		c.gridx = 2;
		c.gridy = 0; 
		c.weightx = 0.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,10,10,0);
		c.gridwidth = 2;
		JButton btnResume = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource("/resources/ic_pause.png"));
			btnResume.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		pnlButtons.add(btnResume, c);
		
        
	    contents.add(pnlButtons, BorderLayout.NORTH);
	    simView.pack();
	    simView.setVisible(true);
    }
}
