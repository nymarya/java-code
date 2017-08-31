public class Animal {
	
	private String dono;
	private String nome;

	/**
	 * Construtor para classe Animal.
	 * @param dono Dono do animal.
	 * @param nome Nome do animal.
	 */
	public Animal( String dono, String nome ){
	    this.dono = dono;
	    this.nome = nome;
	}

	/**
     * Retorna dono do animal.
     * @return Dono do animal.
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
     * Retorna nome do animal.
     * @return Nome do animal.
     */
    public String getNome() {
    	return nome;
    }

    /**
     * Atualiza nome do animal.
     * @param nome Novo nome do animal.
     */
    public void setNome( String nome ) {
    	this.nome = nome;
    }
}