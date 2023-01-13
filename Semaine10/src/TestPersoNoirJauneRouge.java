
public class TestPersoNoirJauneRouge {
	
	public static void main(String [] args){
		
		NoirJauneRouge njr = new NoirJauneRouge();
		njr.ajouter("nico", 'n');
		System.out.println(njr.toString());
		njr.ajouter("rene", 'r');
		System.out.println(njr.toString());
		njr.ajouter("noel", 'n');
		System.out.println(njr.toString());
		njr.ajouter("brahim",'j');

		System.out.println();
		System.out.println();


		
		System.out.println("A completer a votre guise!");
	}
}
