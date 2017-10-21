import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {

	private List<ContaBancaria> contas;

	/**
	 * Controi objeto para classe GerenciarContas
	 */
	public GerenciarContas() {
		contas = new ArrayList<ContaBancaria>();
	}
	
	public void armazenarConta( ContaBancaria c) {
		contas.add(c);
	}
	
	/**
	 * Remove conta bancária.
	 * @param numeroConta Numero da conta
	 */
	public void removerConta( int numeroConta) {
		for(int i = 0; i< contas.size(); i++) {
			if(contas.get(i).getNumeroConta() == numeroConta) {
				contas.remove(i);
				return;
			}
		}
	}
	
	/**
	 * Deposita dinheiro em uma conta
	 * @param numeroConta Numero da conta a ser beneficiada
	 * @param valor Valor a ser depositado
	 */
	public void depositarConta(int numeroConta, double valor) {
		for(int i = 0; i< contas.size(); i++) {
			if(contas.get(i).getNumeroConta() == numeroConta) {
				try {
					contas.get(i).depositar(valor);
					return;
				} catch( ParametroException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Saca dinheiro em uma conta
	 * @param numeroConta Numero da conta a ser modificada
	 * @param valor Valor a ser depositado
	 */
	public void sacarConta(int numeroConta, double valor) {
		for(int i = 0; i< contas.size(); i++) {
			if(contas.get(i).getNumeroConta() == numeroConta) {
				try {
					contas.get(i).sacar(valor);
					return;
				} catch( ParametroException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Consulta saldo de uma conta
	 * @param numeroConta Numero da conta a ser consultada
	 */
	public void extratoConta(int numeroConta) {
		for(int i = 0; i< contas.size(); i++) {
			if(contas.get(i).getNumeroConta() == numeroConta) {
				contas.get(i).extrato();
				return;
			}
		}
	}
	
}
