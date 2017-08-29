/**
 * The European class represents an European object. Information about the 
 * castle is stored and can be retrieved. 
 * 
 * @author Mayra D. Azevedo
 * @version 2017.08.29
 */
import java.util.concurrent.ThreadLocalRandom;


public class European extends Castle {
    
    protected int numPaladins;

    /**
     * Construct object for class European.
     * @param defense The defense of the European.
     * @param location Position of the European.
     * @param lifePoints Life points.
     * @param name Name of the castle.
     * @param numPaladins Number of paladins alive that defend the castle.
     */
    public European( double defense, double location, double lifePoints, String name, int numPaladins) {
        super( defense, location, lifePoints, name);
        this.numPaladins = numPaladins;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString() {
        return super.toString() + "\n    Number of paladins: " + numPaladins;
    }

    /**
     * Show information about the castle.
     */
    public void showStatus() {
	System.out.println( toString() );
        if( super.getLifePoints() == 0.0 ) {
            System.out.println( "Castle " + super.getName() + "is in ruins" );
        }
    }

    /**
     * Attack on the castle.
     */
    public void attack ( double d) {
        if( numPaladins > 0.0 ){
            int numWarriors = ThreadLocalRandom.current().nextInt(2,6);
            numPaladins -= numWarriors;
        } else {
            super.attack(d);
        }
    }
}
