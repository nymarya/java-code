import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Dimension;

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
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line
        int xStart = 50;    // x-start of the ground line
        int xLimit = 550;   // x-limit of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(xStart, 50, 16, Color.blue, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(xStart + 20, 80, 20, Color.red, ground, myCanvas);
        ball2.draw();

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= xLimit && ball2.getXPosition() >= xLimit) {
                finished = true;
            }
        }
        ball.erase();
        ball2.erase();
    }

    /**
     * Draw rectangle inside canvas.
     */
    public void drawFrame(){
        myCanvas.setForegroundColor(Color.red);
        // the shape to draw and move
        int xPos = 10;
        Rectangle rect = new Rectangle(20, 20, WIDTH-40, HEIGHT-40);

        // at the end of the move, draw and fill once more so that it remains visible
        myCanvas.fill(rect);
    }
    
}
