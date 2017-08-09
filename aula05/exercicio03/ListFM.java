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
     * @param filename The file to be saved.
     */
    public void addFile(String file){
        playlist.add(file);
    }

    /**
     * Return number of String of the list.
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
        //Check if index is not out of range
        if( index >= 0 && index < playlist.size() ){
            playlist.remove(index);
        } else {
            System.out.println("[Error] Index out of range");
        }
    }

    /**
     * Play full audio.
     * @param filename File to be played.
     */
    public void playFile( String filename ){
        //Check if audio is in the playlist
        int index = playlist.indexOf(filename);
        if( index != -1){
            String file = playlist.get( index );

            System.out.println("Now playing: " + file);
            engine.playCompletely( file );
        } else {
            System.out.println("[Error] File not found");
        }
    }

    /**
     * Play full audio at the position 'index'.
     * @param filename File to be played.
     */
    public void playTrack( int index ){
        //Check if index is not out of range
        if( index >= 0 && index < playlist.size() ){
            String file = playlist.get( index );

            System.out.println("Now playing: " + file);
            engine.playCompletely(file);
        } else {
            System.out.println("[Error] Index out of range");
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
     * Print all files from the playlist.
     */
    public void listFiles(){
        Iterator<String> it = playlist.iterator();
        while( it.hasNext()){
            String file = it.next();
            int index = playlist.indexOf( file );
            System.out.println( index + ": " + file);
        }
    }

    void removeFile(String file){
        //Check if file is in the list
        int index = playlist.indexOf(file);
        if( index != -1 ){
            playlist.remove( index );
        } else {
            System.out.println("[Error] File not found");
        }
    }

}