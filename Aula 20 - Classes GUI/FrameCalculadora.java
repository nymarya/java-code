

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCalculadora extends JFrame{
	
	public FrameCalculadora () {
		super();
		this.setTitle("Calculadora");
		
		JPanel pnlForm = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();		
		c.fill = GridBagConstraints.HORIZONTAL;	
		c.weighty = 1;
		c.weightx = 0.1;
		c.insets = new Insets(10,10,10,10);
		
		
	    c.gridx = 0;
	    c.gridy = 0; 
		pnlForm.add(new JLabel("1° número:"), c);
		
		c.gridx = 0;
		c.gridy = 1; 
		pnlForm.add(new JLabel("2° número:"), c);
		
		
	    c.gridx = 1;
	    c.gridy = 0; 
		JTextField txtN1 = new JTextField(5);
		pnlForm.add(txtN1, c);
		
	    c.gridx = 1;
	    c.gridy = 1; 
		JTextField txtN2 = new JTextField(5);
		pnlForm.add(txtN2, c);	
		
		
		c.gridx = 0;
		c.gridy = 2;
		pnlForm.add(new JLabel("Resultado: "), c);
		
		c.gridx = 1;
		c.gridy = 2;
		JLabel lblResultado = new JLabel("0.0");
		lblResultado.setEnabled(false);
		pnlForm.add(lblResultado, c);
		this.add(pnlForm);
		
		// Container para os botões
		
		JPanel pnlBotoes = new JPanel();	    
	    		
	    JButton btnCalcular = new JButton("Somar");
	    
	    btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtN1.getText());
				double n2 = Double.parseDouble(txtN2.getText());
				lblResultado.setText(""+(n1+n2));
			}
		});
	    	    
	    JButton btnSair = new JButton("Sair");
	    btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	    
	    pnlBotoes.add(btnCalcular);
	    pnlBotoes.add(btnSair);
	    
	    add(pnlBotoes, BorderLayout.SOUTH);

	    setSize(250, 200);
	    setLocationRelativeTo(null);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
