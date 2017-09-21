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
    private ArrayList<Fish> fishes;
    private double plancton[];
    
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
        fishes = new ArrayList<Fish>(width * height);
        plancton = new double[width * height];
        for (int n = 0; n < plancton.length; n++)
        {
        	fishes.add(n, null);
        	plancton[n] = initialPlancton;
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
        if (fishType.equals("herring"))
            return new Herring(cell, herringParams);
        if (fishType.equals("groper"))
            return new Groper(cell, groperParams);
        if (fishType.equals("shark"))
            return new Shark(cell, sharkParams);
        return null;
    }
    
    /**
     * Put the ocean through one iteraction of the simulator
     * @param step number of this iteration
     */
    public void act(int step) {
        /*
         * Seed the ocean with new fish occasionally
         */
    	if (step % 100 == 0)
    		createFish(new Cell(this, 10, 10), "herring");
    	if (step % 100 == 50) {
    		createFish(new Cell(this, 20, 20), "groper");
    		createFish(new Cell(this, 40, 40), "shark");
        }
        
        // Act on all the fish
        Cell cells[] = Cells();
    	for (int n = 0; n < cells.length; n++)
    		if (cells[n].getFish() != null)
    			cells[n].getFish().act(step);
        // Grow the plancton
    	for (int n = 0; n < plancton.length; n++)
    		plancton[n] = Math.min(plancton[n] * incPlancton, maxPlancton);
    }
    
    /**
     * Get all the cells in the ocean
     * @return array of cells
     */
    public Cell[] Cells()
    {
        Cell cells[] = new Cell[width * height];
        for (int n = 0; n < cells.length; n++)
            cells[n] = new Cell(this, n / width, n % width);
        return cells;
    }
    
    /**
     * Return the fish at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The fish at the given location, or null if there is none.
     */
    public Fish getFishAt(int row, int col)
    {
        return fishes.get(width * row + col);
    }
    
    /**
     * Low-level method to add the fish to the ocean. Used by cells
     * @param fish added
     * @param row cell location
     * @param col cell location
     */
    public void setFishAt(Fish fish, int row, int col)
    {
        fishes.set(width * row + col, fish);
    }
    
    /**
     * Get the plancton level
     * @param row location
     * @param col location
     * @return level
     */
    public double getPlanctonAt(int row, int col)
    {
    	return plancton[width * row + col];
    }
    
    /**
     * Mutator
     * @param p new plancton level
     * @param row location
     * @param col location
     */
    public void setPlanctonAt(double p, int row, int col)
    {
    	plancton[width * row + col] = p;
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
}
