import java.util.ArrayList;
import java.util.Hashtable;
import java.time.LocalDate;
import java.util.Set;

public class Locadora{
	
    private ArrayList<Veiculo> veiculos;
    private Hashtable<Veiculo, Cliente> alugueis;

    /**
     * Construtor para a classe Locadora.
     */
    public Locadora() {
    	veiculos = new ArrayList<Veiculo>();
    	alugueis = new Hashtable<Veiculo,Cliente>();
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

    /**
     * Aluga veículo.
     * @param veiculo Veículo a ser alugado.
     * @param aluguel Instância de aluguel.
     */
    public void alugarVeiculo( Veiculo veiculo, Cliente cliente){
        if( alugueis.get( veiculo) == null){
            //Atualiza data de devolução
            veiculo.setDataDevolucao( LocalDate.now() );

            alugueis.put(veiculo, cliente);
        }
    }

    /**
     * Imprime recibo do aluguel.
     * @param veiculo Veículo alugado.
     */
    public void imprimirRecibo(Veiculo veiculo){
        Cliente cliente = alugueis.get(veiculo);

        System.out.println("Cliente: " + cliente.getNome() );
        System.out.println("Modelo: " + veiculo.getModelo() );
        System.out.println("Custo: " + veiculo.getCustoAluguel() );
        System.out.println("Data da devolução: " + veiculo.getDataDevolucao() );
    }

    /**
     * Imprime veículos alugados.
     */
    public void imprimirAlugados(){
        Set<Veiculo> chaves = alugueis.keySet();

        for( Veiculo veiculo : chaves){
            veiculo.print();
        }
    }

    /**
     * Devolver veículo alugado.
     */
    public void devolverVeiculo( Veiculo veiculo){
        LocalDate agora = LocalDate.now();
        if( agora.isAfter( veiculo.getDataDevolucao() )){
            double multa = 0.2 * veiculo.getCustoAluguel();
            System.out.println( "Multa: " + multa);
        } else {
            alugueis.remove(veiculo);
        }
    }
}