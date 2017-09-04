public class Animal {
	
	private String dono;
	private String nome;

	/**
	 * Construtor para classe Animal.
	 */
	public Animal( ){	}

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

    /**
     * Cria representação em String da classe.
     * @return String que representa o animal.
     */
    public String toString() {
        return nome + "\n    Dono: " + dono; 
    }
}