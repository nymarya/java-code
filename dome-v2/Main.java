public class Main{
    public static void main(String [] args){
	CD cd = new CD("cd novo", "artista deconhecido", 10, 59);
	cd.setComment("mt mara");
	cd.setOwn(true);
	
	DVD dvd = new DVD("Interstellar", "nolan", 4*60);
	VideoGame game = new VideoGame("Mario Kart", "pc", 8, 200*60);
	
	Database db = new Database();

	db.addItem(cd);
	db.addItem(dvd);
	db.addItem(game);

	db.list();
    }
}
