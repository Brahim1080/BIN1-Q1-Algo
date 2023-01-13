
/**
 *
 * @author Abid Brahim
 *
 */
public class Deliberation {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Calculez la moyenne de la classe :  ");


		System.out.println("La moyenne de la classe moyenne est de  " + moyenneClasse());


	}

	/**
	 * lit les cotes, calcule et renvoie la moyenne d'un etudiant
	 *
	 * @return le resultat d'un etudiant
	 */
	public static double moyenneUnEtudiant() {
		double somme = 0;
		int nbrDeCotePourUnEtudiant = 10;


		for (int i = 1; i <= nbrDeCotePourUnEtudiant; i++) {
			System.out.print("Entrez la cote n°" + i + ": ");
			double cote = Utilitaires.lireReelComprisEntre(0, 20);

			somme = somme + cote;

		}

		return somme / nbrDeCotePourUnEtudiant;
	}

	/**
	 * Lit à chaque fois 10 cotes pour les 25 étudiants
	 *
	 * @return moyenne de la classe
	 */
	public static double moyenneClasse() {
		int nombreDEtudiant = 25;
		double sommeDesMoyennes = 0;


		for (int i = 1; i <= nombreDEtudiant; i++) {
			System.out.println("Entrez les cotes pour l'etudiant n°" + i + ": ");
			double moyenne = moyenneUnEtudiant();
			sommeDesMoyennes = sommeDesMoyennes + moyenne;


		}


		return sommeDesMoyennes / nombreDEtudiant;
	}
}
