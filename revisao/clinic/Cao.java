public class Cao extends Animal{
    private String raca;

    /**
     * Construtor para objeto da classe Cao.
     */
    public Cao( ) {
    	super( );
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

    /**
     * Cria representação em String da classe.
     * @return String que representa o cachorro.
     */
    public String toString() {
        return super.toString() + "\n    Raca: "+ raca; 
    }
}
