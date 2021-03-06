package fishsim;
import java.util.*;

/**
 * Represent a single location in the ocean
 * @author Mayra Dantas de Azevedo
 * @version 08/10/2017
 */
public class Cell implements Comparable<Cell>
{
    private int row, col;
    private Ocean ocean;
    
    //Cell contains fishes and planctons
    private double initialPlancton = 5.0;
    private double maxPlancton = 10.0;
    private double incPlancton = 1.2;
    
    FishParams herringParams, groperParams, sharkParams;
    private Fish fish;
    private double plancton;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(Ocean ocean, int row, int col)
    {
        this.ocean = ocean;
        this.row = row;
        this.col = col;
        plancton = initialPlancton;
        this.fish = null;
    }
    
    /**
     * Compare the status of the fish in a pair of cells
     * Used when sorting neighboring cells to decide which fish
     * to eat first
     * @param cell
     * @return
     */
    public int compareTo(Cell cell) {
        return cell.getStatus() - getStatus();
    }
    
    /**
     * Add a new fish to this cell. Any existing fish at this cell will
     * be destroyed
     * @param fishType
     * @return the new fish
     */
    public Fish createFish(String fishType)
    {
    	//return ocean.createFish(this, fishType);

    	if (fishType.equals("herring"))
            this.fish = new Herring(ocean.getHerringParams());
        if (fishType.equals("groper"))
            this.fish =  new Groper(ocean.getGroperParams());
        if (fishType.equals("shark"))
            this.fish = new Shark( ocean.getSharkParams());
        return fish;
        
    }

    /**
     * Accessor
     * @return row of this cell
     */
    public int getRow()
    {
        return row;
    }
    
    /**
     * Accessor
     * @return column of this cell
     */
    public int getCol()
    {
        return col;
    }
    
    /**
     * Return all cells within an x and y distance r of here
     * @param rectangular distance
     * @return array of neighbouring cells
     */
    public Cell[] neighbours(int r)
    {
    	return neighbours(r, false);
    }
    
    /**
     * Return an array of cells in a rectangle surrounding this cell. Cells
     * are included if there row and column distance from here are both
     * less than or equal to r
     * @param r the maximum distance from here of cells returned.
     * @param empty if true only empty cells are returned
     * @return array of neighboring cells
     */
    public Cell[] neighbours(int r, boolean empty)
    {
    	int left = Math.max(0, col - r);
    	int right = Math.min(ocean.getWidth(), col + r + 1);
    	int top = Math.max(0, row - r);
    	int bottom = Math.min(ocean.getHeight(), row + r + 1);
    	Cell cells[] = new Cell[(bottom - top)*(right - left) - 1];
    	int n = 0;
    	for (int y = top; y < bottom; y++)
    		for (int x = left; x < right; x++) {
    			if (empty && ocean.getFishAt(y, x) != null)
    				continue;
    			if (x != col || y != row)
    				cells[n++] = ocean.getCell(y, x);
    		}
        if (n < cells.length)
            return Arrays.copyOf(cells, n);
        else
            return cells;
    }
    
    /**
     * Get the status of any fish in the cell
     * @return fish status or 0 if the cell is unoccupied
     */
    public int getStatus()
    {
        Fish f = getFish();
        if (f != null)
            return f.getStatus();
        return 0;
    }
    
    /**
     * Get the fish at this cell
     * @return fish reference or null if the cell is unoccupied
     */
    public Fish getFish()
    {
        //return ocean.getFishAt(row, col);
    	return fish;
    }
    
    /**
     * Add a new fish to the cell. Any existing occupant is discarded
     * @param fish the fish to add. Use null to empty the cell
     */
    public void setFish(Fish fish)
    {
    	if(this.fish != null)
    		return;
    	this.fish = fish;
        //ocean.setFishAt(fish, row, col);
        
    }
    
    /**
     * Get the plancton level at this location
     * @return plancton level
     */
    public double getPlancton()
    {
    	return plancton;
    	//return ocean.getPlanctonAt(row, col);
    }
    
    /**
     * Set the plancton level at this location
     * @param p the new plancton level
     */
    public void setPlancton(double p)
    {
    	//ocean.setPlanctonAt(p, row, col);
    	plancton = p;
    }
    
    public void increasePlancton() {
    	plancton = Math.min(plancton * incPlancton, maxPlancton);
    }
    
    /*
     * 
     */
    public void increasePlancton(List<Cell> neighbors) {
    	
    	double increasingTax = 0.5 * plancton * incPlancton;
    	
    	double neighborsTax = 0.0;
    	for( Cell c : neighbors) {
    		neighborsTax += c.getPlancton() * incPlancton;
    	}
    	
    	increasingTax += 0.5 * neighborsTax/(neighbors.size());
    	
    	plancton = Math.min(increasingTax, maxPlancton);
    }
    
    /**
     * Return a random cell from the array of cells
     * @param cells
     * @return chosen cell
     */
    static Cell random(Cell[] cells) {
        if (cells.length == 0)
            return null;
        return cells[(int)(cells.length * Math.random())];
    }
    
    
    /**
     * Reset cell to initial state.
     */
    public void reset() {
		if(fish != null)
			fish = null;
		
		plancton = initialPlancton;
	}
    
    /**
     * Return level of plancton.
     * @return
     */
    public double getPlanctonLevel() {
    	return 0.1 * plancton;
    }
}
