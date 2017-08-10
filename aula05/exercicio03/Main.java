public class Main{
    

    public static void main( String [] args){
        ListFM playlist = new ListFM();

        //Adiciona arquivos
        playlist.addFile("audio/BoB-Airplane.mp3");
        playlist.addFile("audio/Beck-HitInTheUsa.mp3");
        playlist.addFile("audio/Gunther-DingDingDongSong.mp3");

        //Teste listFiles()
        playlist.listFiles();
    
        //Teste playFile()
        playlist.playFile("audio/BoB-Airplane.mp3");

        //Teste removeFile()
        playlist.removeFile(3);
        playlist.removeFile(2);

        playlist.removeFile("Bob");
        playlist.removeFile("Hit");

        
        //Teste playAll()
        playlist.addFile("audio/Beck-HitInTheUsa.mp3");
        playlist.addFile("audio/Gunther-DingDingDongSong.mp3");
        playlist.playAll();
    }
}