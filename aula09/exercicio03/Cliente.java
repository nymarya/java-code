public class Cliente {

    private String nome;
    private int cnh;	

    /**
     * Construtor para objetos da classe Cliente.
     * @param nome Nome do cliente
     * @param cnh Número da carteira de motorista do cliente.
     */
    public Cliente( String nome, int cnh){
        this.nome = nome;
        this.cnh = cnh;
    }
}