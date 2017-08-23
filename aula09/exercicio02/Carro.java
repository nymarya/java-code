import java.time.LocalDate;

public class Carro extends ProdutoDuravel {

    private int velocidade;
    private String cor;

    /**
     * Construtor para objetos da classe Carro
     * @param preco Preco do carro.
     * @param marca Marca do carro.
     * @param descricao Descrição do carro.
     * @param dataFabricacao Data de fabricação do carro.
     * @param material Material predominando no carro.
     * @param durabilidade Durabilidade do carro.
     * @param velocidade Velocidade do carro.
     * @param cor Cor do carro.
     */ 
    public Carro( double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade, int velocidade, String cor ) {
	super( "Carro", preco, marca, descricao, dataFabricacao, material, durabilidade);
	this.velocidade = velocidade;
	this.cor = cor;
    }

    /**
     * Retorna velocidade do carro.
     * @return Velocidade do carro.
     */ 
    public int getVelocidade(){
	return velocidade;
    }

    /**
     * Atualiza velocidade do carro.
     * @param velocidade Velocidade do carro.
     */ 
    public void setVelocidade( int velocidade ) {
	this.velocidade = velocidade;
    }

    /**
     * Recupera cor do carro.
     * @return cor do carro.
     */ 
    public String getCor() {
	return cor;
    }

    /**
     * Atualiza cor do carro.
     * @param cor Cor do carro.
     */ 
    public void setCor( String cor ) { 
	this.cor = cor;
    }
   
}
