package fishsim;
import java.util.*;

/**
 * Manage the rectangle of cells representing an ocean
 */
public class Ocean
{
    // Configurable parameters
    // Plancton
    private double initialPlancton = 5.0;
    private double maxPlancton = 10.0;
    private double incPlancton = 1.2;
    
    FishParams herringParams, groperParams, sharkParams;
    private int width, height;
    
    
    private Cell cells[][];
    
    
    
    /**
     * Create a new ocean
     * @param height height in cells
     * @param width width in cells
     * @param herringParams provides parameters for any herrings created
     * @param groperParams provides parameters for any gropers created
     * @param sharkParams provides parameters for any sharks created
     */
    public Ocean(int height, int width, FishParams herringParams,
            FishParams groperParams, FishParams sharkParams)
    {
        this.width = width;
        this.height = height;
        this.herringParams = herringParams;
        this.groperParams = groperParams;
        this.sharkParams = sharkParams;
        cells = new Cell[height][width];
        for(int i = 0; i < height; i++) {
        	for(int j =0 ; j < width; j++) {
        		cells[i][j] = new Cell(this, i, j);
        	}
        }
    }
    
    /**
     * Fish creation factory
     * Create a new fish of the named type
     * @param cell
     * @param fishType string with the name of the kind of fish
     * @return created fish
     */
    public Fish createFish(Cell cell, String fishType)
    {
        //if (fishType.equals("herring"))
         //   return new Herring(cell, herringParams);
        //if (fishType.equals("groper"))
        //    return new Groper(cell, groperParams);
        //if (fishType.equals("shark"))
        //    return new Shark(cell, sharkParams);
        //return null;

    	return cell.createFish(fishType );
    }
    
    /**
     * Put the ocean through one iteration of the simulator
     * @param step number of this iteration
     */
    public void act(int step) {
        /*
         * Seed the ocean with new fish occasionally
         */
    	if (step % 100 == 0)
    		cells[10][10].createFish("herring");
    	if (step % 100 == 50) {
    		cells[20][20].createFish("groper");
    		cells[40][40].createFish("shark");
        }
        
        // Act on all the fish
        //Cell cells[] = Cells();
    	for(int i = 0; i < height; i++) {
        	for(int j =0 ; j < width; j++) {
        		if (cells[i][j].getFish() != null) {
        			cells[i][j].getFish().act(step);
        		}
        		
        		cells[i][j].increasePlancton();
        	}
        }
    }
    
    /**
     * Return the fish at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The fish at the given location, or null if there is none.
     */
    public Fish getFishAt(int row, int col)
    {
        //return fishes.get(width * row + col);
    	return cells[row][col].getFish();
    }
    
    /**
     * Low-level method to add the fish to the ocean. Used by cells
     * @param fish added
     * @param row cell location
     * @param col cell location
     */
    public void setFishAt(Fish fish, int row, int col)
    {
        //fishes.set(width * row + col, fish);
    	cells[row][col].setFish(fish);
    }
    
    /**
     * Get the plancton level
     * @param row location
     * @param col location
     * @return level
     */
    public double getPlanctonAt(int row, int col)
    {
    	return cells[row][col].getPlancton();
    }
    
    /**
     * Mutator
     * @param p new plancton level
     * @param row location
     * @param col location
     */
    public void setPlanctonAt(double p, int row, int col)
    {
    	cells[row][col].setPlancton(p);
    }
    
    /**
     * @return The height of the ocean.
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * @return The width of the ocean.
     */
    public int getWidth()
    {
        return width;
    }

	/**
	 * @return the herringParams
	 */
	public FishParams getHerringParams() {
		return herringParams;
	}

	/**
	 * @return the groperParams
	 */
	public FishParams getGroperParams() {
		return groperParams;
	}

	/**
	 * @return the sharkParams
	 */
	public FishParams getSharkParams() {
		return sharkParams;
	}
	
	public Cell getCell(int row, int col) {
		return cells[row][col];
	}
}
