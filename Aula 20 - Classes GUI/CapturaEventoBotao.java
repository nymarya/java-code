
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturaEventoBotao {
	
	private JButton botao;
	
	public void janela(){
		JFrame frame = new JFrame();
		JButton botao = new JButton();
		
		
		botao.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				botao.setText("Botão foi clicado!");
				botao.setFont(new Font("SansSerif", Font.BOLD, 20));
			}
		});

		frame.add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		CapturaEventoBotao captura = new CapturaEventoBotao();
		captura.janela();
	}
}