/**
 * The Rectangle class represents a Rectangle object. A rectangle
 * have height and width attributes.
 * A classe Retângulo representa um objeto Retângulo.
 * Um retângulo possui altura e largura.
 * 
 * @author Mayra D. de Azevedo
 * @version 19.09.2017
 */
public class Retangulo extends Forma{
	
	private float altura;
	private float largura;

	/**
	 * Constrói objeto para classe Retangulo
	 * @param altura Altura do retângulo.
	 * @param largura Largura do retângulo
	 */
	public Retangulo(float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	/**
	 * Recupera altura.
	 * @return Altura do retângulo.
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Atualiza altura do retângulo.
	 * @param altura A nova altura.
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * Recupera largura do retângulo.
	 * @return A largura.
	 */
	public float getLargura() {
		return largura;
	}

	/**
	 * Atualiza largura do retângulo.
	 * @param largura A nova largura.
	 */
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	/**
	 * Calcula área do retâgulo.
	 * @return A area do retângulo.
	 */
	public float calcularArea(){
		return altura * largura;
	}

	/**
	 * Calcula perímetro do retângulo.
	 * @return O perímetro do retângulo.
	 */
	public float calcularPerimetro(){
		return 2 * altura + 2 * largura;
	}
	
	/**
	 * Cria representação em String da classe Retangulo.
	 */
	public String toString() {
		String areaStr = String.format("%.2f", calcularArea());
		String perimetroStr = String.format("%.2f", calcularPerimetro());
		String alturaStr = String.format("%.2f", altura);
		String larguraStr = String.format("%.2f", largura);
		String response = "RETANGULO\n";
		response += "Altura: " + alturaStr;
		response += "\nLargura: " + larguraStr;
		response += "\nArea: " + areaStr;
		response += "\nPerimetro: " + perimetroStr;
		
		return response;
	}
}
