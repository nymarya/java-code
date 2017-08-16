/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

import java.util.HashMap;
import java.util.Set;

public class CommandWords
{
    // a constant array that holds all valid command words
    private HashMap<String, CommandWord> validCommands;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        validCommands = new HashMap<String, CommandWord>();
        for( CommandWord command : CommandWord.values() ){
            if( command != CommandWord.UNKNOWN){
                validCommands.put(command.toString(), command);
            }
        }
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        // try to get the word
        return validCommands.containsKey(aString);
    }

    public void showAll(){
        Set<String> words = validCommands.keySet();
    	for(String command: words) {
    	    System.out.println(command + " ");
    	}
    	System.out.println();
   }
}
