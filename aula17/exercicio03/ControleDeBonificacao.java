import java.util.HashMap;

public class ControleDeBonificacao {

	HashMap<Funcionario, Integer > funcionarios;
	
	private int bonificacoesGeral;

	/**
	 * Cria objeto para classe ControDeBonificacao.
	 */
	public ControleDeBonificacao() {
		this.funcionarios = new HashMap<Funcionario, Integer>();
		this.bonificacoesGeral = 0;
	}
	
	/**
	 * Registra funcionário.
	 * @param funcionario
	 */
	public void registraFuncionario(Funcionario funcionario ) {
		funcionarios.put(funcionario, 0);
	}
	
	/**
	 * Lista funcionários que foram bonificados.
	 */
	public void listaBonificados() {
		for (HashMap.Entry<Funcionario, Integer> entry : funcionarios.entrySet())
		{
			if( entry.getValue() > 0) {
				System.out.println(entry.getKey());
				System.out.println("Bonificações: " + entry.getValue());
			}
		    
		}
	}
	
	/**
	 * Lista funcionários que não ganharam bonificacao.
	 */
	public void listaNaoBonificados() {
		for (HashMap.Entry<Funcionario, Integer> entry : funcionarios.entrySet())
		{
			if( entry.getValue() == 0) {
				System.out.println(entry.getKey());
			}
		    
		}
	}
	
	/**
	 * Registra bonificação para funcionário.
	 * @param funcionario
	 */
	public void registraBonificacao(Funcionario funcionario) {
		int bonificacoes = funcionarios.get(funcionario);
		if( bonificacoes < 5 && bonificacoesGeral != 10 ) {
			//Atualia funcionario
			funcionarios.remove(funcionario);
			double salario = funcionario.getSalario() + funcionario.getBonificacao();
			funcionario.setSalario(salario);
			funcionarios.put(funcionario, ++bonificacoes);
			bonificacoesGeral++;
		}
		
	}
}
