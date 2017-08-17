public class Main{
    public static void main(String [] args){
	CD cd = new CD("cd novo", "artista deconhecido", 10, 59);
	DVD dvd = new DVD("Interstellar", "nolan", 4*60);
	
	Database db = new Database();

	db.addItem(cd);
	db.addItem(dvd);

	db.list();
    }
}
