public class ContaEspecial extends ContaBancaria{

    private double limite;

    /**
     * Constrói objeto da classe ContaEspecial.
     * @param cliente Nome do cliente.
     * @param num_conta Número da conta especial.
     * @param saldo Saldo da conta especial.
     * @param limite Limite da conta especial..
     */
    public ContaEspecial( String cliente, int num_conta, double saldo, double limite){
	super( cliente, num_conta, saldo);
	this.limite = limite;
    }

    /** 
     * Recupera limite da conta especial.
     * @return Limite da conta.
     */
    public double getLimite() {
	return limite;
    }

    /** 
     * Atualiza limite da conta.
     * @param limite Novo limite.
     */
    public void setLimite ( double limite ) {
	this.limite = limite;
    }

    /** 
     * Saca dinheiro da conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar( double valor ) {
	if ( valor < saldo + limite ) {
	    double novoSaldo = super.getSaldo();
	    super.setSaldo( novoSaldo - valor );
        } else {
	    System.out.println("Valor inválido.");
	}
    }

    /** 
     * Cria representação em String do objeto.
     * @return Objeto representado no formato de string.
     */
    public String toString() {
	return super.toString() + "\n Limite: R$ " + limite;
    }
}
