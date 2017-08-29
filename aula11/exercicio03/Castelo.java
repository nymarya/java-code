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
     * Show information about the castle.
     */
    public void showStatus() {
	
    }
}
