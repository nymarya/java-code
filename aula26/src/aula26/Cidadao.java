package aula26;

/**
 * Representa o cidadão que reporta buraco e danos causados
 * @author Mayra D. Azevedo
 *
 */
public class Cidadao {
	
	private SARB sistema;
	private String nome;
	private String endereco;
	private int numeroTelefone;
	
	/**
	 * Constrói objeto para classe Cidadao
	 * @param nome
	 * @param endereco
	 * @param numeroTelefone
	 */
	public Cidadao(String nome, String endereco, int numeroTelefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
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
	 * @return the numeroTelefone
	 */
	public int getNumeroTelefone() {
		return numeroTelefone;
	}



	/**
	 * @param numeroTelefone the numeroTelefone to set
	 */
	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}



	/**
	 * Registra buraco no sistema
	 * @param b
	 */
	public void relataBuraco( int id, String endereco, int tamanho, String localizacao) {
		//cria buraco
		//registra no sistema
		
	}
	
	/**
	 * Relata dano causado por algum buraco
	 * @param b Buraco que causou dano
	 * @param dano Tipo de dano causado
	 * @param prejuizo Quantia em reais do prejuízo
	 */
	public void relataDano( Buraco b, String dano, int prejuizo) {
		//registra dano no sistema
	}
}
