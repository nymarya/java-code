/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /** 
     * Create string representation to the object.
     */
    public String toString(){
        String line = title + " (" + playingTime + ") mins\n" ;
        if(gotIt)
            return line + "    " + comment + "\n";
        else
            return line;
    }

    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.println( toString() );
    }

    /**
     * Get title of this item.
     */
    protected String getTitle(){
        return title + "*\n ";
    }

    /**
     * Get playing time of this item.
     */
    protected String getPlayingTime(){
        return playingTime + "    \n ";
    }


}
