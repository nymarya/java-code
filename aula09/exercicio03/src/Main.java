public class Main{
	
    public static void main( String [] args ){
    	Carro carro = new Carro("Honda", "Honda City", 981282, 2.0, 4 );
    	Moto moto1 = new Moto("Yamaha", "Yamaha 125", 981252, "elétrica", 1.4f );

    	Locadora locadora = new Locadora();
    	locadora.adicionarVeiculo(carro);
    	locadora.adicionarVeiculo(moto1);

		locadora.listar();

		Cliente cliente1 = new Cliente("Maria", 3983239);
		Cliente cliente2 = new Cliente("Joao", 9283933);

		locadora.alugarVeiculo( carro, cliente1);
		locadora.alugarVeiculo( moto1, cliente2);

		locadora.devolverVeiculo( carro );

		locadora.imprimirAlugados();

    	
    }
}