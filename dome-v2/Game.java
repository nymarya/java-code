public class Game extends Item{
    
    private int numberOfPlayers;

    public Game(String theTitle, int numberPlayers, int time)
    {
        super(theTitle, time);
        numberOfPlayers = numberPlayers;
    }
}
