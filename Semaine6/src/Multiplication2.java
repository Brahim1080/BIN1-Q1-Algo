/**
 *
 * @author Abid Brahim
 *
 */
public class Multiplication2 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire des multiplications.");
		System.out.println("La valeur minimale des 2 nombres a multiplier est 0.");
		System.out.println("Tu peux choisir la valeur maximale de ces 2 nombres.");
		System.out.println("Cette valeur sera la meme pour tous les exercices");
		System.out.println("Pour chaque multiplication, tant que tu n'auras pas donne la bonne reponse, tu devras la recommencer");
		System.out.println("Le programme termine lorsque tu auras reussi 3 multiplications du premier coup");
	
		// A NE PAS COMPLETER

	}

      public static int aireUneMultiplication(){

		  int entier1;
		  int entier2;
		  int reponseDuPremierCoup;
		  int reponseUtlisisateur;

		  do {

			  entier1 = Utilitaires.unEntierAuHasardEntre(0, 8);
			  entier2 = Utilitaires.unEntierAuHasardEntre(1, 10);
			  System.out.print("Calculez : " + entier1 + " x " + entier2 + " = ");
			  reponseUtlisisateur = scanner.nextInt();


		  }while(reponseUtlisisateur!=0);



		  return 0;
       }

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}
}
