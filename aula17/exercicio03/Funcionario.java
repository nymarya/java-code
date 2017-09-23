/**
 * A classe abstrata Funcionario representa um objeto Funcionario.
 * 
 * @author Mayra D. de Azevedo
 * @version 20.09.2017
 */
public abstract class Funcionario {

	private String nome;
	private String CPF;
	private int dataNascimento;
	private double salario;
	
	/**
	 * Cria objeto da classe Funcionario.
	 * @param nome
	 * @param cPF
	 * @param dataNascimento
	 * @param salario
	 */
	public Funcionario(String nome, String cPF, int dataNascimento, double salario) {
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	/**
	 * Recupera nome do funcionário.
	 * @return O nome do funcionário.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atualiza o nome do funcionário.
	 * @param nome O novo nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Recupera o CPF do funcionário.
	 * @return CPF do funcionário
	 */
	public String getCPF() {
		return CPF;
	}

	/**
	 * Atualiza o CPF do funcionário.
	 * @param cPF O novo CPF
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	/**
	 * Recupera data de nascimento do funcionario.
	 * @return A data de nascimento do funcionário.
	 */
	public int getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Atualiza data de nascimento.
	 * @param dataNascimento A nova data de nascimento.
	 */
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Recupera salario.
	 * @return Salário do funcionário.
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Atualiza salario.
	 * @param salario O novo salario.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula bonificação do funcionário.
	 * @return Bonificação.
	 */
	public abstract double getBonificacao();
	
	/**
	 * Cria representação em String do funcionário.
	 */
	public String toString() {
		String funcionario = "Nome: " + nome;
		funcionario += "\nCPF: " + CPF;
		
		return funcionario;
	}
}
