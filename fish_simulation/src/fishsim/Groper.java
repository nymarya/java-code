package fishsim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Blue groper fish class
 * @author jdb
 */
public class Groper extends Predator {

    /**
     * Create a new blue groper
     * @param cell location of the fish
     * @param params initial parameters
     */
    public Groper(Cell cell, FishParams params)
    {
        super(cell, params);
        status = 2;
    }

    /**
     * Create another groper
     * @param cell location for the new fish
     * @return the fish spawned
     */
    public Fish spawn(Cell cell)
    {
        return cell.createFish("groper");
    }

    /**
     * Eat fish.
     * @param neighborhood List of cells that may contain food.
     */
	@Override
	public void eat(List<Cell> neighborhood) {
		// Eat as many fish as are in the neighborhood
        double eaten = 0.0;
        for (Cell c : neighborhood) {
            if (c.getStatus() == 0) {
                break;
            }

            //Groper may not eat a shark
            if (c.getStatus() < status && !(c.getFish() instanceof Shark)) {
                double w = c.getFish().getWeight();
                eat(w);
                c.setFish(null);
                eaten += w;
                if (eaten >= maxEat)
                    break;
            }
        }
		
		
	}

	/**
	 * Groper breed and spawn to a neighbor cell.
	 * @param neighborhood List of cells that can be occupied.
	 */
	@Override
	public void breed(List<Cell> neighborhood) {
		System.out.println(neighborhood.size() + " vizinhos");
		Collections.shuffle(neighborhood);
		for (Cell c: neighborhood) {
			if (c.getFish() == null) {
				Fish child = c.createFish("groper");
				child.setWeight(weight /2);
				weight /= 2;
				break;
			}
		}
		
	}

}
