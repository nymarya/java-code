/**
 * The Japanese class represents a Japanese object. Information about the 
 * castle is stored and can be retrieved. 
 * 
 * @author Mayra D. Azevedo
 * @version 2017.08.29
 */
import java.util.concurrent.ThreadLocalRandom;


public class Japanese extends Castle {
    
    protected int numSamurais;

    /**
     * Construct object for class Japansese.
     * @param defense The defense of the Japanese.
     * @param location Position of the Japanese.
     * @param lifePoints Life points.
     * @param name Name of the castle.
     * @param numSamurais Number of samurais alive that defend the castle.
     */
    public Japanese( double defense, double location, double lifePoints, String name, int numSamurais) {
        super( defense, location, lifePoints, name);
        this.numSamurais = numSamurais;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString() {
        return super.toString() + "\n    Number of paladins: " + numSamurais;
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
        if( numSamurais > 0.0 ){
            int numWarriors = ThreadLocalRandom.current().nextInt(2,6);
            numSamurais -= numWarriors;
        } else {
            super.attack(d);
        }
    }
}
