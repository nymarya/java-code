
public class ContaBancaria {
	
	private String nome;
	private int numeroConta;
	private double saldo;
	
	/**
	 * Controi objeto para classe ContaBancaria
	 * @param nome Nome do cliente
	 * @param conta Numero da conta
	 * @param saldo_inicial Saldo inicial da conta
	 */
	public ContaBancaria(String nome, int conta, double saldo_inicial) {
		this.nome = nome;
		this.numeroConta = conta;
		this.saldo = saldo_inicial;
	}
	
	/*
	 * Imprime extrato da conta.
	 */
	public void extrato() {
		System.out.println("\tEXTRATO");
		System.out.println("Nome: " + this.nome);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.printf("Saldo atual: %.2f\n", this.saldo);
	}
	
	/**
	 * Realiza saque na conta
	 * @param valor Valor a ser retirado
	 * @throws ParametroException 
	 */
	public void sacar(double valor) throws ParametroException {
		if( valor < 0) {
			throw new ParametroException("Parâmetro inválido: valor negativo");
		}
		else if (valor > saldo) {
			throw new ParametroException("Parâmetro inválido: valor solicitado maior que o saldo disponível");
		}
		else if( saldo >= valor) {
			saldo -= valor;
			System.out.println("Retirado: R$"+valor);
			System.out.println("Novo saldo: R$"+saldo+"\n");
		}
		
	}
	
	/**
	 * Deposita dinheiro na conta
	 * @param valor Valor a ser depositado
	 * @throws ParametroException 
	 */
	public void depositar(double valor ) throws ParametroException {
		if( valor < 0) {
			throw new ParametroException("Parâmetro inválido: valor negativo");
		} else {
			saldo += valor;
			System.out.println("Depositado: R$"+valor);
			System.out.println("Novo saldo: R$"+saldo+"\n");
		}
	}

	/**
	 * Retorna nome do cliente
	 * @return O nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera nome do cliente
	 * @param nome O novo nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna numero da conta
	 * @return O numero da conta
	 */
	public int getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Atualiza numero da conta
	 * @param numeroConta O novo numero da conta 
	 */
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Retorna o saldo.
	 * @return o saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
