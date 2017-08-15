/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

import java.util.HashMap;
import java.util.Set;

public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }
    
    /**
     * 
     */
    public Room getExit( String direction){
        return exits.get(direction);
    }
    
    /**
     * Define an exit of this room.
     * @param direction Direction that lead to next room.
     * @param neighbor Room that
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Return a long description of the room.
     * @return String that describes the roomm.
     */
    public String getLongDescription(){
        return "You are " + description + ".\n " + getExitString();
    }

    /**
     * Return exit description.
     * @return String that contains all the directions available.
     */
    public String getExitString(){
        Set<String> exitsString = exits.keySet();
        String exit = "Exists: ";
        for( String e: exitsString){
            exit += e + " ";
        }
        

        return exit;
    }

}
