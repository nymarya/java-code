import java.time.LocalDate;

public class Chocolate extends ProdutoNaoDuravel {

    private float porcentagemCacau;
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
    public Chocolate( String nome, double preco, String marca, String descricao, 
        LocalDate dataFabricacao, LocalDate dataValidade, String genero, 
        float porcentagemCacau, String ingredienteExtra ) {
	    super( nome, preco, marca, descricao, dataFabricacao, dataValidade, genero);
	    this.porcentagemCacau = porcentagemCacau;
	    this.ingredienteExtra = ingredienteExtra;
    }

    /**
     * Retorna porcentagem de cacau.
     * @return Porcentagem de cacau no chocolate.
     */ 
    public float getPorcentagemCacau(){
	   return porcentagemCacau;
    }

    /**
     * Atualiza porcentagem de cacau.
     * @param porcentagemCacau Porcentagem de cacau no chocolate.
     */ 
    public void setPorcentagemCacau( float porcentagemCacau ) {
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
}
