import java.util.List;
import java.util.Random;

/**
 * A simple model of a animal.
 * Rabbits age, move, breed, and die.
 * 
 * @author Mayra D. Azevedo
 * @version 2017
 */
public abstract class Animal implements Actor
{
	
    // Whether the animal is alive or not.
    private boolean alive;
    // The rabbit's position.
    private Location location;
    // The field occupied.
    private Field field;
    //The age of the animal.
    private int age;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();

    /**
     * Create a new animal. A animal may be created with age
     * zero (a new born).
     * 
     * @param randomAge If true, the animal will have a random age.
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Animal(Field field, Location location)
    {
        alive = true;
        age = 0;
        this.field = field;
        setLocation(location);
    }
    
    /**
     * Check whether the animal is alive or not.
     * @return true if the animal is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }
    
    /**
     * Indicate that the animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Return the animal's field.
     * @return The animal's field.
     */
    public Field getField()
    {
        return field;
    }
    
    /**
     * Place the rabbit at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    
    /**
     * Return the age of the animal.
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Update the age of the animal.
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
     * Increase the age. This could result in the fox's death.
     */
    protected void incrementAge()
    {
        age++;
        if(age > getMaxAge()) {
            setDead();
        }
    }
    
    /**
	 * Return max age of the animal.
	 * @return the max age.
	 */
	abstract protected int getMaxAge();
	
	/**
	 * Check if animal is in breeding age. 
	 * @return True if animal can breed, false otherwise.
	 */
	public boolean canBreed() {
		return age >= getBreedingAge();
	}
	
	/**
	 * Return breeding age of the animal.
	 * @return the breeding age.
	 */
	abstract protected int getBreedingAge();
	
	/**
     * Generate a number representing the number of births,
     * if it can breed.
     * @return The number of births (may be zero).
     */
    protected int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= getBreedingProbability()) {
            births = rand.nextInt(getMaxLitterSize()) + 1;
        }
        return births;
    }
	
	/**
	 * Return breeding probability of the animal.
	 * @return the breeding probability.
	 */
	abstract protected double getBreedingProbability();
	
	/**
	 * Return max litter size of the animal.
	 * @return the max litter size.
	 */
	abstract protected int getMaxLitterSize();

    /**
	 * Check if rabbit is active.
	 * @return True is rabbit is alive, false otherwise.
	 */
	@Override
	public boolean isActive() {

		return isAlive();
	}
}
