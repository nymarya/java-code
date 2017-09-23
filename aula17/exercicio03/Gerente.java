/**
 * A classe Gerente representa um objeto Gerente.
 * 
 * @author Mayra D. de Azevedo
 * @version 20.09.2017
 */
public class Gerente extends Funcionario{

	/**
	 * Cria objeto para classe Gerente.
	 * @param nome
	 * @param cPF
	 * @param dataNascimento
	 * @param salario
	 */
	public Gerente(String nome, String cPF, int dataNascimento, double salario) {
		super(nome, cPF, dataNascimento, salario);
	}

	/**
	 * Calcula bonificação do gerente.
	 * @return Bonificação.
	 */
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.1;
	}
	
	/**
	 * Cria representação em String do gerente.
	 */
	public String toString() {
		return "GERENTE\n" + super.toString();
	}
	
}
