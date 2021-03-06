package dominio;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private double preco;
    private String marca;
    private String descricao;
    private LocalDate dataFabricacao;

    /**
     * Construtor para objetos da classe Produto
     * @param nome Nome do produto.
     * @param preco Preco do produto.
     * @param marca Marca do produto.
     * @param descricao Descrição do produto.
     * @param dataFabricacao Data de fabricação do produto.
     */ 
    public Produto(String nome, double preco, String marca, String descricao, LocalDate dataFabricacao) {
	this.nome = nome;
	this.preco = preco;
	this.marca = marca;
	this.descricao = descricao;
	this.dataFabricacao = dataFabricacao;
    }

    /**
     * Recupera nome do produto.
     * @return Nome do produto.
     */ 
    public String getNome() {
	return nome;
    }

    /**
     * Atualiza nome do produto.
     * @param nome Nome do produto.
     */ 
    public void setNome( String nome) {
	this.nome = nome;
    }

    /**
     * Recupera preco do produto.
     * @return Preco do produto.
     */ 
    public double getPreco() {
	return preco;
    }

    /**
     * Atualiza preço do produto.
     * @param preco Preco do produto.
     */ 
    public void setPreco( double preco ) {
	this.preco = preco;
    }

    /**
     * Recupera marca do produto.
     * @return Marca do produto.
     */ 
    public String getMarca() {
	return marca;
    }

    /**
     * Atualiza marca do produto.
     * @param marca Marca do produto.
     */ 
    public void setMarca( String marca ) {
	this.marca = marca;
    }

    /**
     * Recupera descricao do produto.
     * @return Descrição do produto.
     */ 
    public String getDescricao() {
	return descricao;
    }

    /**
     * Atualiza descrição do produto.
     * @param descricao Descrição do produto.
     */ 
    public void setDescricao( String descricao ) {
	this.descricao = descricao;
    }

    /**
     * Recupera data de fabricação do produto.
     * @return Data de fabricação do produto.
     */ 
    public LocalDate getDataFabricacao() {
	return dataFabricacao;
    }

    /**
     * Atualiza data de fabricação do produto.
     * @param dataFabricacao Data de fabricação do produto.
     */ 
    public void setDataFabricacao( LocalDate dataFabricacao ) {
	this.dataFabricacao = dataFabricacao;
    }

}
