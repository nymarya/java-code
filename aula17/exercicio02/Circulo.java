import java.lang.Math;

/**
 * A classe Circulo representa um objeto Circulo.
 * Um círculo possui raio.
 * 
 * @author Mayra D. de Azevedo
 * @version 19.09.2017
 */
public class Circulo extends Forma{
	
	private float raio;

	/**
	 * Constroi objeto para classe Circulo.
	 * @param raio Raio do círculo.
	 */
	public Circulo(float raio) {
		this.raio = raio;
	}

	/**
	 * Calcula a area do circulo.
	 * @return A área do círculo.
	 */
	public float calcularArea(){
		return (float) Math.PI * raio * raio;
	}

	/**
	 * Calcula o perímetro do círculo.
	 * @return O perímetro do círculo.
	 */
	public float calcularPerimetro(){
		return 2 * (float) Math.PI * raio;
	}
	
	/**
	 * Cria representação em String da classe Circulo.
	 */
	public String toString() {
		String areaStr = String.format("%.2f", calcularArea());
		String perimetroStr = String.format("%.2f", calcularPerimetro());
		String raioStr = String.format("%.2f", raio);
		String response = "CIRCULO";
		response += "\nRaio: " + raioStr;
		response += "\nArea: " + areaStr;
		response += "\nPerimetro: " + perimetroStr;
		
		return response;
	}
}
