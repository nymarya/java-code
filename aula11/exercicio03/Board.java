
import java.util.ArrayList;
public class Board {
	
    private Piece[][] board; 

    /**
     * Construct objects for class Board.
     * @param size Dimension of the board.
     */
    public Board ( int size ) {
        board = new Piece[size][size];    
    }

    /**
     * Mark piece on the board.
     * @param piece Piece to be marked on the board.
     */
    public void markCell( Piece piece ){
    	board[ piece.getRow() ][ piece.getColumn() ] = piece;
    }

    /**
     * Move piece on the board.
     * @param piece Piece to be moved.
     */
    public void movePiece( Piece piece, int newRow, int newCol ) {
	if( piece instaceof Character ){
	    board[ piece.getRow() ][ piece.getColumn() ] = null;
	    board[ newRow ][newCol] = piece;
	    piece.setRow( newRow );
	    piece.setColumn( newCol );
	}
    }
}