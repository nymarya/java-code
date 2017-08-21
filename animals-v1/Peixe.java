public class Peixe extends Animal{
	
	private String caracteristica;

	/**
	 * Constructs object of class Peixe.
	 * @param nome Animal's name.
	 * @param caracteristica Animal's details.
	 * @param cor Animal's color.
	 * @param comprimento Animal's size.
	 * @param velocidade Animal's speed.
	 */
	public Peixe( String nome, String caracteristica, String cor, int comprimento, float velocidade){
		super(nome, cor, "Mar", comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}

}