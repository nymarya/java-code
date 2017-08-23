public class Main{
	
    public static void main( String [] args ){
    	Carro carro = new Carro("Honda", "Honda City", 981282, 2.0, 4 );
    	Moto moto1 = new Moto("Yamaha", "Yamaha 125", 981252, "elétrica", 1.4f );

    	Locadora locadora = new Locadora();
    	locadora.adicionarVeiculo(carro);
    	locadora.adicionarVeiculo(moto1);

    	locadora.listar();
    }
}