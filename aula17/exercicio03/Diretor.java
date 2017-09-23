/**
 * A classe Diretor representa um objeto Diretor.
 * 
 * @author Mayra D. de Azevedo
 * @version 20.09.2017
 */
public class Diretor extends Gerente {

	/**
	 * Cria objeto para classe Diretor.
	 * @param nome Nome do diretor.
	 * @param cPF CPF do diretor.
	 * @param dataNascimento Data de nascimento do diretor.
	 * @param salario Salario do diretor.
	 */
	public Diretor(String nome, String cPF, int dataNascimento, double salario) {
		super(nome, cPF, dataNascimento, salario);
	}

	/**
	 * Calcula bonificação do diretor.
	 * @return Bonificação.
	 */
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.2;
	}
	
	/**
	 * Cria representação em String do diretor.
	 */
	public String toString() {
		return "DIRETOR\nNome: " + super.getNome() + "\nCPF: " + super.getCPF();
	}
}
