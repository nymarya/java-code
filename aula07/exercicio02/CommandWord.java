public enum CommandWord{
	//Valid commands
	GO("go"), QUIT("quit"), HELP("help"), LOOK("look"), UNKNOWN("?");

	private String commandWord;

	CommandWord( String command){
		this.commandWord = commandWord;
	}

	@Override
    public String toString() {
        return commandWord;
    }
}