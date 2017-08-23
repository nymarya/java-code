import java.time.LocalDate;

public class Pizza extends ProdutoNaoDuravel {

    private int fatias;
    private boolean bordaRecheada;

    /**
     * Construtor para objetos da classe Pizza
     * @param preco Nome da pizza.
     * @param preco Preço da pizza.
     * @param marca Marca da pizza.
     * @param descricao Descrição da pizza.
     * @param dataFabricacao Data de fabricação da pizza.
     * @param dataValidade Data de validade da pizza.
     * @param genero Genero da pizza
     * @param fatias Quantidade de fatias.
     * @param bordaRecheada Pizza possui borda recheada.
     */ 
    public Pizza( String nome, double preco, String marca, String descricao, 
        LocalDate dataFabricacao, LocalDate dataValidade, String genero, 
        int fatias, boolean bordaRecheada ) {
	    super( nome, preco, marca, descricao, dataFabricacao, dataValidade, genero);
	    this.fatias = fatias;
	    this.bordaRecheada = bordaRecheada;
    }

    /**
     * Retorna quantidade de fatias da pizza.
     * @return Quantitdade de fatias da pizza.
     */ 
    public int getFatias(){
	   return fatias;
    }

    /**
     * Atualiza quantidade de fatias da pizza.
     * @param fatias Quantidade de fatias da pizza.
     */ 
    public void setFatias( int fatias ) {
	   this.fatias = fatias;
    }

    /**
     * Retorna se pizza possui borda recheada.
     * @return Verdadeiro se pizza possui borda recheada, falso caso contrário.
     */ 
    public boolean getBordaRecheada(){
        return bordaRecheada;
    }

    /**
     * Atualiza informçaão sobre borda recheada.
     * @param bordaRecheada Valor que informa se pizza possui borda recheada.
     */ 
    public void setBordaRecheada( boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
}
