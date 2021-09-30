import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Art theMonaLisa = new Painting("Acrylic", "The MonaLisa", "DaVinci", "Church");
//		Art theWorldOfColors = new Painting("Water Colors", null, null, null);
//		Art pokerDogs = new Painting("Crayons", null, null, null);
//		Art david = new Sculpture("Stone", null, null, null);
//		Art sal = new Sculpture("Ice", null, null, null);
		System.out.println(theMonaLisa.getTitle());
	}
	ArrayList<Art> museum = new ArrayList<Art> ();
	public void addArt(Art art) {
			museum.add(art);
	}
}