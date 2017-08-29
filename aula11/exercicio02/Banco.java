import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList< ContaBancaria > contas;

    /** 
     * Constrói objeto da classe Banco.
     * @param nome Nome do banco.
     */
    public Banco ( String nome ) {
	this.nome = nome;
	this.contas = new ArrayList< ContaBancaria >();
    }

    /**
     * Recupera nome do banco.
     * @return nome do banco.
     */
    public String getNome() {
	return nome;
    }

    /**
     * Atualiza nome do banco.
     * @param nome Novo nome.
     */
    public void setNome( String nome ) {
	this.nome = nome;
    }

    /**
     * Adiciona conta ao banco.
     * @param conta Conta que será adicionada.
     */
    public void addConta( ContaBancaria conta ) {
	contas.add( conta );
    }

    /**
     * remove conta do banco.
     * @param conta Conta que será removida.
     */
    public void removeConta( ContaBancaria conta ) {
	contas.remove( conta );
    }

    /**
     * Imprime detalhes de todas as contas registradas no banco.
     */
    public void listar() {
	for( ContaBancaria conta : contas ) {
	    System.out.println( conta );
        }
    }
}
