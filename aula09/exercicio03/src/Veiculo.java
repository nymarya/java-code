import java.time.LocalDate;

public class Veiculo {

    private String marca;
    private String modelo;
    private int numeroPlaca;
    private LocalDate dataDevolucao;

    /**
     * Construtor para objetos da classe Veiculo
     * @param marca Marca do veiculo.
     * @param modelo Modelo do veículo.
     * @param numeroPlaca Número da placa do veículo.
     */ 
    public Veiculo(String marca, String modelo, int numeroPlaca) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
        this.dataDevolucao = LocalDate.now();
    }

    /**
     * Recupera marca do veículo.
     * @return Marca do veículo.
     */ 
    public String getMarca() {
        return marca;
    }

    /**
     * Atualiza marca do veículo.
     * @param marca Marca do veículo.
     */ 
    public void setMarca( String marca ) {
        this.marca = marca;
    }

    /**
     * Recupera modelo do veículo.
     * @return modelo do veículo.
     */ 
    public String getModelo() {
        return modelo;
    }

    /**
     * Atualiza modelo do veículo.
     * @param modelo Modelo do veículo.
     */ 
    public void setModelo( String modelo) {
        this.modelo = modelo;
    }

    /**
     * Recupera número da placa do veículo.
     * @return Número da placa do veículo.
     */ 
    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    /**
     * Atualiza número da placa do veículo.
     * @param numeroPlaca Número da placa do veículo.
     */ 
    public void setNumeroPlaca( int numeroPlaca ) {
        this.numeroPlaca = numeroPlaca;
    }

    /**
     * Imprime detalhes sobre o veiculo
     */
    public void print()
    {
        System.out.println( "Modelo: " + modelo);
        System.out.println( "Marca: " + marca);
        System.out.println( "Placa: " + numeroPlaca);
    }

    /**
     * Retorna custo de aluguel.
     * @return Custo do aluguel de acordo com veículo.
     */
    public double getCustoAluguel(){
        return 0.0;
    }

    /**
     * Retorna data de devolução do veículo.
     * @return Data de devolução.
     */
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }

    /**
     * Atualiza data de devolução do veículo.
     * @param data Data de devolução.
     */
    public void setDataDevolucao( LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

}
