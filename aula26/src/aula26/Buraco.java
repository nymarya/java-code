package aula26;

/**
 * Representa o buraco que precisa ser reparado.
 * 
 * @author Mayra D. Azevedo
 */
public class Buraco {

	private int id;
	//endereço da rua
	private String endereco;
	//tamanho de 1 a 10
	private int tamanho;
	//localização da rua (no meio da rua, na calçada, etc)
	private String localizacao;
	/**
	 * @param id
	 * @param endereco
	 * @param tamanho
	 * @param localizacao
	 */
	public Buraco(int id, String endereco, int tamanho, String localizacao) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.tamanho = tamanho;
		this.localizacao = localizacao;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the tamanho
	 */
	public int getTamanho() {
		return tamanho;
	}
	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	/**
	 * @return the localizacao
	 */
	public String getLocalizacao() {
		return localizacao;
	}
	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
	/**
	 * Retorna a prioridade de reparo de acordo com o tamanho do buraco.
	 * @return prioridade do reparo.
	 */
	public String getPrioridadeReparo() {
		//se tamanho entre 1 e 4, baixa
		//se tamanho entre 5 e 7, media
		//se tamnho entre 8 e 10, alta
		
		//STUB
		String prioridade = "alta";
		return prioridade;
	}
	
}
