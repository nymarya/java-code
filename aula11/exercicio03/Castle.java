/**
 * The Castle class represents a Castle object. Information about the 
 * castle is stored and can be retrieved. 
 * 
 * @author Mayra D. Azevedo
 * @version 2017.08.29
 */
public class Castle {
    
    protected double defense;
    protected double location;
    protected double lifePoints;
    protected String name;

    /**
     * Construct object for class Castle.
     * @param defense Castle's defense.
     * @param location Castle's position.
     * @param lifePoints Castle's life points.
     * @param name Name of the castle.
     */
    public Castle( double defense, double location, double lifePoints, String name) {
	this.defense = defense;
	this.location = location;
	this.lifePoints = lifePoints;
	this.name = name;
    }

    /**
     * Return life points of the castle.
     * @return Life points.
     */
    protected double getLifePoints(){
        return lifePoints;
    }

    /**
     * Return name of the castle.
     * @return Name of the castle.
     */
    protected String getName(){
        return name;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString() {
        return name + "\n    Location:" + location + "\n     Defense:"+ defense + 
        "\n     " + '\u2764' + lifePoints;
    }

    /**
     * Show information about the castle.
     */
    public void showStatus() {
	System.out.println( toString() );
        if( lifePoints == 0.0 ) {
            System.out.println( "Castle " + name + "is in ruins" );
        }
    }

    /**
     * Attack on the castle.
     */
    public void attack ( double d) {
        if( defense > 0.0 ){
            defense -= d;
        } else {
            lifePoints -= d;
        }
    }
}
