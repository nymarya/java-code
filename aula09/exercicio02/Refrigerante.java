import java.time.LocalDate;

public class Refrigerante extends ProdutoNaoDuravel {

    private int mililitros;

    /**
     * Construtor para objetos da classe Refrigerante.
     * @param preco Nome do refrigerante.
     * @param preco Preço do refrigerante.
     * @param marca Marca do refrigerante.
     * @param descricao Descrição do refrigerante.
     * @param dataFabricacao Data de fabricação do refrigerante.
     * @param dataValidade Data de validade do refrigerante.
     * @param genero Genero do refrigerante
     * @param mililitros Quantidade de mililitros do refrigerante.
     */ 
    public Refrigerante( String nome, double preco, String marca, String descricao, 
        LocalDate dataFabricacao, LocalDate dataValidade, String genero, 
        int fatias, boolean bordaRecheada ) {
	    super( nome, preco, marca, descricao, dataFabricacao, dataValidade, genero);
	    this.mililitros = mililitros;
    }

    /**
     * Retorna quantidade de mililitros.
     * @return Quantidade de mililitros do refrigerante.
     */ 
    public int getMililitros(){
	   return mililitros;
    }

    /**
     * Atualiza quantidade de mililitros.
     * @param fatias Quantidade de mililitros do refrigerante.
     */ 
    public void setMililitros( int mililitros ) {
	   this.mililitros = mililitros;
    }
}
