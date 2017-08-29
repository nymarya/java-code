public class Main{

    public static void main( String [] args ) {
	ContaBancaria conta1 = new ContaEspecial("Joao", 1234, 200.00, 200.00);
        ContaBancaria conta2 = new ContaPoupanca("Maria",4321, 400.00, 12);

	Banco banco = new Banco("Novo banco");
	banco.addConta( conta1 );
	banco.addConta( conta2 );

        conta1.sacar( 200.00 );
	conta1.depositar(100.00);

	ContaPoupanca contaP = (ContaPoupanca) conta2;
        conta2.sacar(500.00);
	contaP.calcularNovoSaldo( 0.5);

	banco.listar();
    }
}
