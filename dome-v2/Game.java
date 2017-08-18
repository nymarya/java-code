public class Game extends Item{
    
    private int numberOfPlayers;

    /**
     * Constructor for objects of class Game.
     * @param theTitle The title of this Game.
     * @param numberPlayers Num of players that the game supports.
     * @param time The minimum time of the game.
     */
    public Game(String theTitle, int numberPlayers, int time)
    {
        super(theTitle, time);
        numberOfPlayers = numberPlayers;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString(){
        return super.toString() + "    max number of players: " + numberOfPlayers + "\n";
    }

    /**
     * Override method print from Item class.
     */
    public void print(){
        System.out.println( toString() );
    }
}
