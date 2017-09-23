/**
 * A classe Presidente representa um objeto 
 * @author Mayra D. de Azevedo
 * @date 21.09.2017
 */

public class Presidente extends Funcionario {

	/**
	 * Cria objeto para classe Presidente
	 * @param nome Nome do presidente.
	 * @param cPF CPF do presidente;
	 * @param dataNascimento Data de nascimento do presidente.
	 * @param salario Salario do presidente.
	 */
	public Presidente(String nome, String cPF, int dataNascimento, double salario) {
		super(nome, cPF, dataNascimento, salario);
	}

	/**
	 * Calcula bonificação do presidente.
	 * @return Bonificação.
	 */
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.3;
	}
	
	/**
	 * Cria representação em String do presidente.
	 */
	public String toString() {
		return "PRESIDENTE\n" + super.toString();
	}

}
