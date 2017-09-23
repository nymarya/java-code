
public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Monica", "10209121100", 19091997, 200.00);
		Funcionario f2 = new Diretor("Chandler", "92839281234", 20101990, 300.0);
		Funcionario f3 = new Presidente("Phoebe", "19023456789", 2011990, 700.0);
		Funcionario f4 = new Gerente("Ross", "18234506708", 8101997, 500.0);
		Funcionario f5 = new Diretor("Joey", "82736518211", 21111980, 250.0);
		

		ControleDeBonificacao cb = new ControleDeBonificacao();
		cb.registraFuncionario(f1);
		cb.registraFuncionario(f2);
		cb.registraFuncionario(f3);
		cb.registraFuncionario(f4);
		cb.registraFuncionario(f5);
		
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f1);
		cb.registraBonificacao(f1);
		cb.registraBonificacao(f1);
		cb.registraBonificacao(f4);
		cb.registraBonificacao(f2);
		
		//Não recebe bonificacao
		cb.registraBonificacao(f5);
		
		System.out.println("Bonificados:");
		cb.listaBonificados();
		System.out.println("Não bonificados:");
		cb.listaNaoBonificados();

	}

}
