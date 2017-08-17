import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        BallDemo ball = new BallDemo();
        Scanner reader = new Scanner(System.in);
        String number = reader.next();

        while( number != null){
            ball.drawFrame();
            ball.bounce( Integer.parseInt(number) );
            number = reader.next();
        }
    }
}
