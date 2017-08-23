public class Carro extends Veiculo {

    private int potencia;
    private int quantidadePortas;

    /**
     * Construtor para objetos da classe Carro
     * @param marca Marca do carro.
     * @param modelo Modelo do carro.
     * @param numeroPlaca Número da placa do carro.
     * @param potencia Potência do carro.
     * @param quantidadePortas Quantidade de portas do carro.
     */ 
    public Veiculo(String marca, String modelo, int numeroPlaca, int potencia, 
        int quantidadePortas) {
        super( marca, modelo, numeroPlaca);
        this.potencia = potencia;
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * Recupera potência do carro.
     * @return potência do carro.
     */ 
    public int getPotencia() {
        return potencia;
    }

    /**
     * Atualiza potência do carro.
     * @param potencia Potência do carro.
     */ 
    public void setPotencia( int potencia ) {
        this.potencia = potencia;
    }

    /**
     * Recupera quantidade de portas do carro.
     * @return Quantidade de portas do carro.
     */ 
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    /**
     * Atualiza quantidade de portas do carro.
     * @param quantidadePortas Quantidade de portas do carro.
     */ 
    public void setQuantidade( int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

}
