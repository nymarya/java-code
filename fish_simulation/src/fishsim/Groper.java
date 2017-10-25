package fishsim;

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

	@Override
	public void eat(List<Cell> neighborhood) {
		
		
		
	}

	@Override
	public void move(Cell current, List<Cell> neighborhood) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breed(List<Cell> neighborhood) {
		Cell c = Cell.random(cell.neighbours(huntDistance, true));
        if (c != null) {
            Fish child = spawn(c);
            child.setWeight(weight / 2);
            weight /= 2;
        }
		
	}

}
