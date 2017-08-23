import java.time.LocalDate;

public class Celular extends ProdutoDuravel {

    private int capacidade;
    private float pixelsCamera;
    private String cor;

    /**
     * Construtor para objetos da classe Celular
     * @param preco Preco do celular.
     * @param marca Marca do celular.
     * @param descricao Descrição do celular.
     * @param dataFabricacao Data de fabricação do celular.
     * @param material Material predominando no celular.
     * @param durabilidade Durabilidade do celular.
     * @param capacidade Capacidade de armazenamento do celular.
     * @param pixels Quantidade de megapixels da câmera do celular.
     * @param cor Cor do celular.
     */ 
    public Celular( double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade, int capacidade, float pixels, String cor ) {
	super( "Celular", preco, marca, descricao, dataFabricacao, material, durabilidade);
	this.capacidade = capacidade;
        this.pixelsCamera = pixels;
	this.cor = cor;
    }

    /**
     * Retorna capacidade do celular.
     * @return Capacidade de armazenamento do celular.
     */ 
    public int getCapacidade(){
	return capacidade;
    }

    /**
     * Atualiza capacidade do celular.
     * @param capacidade Capacidade de armazenamento do celular.
     */ 
    public void setCapacidade( int capacidade ) {
	this.capacidade = capacidade;
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
