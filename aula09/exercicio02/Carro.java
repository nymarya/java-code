import java.time.LocalDate;

public class Carro extends ProdutoDuravel {

    private float cilidradas;

    public Carro( String nome, double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade, float cilindradas ) {
	super( nome, preco, marca, descricao, dataFabricacao, material, durabilidade);
	this.cilindradas = cilindradas;
    }

   
}
