import java.util.ArrayList;
import java.util.Iterator;

public class ListFM{
    
    //List of adresses to the songs.
    private ArrayList<String> playlist;

    //Engine to play the audios
    private SoundEngine engine;
    
    /**
     * Create a new playlist.
     */
    public ListFM(){
        playlist = new ArrayList<String>();
        engine = new SoundEngine();
    }
    
    /**
     * Add file to the list.
     * @param file The file to be saved.
     */
    public void addFile(String file){
        playlist.add(file);
    }

    /**
     * Return number of String in the list.
     * @return The size of the list.
     */
    public int getNumberOfFiles(){
        return playlist.size();
    }

    /**
     * Remove file at position 'index'.
     * @param index Position of the target object.
     */
    public void removeFile( int index){
        //Check if index is out of range
        if( index >= 0 && index < playlist.size() ){
            playlist.remove(index);
        } else {
            System.out.println("[removeFile()] Index " + index + " is out of range");
        }
    }

    /**
     * Play full audio.
     * @param filename File to be played.
     */
    public void playFile( String file ){
        //Check if audio is in the playlist
        int index = playlist.indexOf(file);
        if( index != -1){
            String filename = playlist.get( index );

            System.out.println("Now playing: " + filename);
            engine.playCompletely( filename );
        } else {
            System.out.println("[playFile()] File '" +file+ "' not found ");
        }
    }

    /**
     * Play all the files of the list.
     */
    public void playAll(){
        for( String file : playlist){
            System.out.println("Now playing: " + file);
            engine.playCompletely(file);
        }
    }

    /**
     * Print all files of the playlist.
     */
    public void listFiles(){
        for( String file : playlist){
            int index = playlist.indexOf( file );
            System.out.println( index + ": " + file);
        }
    }

    /**
     * Remove the first element that contains the string 'file'.
     * @param file
     */
    public void removeFile(String file){
        //Check if file is in the list
        Iterator<String> it = playlist.iterator();
        while( it.hasNext() ){
            String filename = it.next();
            if( filename.contains(file)){
                playlist.remove(filename);
                return;
            }
        }
        System.out.println("[removeFile()] There is no result for '" + file+"' ");
        
    }

}