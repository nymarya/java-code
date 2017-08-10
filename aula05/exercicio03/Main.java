public class Main{
    

    public static void main( String [] args){
        ListFM playlist = new ListFM();

        playlist.addFile("audio/BoB-Airplane.mp3");
        playlist.addFile("audio/Beck-HitInTheUsa.mp3");
        playlist.addFile("audio/Gunther-DingDingDongSong.mp3");

        playlist.listFiles();

        playlist.playTrack(0);
        playlist.removeFile(3);
        playlist.removeFile(2);

        //playlist.playAll();

        playlist.removeFile("Bob");
    }
}