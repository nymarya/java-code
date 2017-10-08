package fishsim;

import java.util.List;

/**
 * This is the superclass for all kinds of fish
 * 
 * @author Mayra Dantas de Azevedo 
 * @version 03/10/2017
 */
public abstract class Fish
{
	protected Cell cell;
	protected double weight;
	protected double viableWeight;
	protected double weightReduce;
	protected double breedWeight;
	protected int breedAge;
	protected int maxAge;
	protected int status; // how high up the food chain
	protected int age = 0;
	protected int step = -1;

	/**
	 * Create a new fish
	 * @param cell fish location
	 * @param params parameters for the new fish
	 */
	public Fish(Cell cell, FishParams params)
	{
		this.cell = cell;
		weight = params.getInitWeight();
		viableWeight = params.getViableWeight();
		weightReduce = params.getWeightReduce();
		breedWeight = params.getBreedWeight();
		breedAge = params.getBreedAge();
		maxAge = params.getMaxAge();
		cell.setFish(this);
		age = 0;
	}

	/**
	 * Create a new fish of the same kind
	 * @param cell - location of spawned fish
	 * @return the fish spawned
	 */
	abstract Fish spawn(Cell cell);

	/**
	 * Consume a given weight of food
	 * @param w weight of food consumed
	 */
	public void eat(double w)
	{
		weight += w;
	}

	/**
	 * Accessor
	 * @return status of this fish
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Accessor
	 * @return weight of this fish
	 */
	public double getWeight()
	{
		return weight;
	}

	/**
	 * Mutator
	 * @param weight New weight of this fish
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	/**
	 * Move the fish to a new cell
	 * @param cell destination
	 */
	public void move(Cell cell)
	{
		this.cell.setFish(null);
		this.cell = cell;
		cell.setFish(this);
	}

	/**
	 * Called for each fish once per simulator step
	 * @param step incrementing step number
	 */
	public abstract void act(int step);

	/**
	 * Fish eats algae in neighborhood.
	 * @param neighborhood 
	 */
	public abstract void eat(List<Cell > neighborhood);
	
	/**
	 * Check whether fish is alive.
	 * @return True if fish is alive, false otherwise.
	 */
	public abstract boolean isAlive();
	
	/**
	 * Move fish from the current cell to a neighbor cell.
	 * @param current Cell containing the fish.
	 * @param neighborhood Neighbor cells. 
	 */
	public abstract void move(Cell current, List<Cell> neighborhood);
	
	/**
	 * Populate a neighbor cell with a new fish.
	 * @param neighborhood
	 */
	public abstract void breed(List<Cell> neighborhood);
	
}
