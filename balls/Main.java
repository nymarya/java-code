import java.lang.Thread;

public class Main{

    public static void main(String [] args){
        BallDemo ball = new BallDemo();
        try{
	 Thread.sleep(10000);
	} catch( InterruptedException e) {}
	ball.drawFrame();
        ball.bounce(5);
    }
}
