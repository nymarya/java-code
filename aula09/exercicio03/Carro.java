public class Carro extends Veiculo {

    private double potencia;
    private int quantidadePortas;

    /**
     * Construtor para objetos da classe Carro
     * @param marca Marca do carro.
     * @param modelo Modelo do carro.
     * @param numeroPlaca Número da placa do carro.
     * @param potencia Potência do carro.
     * @param quantidadePortas Quantidade de portas do carro.
     */ 
    public Carro(String marca, String modelo, int numeroPlaca, double potencia, 
        int quantidadePortas) {
        super( marca, modelo, numeroPlaca);
        this.potencia = potencia;
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * Recupera potência do carro.
     * @return potência do carro.
     */ 
    public double getPotencia() {
        return potencia;
    }

    /**
     * Atualiza potência do carro.
     * @param potencia Potência do carro.
     */ 
    public void setPotencia( double potencia ) {
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
    public void setQuantidadePortas( int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * Imprime detalhes sobre o veiculo
     */
    public void print()
    {
        System.out.println("CARRO");
        super.print();
        System.out.println("Potência: " + potencia);
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println();
    }

}
