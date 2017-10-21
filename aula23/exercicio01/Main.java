
public class Main {

	public static void main(String[] args) {
		ContaBancaria cc = new ContaBancaria("Fulano", 1234, 1000.00);
		ContaBancaria cc1 = new ContaBancaria("Cicrano", 54321, 100.00);
		
		GerenciarContas gc = new GerenciarContas();
		
		gc.armazenarConta(cc);
		gc.armazenarConta(cc1);
		
		gc.depositarConta(54321, 400.00);
		gc.sacarConta(54321, 500.00);
		gc.sacarConta(1234, 400.00);
		gc.depositarConta(1234, 700.00);
		
		gc.extratoConta(1234);
		gc.extratoConta(54321);
		
		gc.depositarConta(54321,-400.00);
		gc.sacarConta(54321, 500.00);
		gc.sacarConta(1234, -400.00);
		gc.depositarConta(1234, -700.00);
		

	}

}
