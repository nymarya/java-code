package aula26;

import java.util.List;

/**
 * Representa o sistema de reparo de buracos.
 * 
 * @author Mayra D. de Azevedo
 */
public class SARB {

	private List<Buraco> buracos;
	
	/**
	 * Registra buraco no banco
	 * @param buraco
	 */
	public void registraBuraco( Buraco buraco) {
		//adiciona buraco 
	}
	
	/**
	 * Registra dano associando o mesmo a algum buraco.
	 * @param buraco Buraco que provocou dano
	 * @param c Cidadão que relatou dano
	 * @param prejuizo Quantia em reais de prejuizo 
	 * @param tipoDano Tipo de dano causado
	 */
	public void registraDano( Buraco buraco, Cidadao c, int prejuizo, String tipoDano) {
		//cria arquivo de dano
		//associa a buraco
		
	}
	
	/**
	 * Busca buracos no endereço dado
	 * @param endereco
	 */
	public List<Buraco> buscaBuraco( String endereco) {
		//realiza busca
		
		//STUB
		return null;
	}
	
	/**
	 * Lista buracos registrados no sistema
	 */
	public void listarBuracos() {
		//lista e exibe informações
	}
}
