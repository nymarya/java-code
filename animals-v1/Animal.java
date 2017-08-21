public class Animal {
	
	private String nome;
	private int compormento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;

	/**
	 * Constructor for objects os class Animal
	 * @param nome Animal's name.
	 * @param cor Animal's color.
	 * @param ambiente Animal's habitat.
	 * @param comprimento Animal's size.
	 * @param velocidade Animal's speed.
	 * @param patas Number of paws of the animal.
	 */
	 public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas){
	 	this.nome = nome;
	 	this.cor = cor;
	 	this.ambiente = ambiente;
	 	this.comprimento = comprimento;
	 	this.velocidade = velocidade;
	 	this.patas = patas;
	 }

	 /**
	  * Update animal's name.
	  * @param nome New name.
	  */
	 public void alteraNome( String nome){
	 	this.nome = nome;
	 }

	 /**
	  * Update animal's size.
	  * @param comprimento New size.
	  */
	 public void alteraComprimento(int comprimento){
	 	this.comprimento = comprimento;
	 }

	 /**
	  * Update number of paws of the animal.
	  * @param patas New number of paws.
	  */
	 public void alteraPatas(int patas){
	 	this.patas = patas;
	 }

	 /**
	  * Update color.
	  * @param cor New color.
	  */

	public void alteraCor( String cor){
		this.cor = cor;
	}

	/**
	 * Update animal's habitat.
	 * @param ambiente New habitat.
	 */
	public void alteraAmbiente( String ambiente){
		this.ambiente = ambiente;
	}

	/**
	 * Update animal's speed.
	 * @param velocidade New speed.
	 */
	public void alteraVelocidade(float velocidade){
		this.velocidade = velocidade;
	}

	public void dados(){
		System.out.println("Animal: " + nome);
		System.out.println("Comprimento: " + comprimento + " cm");
		System.out.println("Patas:" + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade: "+ velocidade + "m/s");
	}
}