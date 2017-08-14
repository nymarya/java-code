import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private ArrayList<BouncingBall> balls;
    private ArrayList<Color> colors;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 1000, 900);
        myCanvas.setVisible(true);

        balls = new ArrayList<BouncingBall>();

        colors = new ArrayList<>(Arrays.asList(Color.blue, Color.lightGray, Color.gray, Color.darkGray, 
            Color.black, Color.red, Color.pink, Color.orange, Color.yellow, Color.green, Color.magenta, 
            Color.cyan));
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce(int number)
    {
        //Get canvas size
        Dimension canvasDimension = myCanvas.getSize();
        int ground = (int) (0.8 * canvasDimension.height);   // position of the ground line
        int xStart = (int) (0.1 * canvasDimension.width);    // x-start of the ground line
        int xLimit = (int) (0.9 * canvasDimension.width);   // x-limit of the ground line
        int yLimit = (int) ( 0.1 * canvasDimension.height );
        int yMin = (int) ( 0.4 * canvasDimension.height );

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        int pos = xStart;
        // crate and show the balls
        if( number > 0){
            while( number-- > 0 ){
                int yPos = ThreadLocalRandom.current().nextInt(yLimit, yMin);
                int diameter = ThreadLocalRandom.current().nextInt(10, 56); 
                int color = ThreadLocalRandom.current().nextInt(0, colors.size()); 
                BouncingBall newBall = new BouncingBall(xStart, yPos, diameter, colors.get(color), ground, myCanvas);
                yPos += 30;
                balls.add( newBall);
            }
        } else {
            return;
        }

        for( BouncingBall ball : balls){
            ball.draw();
        }

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            
            for( BouncingBall ball : balls){
                ball.move();
                // stop once ball has travelled a certain distance on x axis
                if(balls.indexOf(ball) == (balls.size()-1) && ball.getXPosition() >= xLimit) {
                    finished = true;
                }
            }

        }
        
        for( BouncingBall ball : balls){
            ball.erase();
        }
    }

    /**
     * Draw rectangle inside canvas.
     */
    public void drawFrame(){
        // the shape to draw and move
        Dimension canvasDimension = myCanvas.getSize();
        myCanvas.setForegroundColor(Color.white);
        Rectangle rect = new Rectangle(20, 20, canvasDimension.width-40, canvasDimension.height-40);

        // at the end of the move, draw and fill once more so that it remains visible
        myCanvas.fill(rect);
    }
    
}
