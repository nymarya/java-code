import java.time.LocalDate;

public class Veiculo {

    private String marca;
    private String modelo;
    private int numeroPlaca;

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

}
