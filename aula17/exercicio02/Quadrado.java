/**
 * A classe Quadrado representa um objeto Quadrado. Um
 * quadrado possui quatro lados com o mesmo tamanho.
 * 
 * @author Mayra D. de Azevedo
 * @version 19.09.2017
 */
public class Quadrado extends Retangulo {

	/**
	 * Constroi objeto para classe Quadrado.
	 * @param tamanho Tamanho do lado do quadrado.
	 */
	public Quadrado(float tamanho) {
		super(tamanho , tamanho);
	}

	/**
	 * Cria representação em String da classe Quadrado.
	 */
	public String toString() {
		String areaStr = String.format("%.2f", calcularArea());
		String perimetroStr = String.format("%.2f", calcularPerimetro());
		String alturaStr = String.format("%.2f", super.getAltura());
		String response = "QUADRADO";
		response += "\nTamanho: " + alturaStr;
		response += "\nArea: " + areaStr;
		response += "\nPerimetro: " + perimetroStr;
		
		return response;
	}

}
