/**
 * The Piece class represents a Piece object. A piece is placed 
 * in the board. 
 * 
 * @author Mayra D. Azevedo
 * @version 2017.08.29
 */
public class Piece {
	
	// Row in the board
	private int row;
	// Column of the board
	private int col;
	//
	private boolean canMove;

	/**
	 * Construct object for class Piece.
	 * @param row Line of the board.
	 * @param col Column on the board.
	 */
	public Piece( int row, int col, boolean canMove) {
		this.row = row;
		this.col = col;
		this.canMove = canMove;
	}

	/**
	 * Return row position.
	 * @return Row on the board.
	 */
	public int getRow( ) {
		return row;
	}

	/**
	 * Update row position.
	 * @param row Row on the board.
	 */
	public void getRow( int row ) {
		this.row = row;
	}

	/**
	 * Return column position.
	 * @return Column on the board.
	 */
	public int getColumn( ) {
		return col;
	}

	/**
	 * Update column position.
	 * @param column Column on the board.
	 */
	public void setColumn( int column ) {
		this.column = column;
	}

}