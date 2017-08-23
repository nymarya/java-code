import java.time.LocalDate;

public class Aluguel{
	
    private String nomeCliente;
    private String modeloVeiculo;
    private double custo;
    private LocalDate dataDevolucao;

    /**
     * Construtor para a classe Aluguel.
     * @param nomeCliente Nome do cliente.
     * @param modeloVeiculo Modelo do veículo alugado.
     * @param custo Custo do aluguel.
     * @param dataDevolucao Data da devolução do veículo.
     */
    public Aluguel( String nomeCliente, String modeloVeiculo, double custo,
    	LocalDate dataDevolucao){
    	this.nomeCliente = nomeCliente;
    	this.modeloVeiculo = modeloVeiculo;
    	this.custo = custo;
    	this.dataDevolucao = dataDevolucao;
    }
}