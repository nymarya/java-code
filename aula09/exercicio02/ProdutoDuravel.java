import java.time.LocalDate;

public class ProdutoDuravel extends Produto{

    private String materialPredominante;
    private int durabilidade;

    public ProdutoDuravel( String nome, double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade ) {
	super( nome, preco, marca, descricao, dataFabricacao);
	this.materialPredominante = material;
	this.durabilidade = durabilidade;
    }

    public String getMaterialPredominante(){
	return materialPredominante;
    }

    public void setMaterialPredominante( String material ){
	this.materialPredominante = material;
    }

    public int getDurabilidade() {
	return durabilidade;
    }

    public void setDurabilidade( int durabilidade) { 
	this.durabilidade = durabilidade;
    }
}
