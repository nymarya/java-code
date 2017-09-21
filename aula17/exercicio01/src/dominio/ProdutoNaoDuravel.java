package dominio;

import java.time.LocalDate;

public abstract class ProdutoNaoDuravel extends Produto {

	private LocalDate dataValidade;
	private String genero;

	/**
	 * Construtor para objetos da classe ProdutoNaoDuravel
	 * @param preco Nome do produto.
	 * @param preco Preco do produto.
	 * @param marca Marca do produto.
	 * @param descricao Descrição do produto.
	 * @param dataFabricacao Data de fabricação do produto.
	 * @param dataValidade Data de validade do produto.
	 * @param genero Genero do produto
	 */ 
	public ProdutoNaoDuravel( int id, String nome, double preco, String marca, String descricao, LocalDate dataFabricacao, LocalDate dataValidade, String genero ) {
		super(id, nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}

	/**
	 * Recupera data de validade.
	 * @return Data de validade do produto.
	 */
	public LocalDate getDataValidade() {
		return dataValidade;
	}

	/**
	 * Atualiza data de validade.
	 * @param dataValidade Data de validade do produto.
	 */
	public void setDataValidade( LocalDate dataValidade ) {
		this.dataValidade = dataValidade;
	}

	/**
	 * Recupera gênero.
	 * @return Gênero do produto.
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Atualiza gênero.
	 * @param genero Gênero do produto.
	 */
	public void setGenero( String genero) {
		this.genero = genero;
	}
	
	/**
	 * Imprime detalhes sobre produto.
	 */
	public void print() {
		super.print();
		System.out.println("Data de validade: " + dataValidade);
		System.out.println("Genero: " + genero);
	}
	
	/**
	 * Verifica se produto esta dentro da data de validade.
	 */
	public abstract boolean estaValido( LocalDate data);
	
}
