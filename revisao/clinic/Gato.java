public class Gato extends Animal {
	
	private String pelagem;

	/**
	 * Construtor para objeto da classe Gato.
	 * @param dono Dono do gato.
	 * @param nome Nome do gato.
	 * @param pelagem Pelagem do gato.
	 */
	public Gato( String dono, String nome, String pelagem ) {
	    super( dono, nome);
	    this.pelagem = pelagem;
	}

	/**
	 * Recupera pelagem do gato.
	 * @return Pelagem do gato.
	 */
	public String getPelagem() {
	    return pelagem;
	}

	/**
	 * Atualiza pelagem do gato.
	 * @param pelagem Pelagem do gato.
	 */
	public void setPelagem( String pelagem ) {
	    this.pelagem = pelagem;
	}
}