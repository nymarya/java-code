package fishsim;
import java.util.List;
import java.util.ArrayList;

/**
 * Manage the rectangle of cells representing an ocean
 * @author Mayra Dantas de Azevedo
 */
public class Ocean
{
    // Configurable parameters
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
        		Cell current = cells[i][j];
        		
        		if (cells[i][j].getFish() != null) {
        			Fish fish = current.getFish();
        			if(fish.isAlive()) {
        				List<Cell> neighborhood = neighbours(fish.getDistance(), current);
        				// Eat some
        				fish.eat(neighborhood);
        				fish.updateWeigth();
        				
        				// Either spawn into the neighboring cell or if we can't
        				// breed, move into it.
        				if(fish.canBreed() ) {
        					fish.breed(neighborhood);
        				} else {
        					fish.move(current, neighborhood);
        				}
        			} else {
        				current.setFish(null);
        			}
        		}
        		current.increasePlancton( neighbours(current));
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
	
	/**
	 * Return cell at given location
	 * @param row Row of cell
	 * @param col Column of cell
	 * @return Cell at given location
	 */
	public Cell getCell(int row, int col) {
		return cells[row][col];
	}
	
	/**
	 * Reset ocean to initial state.
	 */
	public void reset() {
		for(int i = 0; i < height; i++) {
        	for(int j =0 ; j < width; j++) {
        		cells[i][j]= new Cell(this, i, j);
        	}
        }
	}
	
	/**
     * Return an array of cells in a rectangle surrounding this cell. Cells
     * are included if there row and column distance from here are both
     * less than or equal to r
     * @param r the maximum distance from here of cells returned.
     * @param empty if true only empty cells are returned
     * @return array of neighboring cells
     */
    public List<Cell> neighbours(int r, Cell cell)
    {
    	int left = Math.max(0, cell.getCol() - r);
    	int right = Math.min(width, cell.getCol() + r + 1);
    	int top = Math.max(0, cell.getRow() - r);
    	int bottom = Math.min(height, cell.getRow() + r + 1);
    	List<Cell> neighbours = new ArrayList<Cell>();
    	int n = 0;
    	for (int y = top; y < bottom; y++)
    		for (int x = left; x < right; x++) {

    			if (x != cell.getCol() || y != cell.getRow())
    				neighbours.add( getCell(y, x) );
    		}

    	return neighbours;
    }
    
    /**
     * Return an array of cells in a rectangle surrounding this cell. Cells
     * are included if there row and column distance from here are both
     * less than or equal to r
     * @param r the maximum distance from here of cells returned.
     * @param empty if true only empty cells are returned
     * @return array of neighboring cells
     */
    public List<Cell> neighbours(Cell cell)
    {
    	List<Cell> neighbours = new ArrayList<Cell>();
    	int row = cell.getRow();
    	int col = cell.getCol();
    	if( row != 0)
    		neighbours.add( cells[row-1][col] );
    	if( row < height-1)
    		neighbours.add( cells[row+1][col]);
    	if( col != 0)
    		neighbours.add( cells[row][col-1] );
    	if( col < width-1)
    		neighbours.add( cells[row][col+1]);
    	return neighbours;
    }
}
