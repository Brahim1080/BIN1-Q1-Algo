
public class JeuDuPendu {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args){

		System.out.print("Entrez le mot a trouver : ");
		String motATrouver = scanner.next();

		FenetrePendu fenetrePendu = new FenetrePendu();
		
		MotACompleter mot = new MotACompleter(motATrouver);
		
		int nbreMorceauxPendu=0;

		fenetrePendu.afficherMot(mot.toString());

		char lettre = fenetrePendu.lireLettre();



		do {
			fenetrePendu.afficherPendu(nbreMorceauxPendu);

			fenetrePendu.lireLettre();



			if (mot.contientLettre(lettre)){
				mot.ajouterLettre(lettre);
				fenetrePendu.afficherMot(mot.toString());
			}else {
				nbreMorceauxPendu++;
			}



		}while (!mot.estComplet() && nbreMorceauxPendu != 6 );
		
		//TODO


		
		fenetrePendu.afficherInformation("fin du jeu");
		
	}
}
