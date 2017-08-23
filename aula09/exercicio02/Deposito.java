import java.util.ArrayList;

public class Deposito {

    private ArrayList<Produto> produtos;

    /**
     * Construtor para objetos da classe Deposito.
     */ 
    public Deposito() {
	produtos = new ArrayList<Produto>();
    }

    /**
     * Adiciona novo produto.
     * @param produto Novo produto.
     */ 
    public void adicionaProduto( Produto produto) {
	produtos.add(produto);
    }

    /**
     * Atualiza nome do produto.
     * @param nome Nome do produto.
     */ 
    public void removeProduto( Produto produto ) {
        int index = produtos.indexOf(produto);
	if( index != -1 ){
                produtos.remove(index);
        } else {
                System.out.println("Produto não encontrado!");
        }
    }

    /**
     * Recupera quantidade de produtos.
     * @return Quantidade de produtos no depósito.
     */ 
    public int quantidade() {
	return produtos.size();
    }

    /**
     * Verifica se depósito está vazio.
     * @return Verdadeiro se não há nenhum produto, falso caso contrário.
     */ 
    public boolean estahVazio( ) {
	return produtos.isEmpty();
    }

    /**
     * Recupera produto com maior valor.
     * @return Produto mais caro.
     */ 
    public Produto  maiorValor(){
	if( !estahVazio() ){
                Produto caro = produtos.get(1);
                for( Produto produto : produtos){
                        if( produto.getPreco() > caro.getPreco() )
                                caro = produto;
                }

                return caro;
        } else {
                System.out.println("Não há produtos no depósito!");
                return null;
        }
    }

}
