import java.time.LocalDate;

public class Livro extends ProdutoDuravel {

    private String autor;
    private String titulo;

    /**
     * Construtor para objetos da classe Livro.
     * @param nome Nome do livro.
     * @param preco Preco do livro.
     * @param marca Marca do livro.
     * @param descricao Descrição do livro.
     * @param dataFabricacao Data de fabricação do livro.
     * @param material Material predominante no livro.
     * @param durabilidade Durabilidade do livro.
     * @param autor Autor do carro.
     * @param titulo Titulo do carro.
     */ 
    public Livro( Strin nome, double preco, String marca, String descricao, LocalDate dataFabricacao, String material, int durabilidade, String autor, String titulo ) {
	super( nome, preco, marca, descricao, dataFabricacao, material, durabilidade);
	this.autor = autor;
	this.titulo = titulo;
    }

    /**
     * Retorna titulo do livro.
     * @return Titutlo do livro.
     */ 
    public String getTitulo(){
	return titulo;
    }

    /**
     * Atualiza titulo do livro.
     * @param titulo Titulo do carro.
     */ 
    public void setTitulo( String titulo ) {
	this.titulo = titulo;
    }

    /**
     * Recupera autor do livro.
     * @return Autor do carro.
     */ 
    public String getAutor() {
	return autor;
    }

    /**
     * Atualiza autor do livro.
     * @param autor Autor do carro.
     */ 
    public void setAutor( String autor ) { 
	this.autor = autor;
    }
   
}
