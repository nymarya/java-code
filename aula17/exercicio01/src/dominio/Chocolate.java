package dominio;

import java.time.LocalDate;

public class Chocolate extends ProdutoNaoDuravel {

	private double porcentagemCacau;
	private String ingredienteExtra;

	/**
	 * Construtor para objetos da classe Chocolate
	 * @param preco Nome do chocolate.
	 * @param preco Preço do chocolate.
	 * @param marca Marca do chocolate.
	 * @param descricao Descrição do chocolate.
	 * @param dataFabricacao Data de fabricação do chocolate.
	 * @param dataValidade Data de validade do chocolate.
	 * @param genero Genero do chocolate
	 * @param porcentagemCacau Porcentagem de cacau no chocolate.
	 * @param ingredienteExtra Ingrediente extra do chocolate.
	 */ 
	public Chocolate( int id, String nome, double preco, String marca, String descricao, 
			LocalDate dataFabricacao, LocalDate dataValidade, String genero, 
			double porcentagemCacau, String ingredienteExtra ) {
		super( id, nome, preco, marca, descricao, dataFabricacao, dataValidade, genero);
		this.porcentagemCacau = porcentagemCacau;
		this.ingredienteExtra = ingredienteExtra;
	}

	/**
	 * Retorna porcentagem de cacau.
	 * @return Porcentagem de cacau no chocolate.
	 */ 
	public double getPorcentagemCacau(){
		return porcentagemCacau;
	}

	/**
	 * Atualiza porcentagem de cacau.
	 * @param porcentagemCacau Porcentagem de cacau no chocolate.
	 */ 
	public void setPorcentagemCacau( double porcentagemCacau ) {
		this.porcentagemCacau = porcentagemCacau;
	}

	/**
	 * Retorna ingrediente adicional.
	 * @return Ingrediente extra do chocolate.
	 */ 
	public String getIngredienteExtra(){
		return ingredienteExtra;
	}

	/**
	 * Atualiza ingrediente adicional.
	 * @param ingredienteExtra Ingrediente adicional do chocolate.
	 */ 
	public void setIngredienteExtra( String ingredienteExtra) {
		this.ingredienteExtra = ingredienteExtra;
	}

	/**
	 * Imprime detalhes sobre produto.
	 */
	public void print() {
		super.print();
		System.out.println("Percentual de cacau: " + porcentagemCacau + "%");
		System.out.println("Ingrediente extra: " + ingredienteExtra);
	}
	
	/**
	 * Verifica se produto esta dentro da data de validade.
	 */
	public boolean estaValido( LocalDate data) {
		return super.getDataValidade().isBefore(data);
	}

	/**
     * Verifica se o produto está disponível para a venda.
     */
    public boolean estaDisponivel(){
        return this.estaValido(LocalDate.now());
    }
}
