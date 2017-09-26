package exercicio02;
/**
 * 
 * @author Mayra D. de Azevedo
 *
 */
public interface Calculavel {

	/**
	 * Adiciona dois números
	 * @param x Número a ser operado
	 * @param y Número a ser operado
	 * @return Adição dos dois operandos
	 */
	double add(double x, double y);
	
	/**
	 * Subtrai dois números.
	 * @param x Número a ser operado.
	 * @param y Número a ser operado.
	 * @return Segundo operado subtraido do primeiro. 
	 */
	double sub(double x, double y);
	
	/**
	 * Multiplica dois números
	 * @param x Número a ser operado.
	 * @param y Número a ser operado.
	 * @return Multiplicação entre operandos.
	 */
	double mult(double x, double y);
	
	/**
	 * Divide dois números.
	 * @param dividend Número a ser divido.
	 * @param divisor Número que irá dividir.
	 * @return Primeiro operado dividido pelo segundo.
	 */
	double div(double dividend, double divisor);
	
}
