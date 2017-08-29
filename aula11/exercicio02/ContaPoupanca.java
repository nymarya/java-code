public class ContaPoupanca extends ContaBancaria{
   
    private int diaDeRendimento;
    
    /**
     * Constrói objeto da classe ContaPoupanca.
     * @param cliente Nome do cliente.
     * @param num_conta Número da conta poupança.
     * @param saldo Saldo da conta poupança.
     * @param diaDeRendimento Dia de rendimento da poupança.
     */
    public ContaPoupanca( String cliente, int num_conta, double saldo, int diadeRendimento){
	super( cliente, num_conta, saldo);
	this.diaDeRendimento = diaDeRendimento;
    }

    /** 
     * Recupera dia de rendimento da poupança.
     * @return Dia de rendimento.
     */
    public int getDiaDeRendimento() {
	return diaDeRendimento;
    }

    /**
     * Atualiza dia de rendimento da poupança.
     * @param diaDeRendimento Novo dia.
     */
    public void setDiaDeRendimento( int diaDeRendimento ){
	this.diaDeRendimento = diaDeRendimento;
    }

    /**
     * Calcula novo saldo de acordo com taxa de rendimento.
     * @param taxa Taxa de rendimento da poupança.
     */
    public void calcularNovoSaldo( double taxa ){
	double novoSaldo = super.getSaldo() + taxa * super.getSaldo();
	super.setSaldo( novoSaldo );
    }

    /** 
     * Cria representação em String do objeto de ContaPoupanca.
     * @return Objeto representado no formato de String.
     */
    public String toString() {
	return super.getCliente()+": "+super.getNumConta()+"\n Saldo: R$"+ super.getSaldo();
    }
}
