import java.time.LocalDate;

public class Celular extends ProdutoDuravel {

    private int capacidade;
    private float megapixelsCamera;
    private String cor;

    /**
     * Construtor para objetos da classe Celular
     * @param nome Nome do celular.
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
    public Celular( String nome, double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade, int capacidade, float pixels, String cor ) {
	super( nome, preco, marca, descricao, dataFabricacao, material, durabilidade);
	this.capacidade = capacidade;
        this.megapixelsCamera = pixels;
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
     * Retorna quantidade de megapixels da câmera do celular.
     * @return Quantidade de megapixels da câmera do celular.
     */ 
    public int getMegapixelsCamera(){
        return capacidade;
    }

    /**
     * Atualiza quantidade de megapixels da câmera do celular.
     * @param pixels Quantidade de megapixels da câmera do celular.
     */ 
    public void setMegapixelsCamera( float pixels ) {
        this.megapixelsCamera = pixels;
    }

    /**
     * Recupera cor do celular.
     * @return Cor do celular.
     */ 
    public String getCor() {
	return cor;
    }

    /**
     * Atualiza cor do celular.
     * @param cor Cor do celular.
     */ 
    public void setCor( String cor ) { 
	this.cor = cor;
    }
   
}
