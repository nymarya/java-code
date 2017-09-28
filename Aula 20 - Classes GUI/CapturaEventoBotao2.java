
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturaEventoBotao2 implements ActionListener {
	
	private JButton botao;
	
	public void janela(){
		JFrame frame = new JFrame();
		botao = new JButton();
		
		//REGISTRA O EVENTO
		botao.addActionListener(this);

		frame.add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		botao.setText("Botão foi clicado!");
		botao.setFont(new Font("SansSerif", Font.BOLD, 20));
		System.out.println(evento.getActionCommand());
	}
	
	public static void main(String[] args) {
		CapturaEventoBotao2 captura = new CapturaEventoBotao2();
		captura.janela();
	}
}