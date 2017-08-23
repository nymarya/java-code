public class Moto extends Veiculo {

    private String tipoPartida;
    private float cilindradas;

    /**
     * Construtor para objetos da classe Carro
     * @param marca Marca do moto.
     * @param modelo Modelo da moto.
     * @param numeroPlaca Número da placa da moto.
     * @param tipoPartida Tipo da partida da moto.
     * @param cilindradas Cilindradas da moto.
     */ 
    public Veiculo(String marca, String modelo, int numeroPlaca, String tipoPartida, 
        float cilindradas) {
        super( marca, modelo, numeroPlaca);
        this.tipoPartida = tipoPartida;
        this.cilindradas = cilindradas;
    }

    /**
     * Recupera tipo da partida da moto.
     * @return tipo da partida da moto.
     */ 
    public String getTipoPartisa() {
        return tipoPartida;
    }

    /**
     * Atualiza tipo da partida da moto.
     * @param tipoPartida Tipo da partida da moto.
     */ 
    public void setTipoPartida( String tipoPartida ) {
        this.tipoPartida = tipoPartida;
    }

    /**
     * Recupera cilindradas da moto.
     * @return cilindradas da moto.
     */ 
    public float getCilindradas() {
        return cilindradas;
    }

    /**
     * Atualiza cilindradas da moto.
     * @param cilindradas Cilindradas da moto.
     */ 
    public void setCilindradas( float cilindradas) {
        this.cilindradas = cilindradas;
    }

}
