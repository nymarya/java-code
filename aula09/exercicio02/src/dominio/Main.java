import java.time.LocalDate;

public class Main {
	
	public static void main( String [] args ){

		LocalDate dataFabricacao = LocalDate.of(2017, 01, 01);
		LocalDate dataValidade = LocalDate.of(2018, 01, 01);

		Pizza pizza = new Pizza("3 queijos", 40.0, "Sadia", 
			"pizza com desconto", dataFabricacao, dataValidade, 
			"alimenticio", 8, true);

		Chocolate chocolate = new Chocolate("Chocolate meio amargo", 4.50, "Hershey's", 
			"promoçao de dia dos namorados", dataFabricacao, dataValidade, 
			"alimenticio", 42.00, "amendoim");

		Refrigerante refri = new Refrigerante("Guaraná Kuat", 10.0, "Coca-Cola", 
			"refrescante", dataFabricacao, dataValidade, 
			"alimenticio", 500);

		Livro livro = new Livro("A menina a que roubava livros", 80.0, "Intriseca", 
			"classico", dataFabricacao, "papel", 80, "Marcus Zurak", 3);

		Celular celular = new Celular("Galaxy S8", 3800.0, "Samsung", 
			"promoçao", dataFabricacao, "silicio", 4, 16, 12.6, "dourado");

		Carro carro = new Carro("Fiat Uno", 17000.0, "Fiat", "classico", 
			dataFabricacao, "metal", 20, 200, "preto");


		Deposito deposito = new Deposito();
		deposito.adicionaProduto(pizza);
		deposito.adicionaProduto(chocolate);
		deposito.adicionaProduto(refri);
		deposito.adicionaProduto(livro);
		deposito.adicionaProduto(celular);
		deposito.adicionaProduto(carro);

		System.out.println("Deposito possui " + deposito.quantidade() + " produtos ");
		Produto maisCaro = deposito.maiorValor();
		System.out.println("Produto mais caro: " + maisCaro.getNome());
	}
}