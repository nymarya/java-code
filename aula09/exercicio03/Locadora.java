import java.util.ArrayList;
import java.util.Hashtable;

public class Locadora{
	
    private ArrayList<Veiculo> veiculos;
    private Hashtable<Veiculo, Aluguel> alugueis;

    /**
     * Construtor para a classe Locadora.
     */
    public Locadora() {
    	veiculos = new ArrayList<Veiculo>();
    	alugueis = new Hashtable<Veiculo,Aluguel>();
    }

    /**
     * Lista todos os veículos.
     */
    public void listar(){
    	for( Veiculo veiculo : veiculos){
    	    veiculo.print();
    	}
    }

    /**
     * Adiciona novo veículo.
     * @param Novo veículo.
     */
    public void adicionarVeiculo( Veiculo veiculo){
    	veiculos.add( veiculo);
    }


}