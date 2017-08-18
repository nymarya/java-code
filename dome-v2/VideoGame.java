public class VideoGame extends Game{
	
	private String platform;

	public VideoGame(String theTitle, String thePlatform, int numberPlayers, int time)
    {
        super(theTitle, numberPlayers, time);
        platform = thePlatform;
    }
}