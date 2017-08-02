public class Heater{

    int temperature;
    int min;
    int max;
    int increment;

    //Construtor padrão
    public Heater(int min_, int max_){
        temperature = 15;
        min = min_;
        max = max_;
        increment = 5;
    }

    //Recupera temperatura
    public int getTemperature(){
        return temperature;
    }

    public void warmer(){
        if( temperature + increment > max){
            System.out.println("[ERROR] Temperature can't be above "+max);
        } else{
            temperature += increment;
        }
    }

    //Diminui temperatura do aquecedor
    public void cooler(){
        if( temperature - increment < min ){
            System.out.println("[ERROR] Temperature can't be below "+min);
        } else {
            temperature -= increment;
        }
    }

    //Configura incremento
    public void setIncrement( int value ){
        if( value < 0){
            System.out.println("Invalid negative increment " + value);
        } else {
            increment = value;
        }
    }
}