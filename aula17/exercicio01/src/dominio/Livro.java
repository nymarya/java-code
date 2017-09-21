package dominio;

import java.time.LocalDate;

public class Livro extends ProdutoDuravel {

	private String autor;
	private int edicao;

	/**
	 * Construtor para objetos da classe Livro.
	 * @param nome Nome do livro.
	 * @param preco Preco do livro.
	 * @param marca Marca do livro.
	 * @param descricao Descrição do livro.
	 * @param dataFabricacao Data de fabricação do livro.
	 * @param material Material predominante no livro.
	 * @param durabilidade Durabilidade do livro.
	 * @param autor Autor do livro.
	 * @param edicao Edição do livro.
	 */ 
	public Livro( int id, String nome, double preco, String marca, String descricao, LocalDate dataFabricacao, 
			String material, int durabilidade, String autor, int edicao ) {
		super(id, nome, preco, marca, descricao, dataFabricacao, material, durabilidade);
		this.autor = autor;
		this.edicao = edicao;
	}

	/**
	 * Retorna edição do livro.
	 * @return Edição do livro.
	 */ 
	public int getEdicao(){
		return edicao;
	}

	/**
	 * Atualiza edicao do livro.
	 * @param edicao Edição do carro.
	 */ 
	public void setEdicao( int edicao ) {
		this.edicao = edicao;
	}

	/**
	 * Recupera autor do livro.
	 * @return Autor do carro.
	 */ 
	public String getAutor() {
		return autor;
	}

	/**
	 * Atualiza autor do livro.
	 * @param autor Autor do carro.
	 */ 
	public void setAutor( String autor ) { 
		this.autor = autor;
	}

	/**
	 * Imprime detalhes sobre produto.
	 */
	public void print() {
		super.print();
		System.out.println("Edição: " + edicao);
		System.out.println("Autor: " + autor);
	}
	
	/**
	 * Verifica se produto é eletro eletronico.
	 * @return Verdadeiro se produto é eletro eletronico.
	 */
	public boolean ehEletro() {
		return false;
	}

}
