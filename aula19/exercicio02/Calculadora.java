package exercicio02;

import java.util.Stack;

public class Calculadora implements Calculavel {
		
	private Stack<Double> resultados;
	
	public Calculadora() {
		this.resultados = new Stack<Double>();
	}
	
	/**
	 * Adiciona resultado à pilha
	 * @param res Resultado da operação
	 * @return 
	 */
	private double addResult(double res ) {
		return resultados.push(res);
	}

	
	/**
	 * Adiciona dois números
	 * @param x Número a ser operado
	 * @param y Número a ser operado
	 * @return Adição dos dois operandos
	 */
	public double add(double x, double y) {
		return addResult(x + y );
	}
	
	/**
	 * Subtrai dois números.
	 * @param x Número a ser operado.
	 * @param y Número a ser operado.
	 * @return Segundo operado subtraido do primeiro. 
	 */
	public double sub(double x, double y) {
		return addResult( x - y );
	}
	
	/**
	 * Multiplica dois números
	 * @param x Número a ser operado.
	 * @param y Número a ser operado.
	 * @return Multiplicação entre operandos.
	 */
	public double mult(double x, double y) {
		return addResult(x * y);
	}
	
	/**
	 * Divide dois números.
	 * @param dividend Número a ser divido.
	 * @param divisor Número que irá dividir.
	 * @return Primeiro operado dividido pelo segundo.
	 */
	public double div(double dividend, double divisor) {
		return addResult( dividend / divisor );
	}
	
	/**
	 * Esvazia pilha e exibe calculos realizados.
	 * @return
	 */
	public void limpaCalc() {
		while( !resultados.empty()) {
			System.out.println(resultados.pop());
		}
	}
}
