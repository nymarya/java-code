public class Main{
    

    public static void main( String [] args){
        ListFM playlist1 = new ListFM();

        playlist1.addFile("audio/BoB-Airplane.mp3");
        playlist1.addFile("audio/Beck-HitInTheUsa.mp3");
        playlist1.addFile("audio/Gunther-DingDingDongSong.mp3");

        playlist1.listFiles();

        playlist1.playTrack(0);
        playlist1.removeFile( 3);
        playlist1.removeFile(2);

        playlist1.playAll();
    }
}