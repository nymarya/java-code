public class VideoGame extends Game{
	
	private String platform;

	/**
	 * Constructor for objects of class VideoGame
	 * @param theTitle The title of this videogame.
	 * @param thePlatform The platform of this videogame.
	 * @param numberPlayers Number of players that the game supports.
	 * @param time The minimum playing time of the game.
	 */
	public VideoGame(String theTitle, String thePlatform, int numberPlayers, int time)
    {
        super(theTitle, numberPlayers, time);
        platform = thePlatform;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString(){
        return super.toString() + "    platform: " + platform + "\n";
    }

    /**
     * Override method print from Item class.
     */
    public void print(){
        System.out.println( toString() );
    }
}