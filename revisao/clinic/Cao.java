public class Cao extends Animal{
    private String dono;
    private String nomeCao;
    private String raca;

    /**
     * Construtor para objeto da classe Cao.
     */
    public Cao( ) {
    	super( );
    }

    /**
     * Retorna dono do cachorro.
     * @return Dono do cachorro.
     */
    public String getDono(){
    	return dono;
    }

    /**
     * Atualiza nome do dono.
     * @param dono Novo nome do dono.
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * Retorna nome do cachorro.
     * @return Nome do cachorro.
     */
    public String getNomeCao() {
    	return nomeCao;
    }

    /**
     * Atualiza nome do cachorro.
     * @param nomeCao Novo nome do cachorro.
     */
    public void setNomeCao( String nomeCao ) {
    	this.nomeCao = nomeCao;
    }

    /**
     * Retorna raça do cachorro.
     * @return Raça do cachorro.
     */
    public String getRaca() {
    	return raca;
    }

    /**
     * Atualiza raça do cachorro.
     * @param raca Raça do cachorro.
     */
    public void setRaca( String raca ) {
    	this.raca = raca;
    }
}
