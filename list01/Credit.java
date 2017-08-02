public class Credit{

    int credits; //Valor dos creditos em centavos

    //Construtor padrão
    public Credit(){
        credits = 1000;
    }

    //Construtor padrão com valor inicial
    public Credit( int value){
        if( value >= 0){
            credits = value;
        } else {
            System.out.println("[ERROR] Trying to initialize class with negative value: " + value);
            credits = 0;
        }
    }

    //Recupera creditos
    public int getCredits(){
        return credits;
    }

    //Configura creditos 
    public void setCredits( int value ){
        credits = value;
    }

    //Recarrega creditos
    public void topUp(int value){
        if( value > 0){
            credits += value;
        } else {
            System.out.println("[ERROR] " + value + " is an invalid top up.");
        }       
    }

    //Consome creditos
    public void consume( int value){
        if( value < 0 ){
            System.out.println("[ERROR] Trying to consume negative value: " + value);
        } else if( credits - value >= 0){
            credits -= value;
        } else {
            System.out.println("[ERROR] Trying to consume " + value +" credits, but insufficient balance.");
        }
    }
}