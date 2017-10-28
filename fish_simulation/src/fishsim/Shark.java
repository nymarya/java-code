package fishsim;

import java.util.Collections;
import java.util.List;

/**
 * Red shark fish class
 * @author Mayra Dantas de Azevedo
 */
public class Shark extends Predator {
        
        public Shark(FishParams params)
        {
            super(params);
            status = 3;
        }
        
        public Fish spawn(Cell cell)
        {
            return cell.createFish("shark");
        }

        /**
         * Eat fish in the neighborhood.
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

                //Sharks are not cannibal (in this simulation)
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
    	 * Shark breed and spawn to a neighbor cell.
    	 * @param neighborhood List of cells that can be occupied.
    	 */
    	@Override
    	public void breed(List<Cell> neighborhood) {
    		Collections.shuffle(neighborhood);
    		for (Cell c: neighborhood) {
    			if (c.getFish() == null) {
    				Fish child = c.createFish("shark");
    				child.setWeight(weight /2);
    				weight /= 2;
    				break;
    			}
    		}
    		
    	}
}
