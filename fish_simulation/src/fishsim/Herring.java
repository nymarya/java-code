package fishsim;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The Herring fish class
 * @author Mayra Dantas de Azevedo
 * @version 03/10/2017
 */
public class Herring extends Fish {
	private double planctonEaten;

	/**
	 * Construct a new herring
	 * @param cell fish location
	 * @param params parameters for the new fish
	 */
	public  Herring(FishParams params) {
		super(params);
		planctonEaten = params.getPlanctonEaten();
		status = 1;
	}

	/**
	 * Return a new fish of the same kind
	 * @param cell fish location
	 * @return new fish
	 */
	public Fish spawn(Cell cell) {
		return cell.createFish("herring");
	}

	@Override
	public void eat(List<Cell> neighborhood) {
		// Eat some plancton
		Collections.shuffle(neighborhood);
		for(Cell c : neighborhood) {
			
			double p = c.getPlancton();
			if (p > planctonEaten) {
				eat(planctonEaten);
				p -= planctonEaten;
				c.setPlancton(p);
				break;
			} 
		}
		

	}
	
	/**
	 * Fish breed and spawn to neighbor cell.
	 * @param neighborhood List of cells that can be occupied.
	 */
	@Override
	public void breed(List<Cell> neighborhood) {
		Collections.shuffle(neighborhood);
		System.out.println(neighborhood.size() + " vizinhos");
		for (Cell c: neighborhood) {
			if (c.getFish() == null) {
				c.createFish("herring");
				System.out.println("cria em " + c.getCol() + " " + c.getRow());
				c.getFish().setWeight(weight * 0.4);
				break;
			}
		}
		weight *= 0.6;

	}
	
	/**
     * Get safe distance 
     * @return
     */
    public int getDistance() {
    	return 1;
    }
}
