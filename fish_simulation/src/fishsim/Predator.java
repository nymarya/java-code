package fishsim;

import java.util.Arrays;

/**
 * A fish that eats other fish - either a Groper or a Shark
 * @author jdb
 */
public abstract class Predator extends Fish {

    protected int huntDistance;
    protected double maxEat;

    /**
     * Construct a new predator
     * @param cell location
     * @param params parameters
     */
    public Predator(FishParams params) {
        super(params);
        huntDistance = params.getHuntDistance();
        maxEat = params.getMaxEat();
    }
    
    /**
     * Get safe distance 
     * @return
     */
    public int getDistance() {
    	return huntDistance;
    }
}
