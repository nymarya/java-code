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

    /**
     * Recupera nome do cliente.
     * @return Nome do cliente
     */
    public String getNome(){
        return nome;
    }

    /**
     * Atualiza nome do cliente.
     * @param nome Novo nome.
     */
    public void setNome ( String nome ){
        this.nome = nome;
    }

    /**
     * Recupera CNH do cliente.
     * @return CNH do cliente
     */
    public int getCnh(){
        return cnh;
    }

    /**
     * Atualiza CNH do cliente.
     * @param cnh Novo CNH.
     */
    public void setCnh ( int cnh ){
        this.cnh = cnh;
    }
}