public class ContaBancaria{

    String cliente;
    int num_conta;
    double saldo;

    /** 
     * Contrutor para a classe ContaBancaria.
     * @param cliente Nome do cliente.
     * @param num_conta Número da conta bancária.
     * @param saldo Saldo da conta bancária.
     */
    public ContaBancaria( String cliente, int num_conta, double saldo){
	this.cliente = cliente;
	this.num_conta = num_conta;
	this.saldo = saldo;
    }

    /**
     * Recupera nome do cliente.
     * @return Nome do cliente.
     */
    public String getCliente() {
	return cliente;
    }

    /**
     * Atualiza cliente.
     * @param cliente Novo nome do cliente.
     */
    public void setCliente( String cliente ) {
	this.cliente = cliente;
    }

    /**
     * Recupera número da conta.
     * @return Número da conta bancária.
     */
    public int getNumConta() {
	return num_conta;
    }

    /** 
     * Atualiza número da conta.
     * @param num_conta Novo número da conta.
     */
    public void setNumConta( int num_conta ) {
	this.num_conta = num_conta;
    }

    /**
     * Recupera saldo da conta bancária.
     * @return Saldo da conta.
     */
    public double getSaldo() {
	return saldo;
    }

    /**
     * Atualiza saldo da conta bancária.
     * @param saldo Novo saldo bancário.
     */
    public void setSaldo( double saldo ) {
	this.saldo = saldo;
    }

    /**
     * Método para sacar dinheiro da conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar( double valor ){
        if( valor < 0 || saldo < valor ){
	   System.out.println("Valor inválido");
	}
	else{
	    saldo -= valor;
	}
    }

    /**
     * Deposita dinheiro na conta bancária.
     * @param valor Valor a ser depositado.
     */
    public void depositar( double valor ) {
	if( valor < 0 ){
	    System.out.println("Valor inválido.");
	} else { 
	    saldo += valor;
	}
    }

    /** 
     * Cria representação em String do objeto.
     * @return String que representa objeto.
     */
    public String toString() {
	return cliente + ": " + num_conta + "\n Saldo: R$" + saldo;
    }
}
