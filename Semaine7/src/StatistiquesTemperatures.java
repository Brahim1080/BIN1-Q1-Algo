
import java.util.Arrays;

public class StatistiquesTemperatures {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Temperatures temperatures;

	public static void main(String[] args) {

		chargerTemperatures();
		System.out.println(temperatures.toString());



		System.out.println("*****************************");
		System.out.println("Temperatures : statistiques :");
		System.out.println("*****************************");
		int choix;
		do {
			System.out.println();
			System.out.println("1 -> afficher toutes les temperatures");
			System.out.println("2 -> calculer la moyenne");
			System.out.println("3 -> : température la plus haute");
			System.out.println("4 -> : température la plus basse");
			System.out.println("5 -> : Afficher le nombre de jours de gel");
			System.out.println("6 -> : Afficher les jours de gel ");
			System.out.println("7 -> : Afficher si toutes positives ");
			System.out.println("8 -> : Afficher si au moins un jour de gel");

			System.out.println();
			System.out.print("Entrez votre choix : ");
			choix = scanner.nextInt();
			switch (choix) {
				case 1:
					afficherTout();
					break;
				case 2:
					afficherMoyenne();
					break;
				case 3:
					afficherTemperatureMax();
					break;
				case 4:
					afficherTemperatureMin();
					break;

				case 5:
					afficherNombreJoursDeGel();
					break;
				case 6:
					afficherTable(temperatures.joursDeGel());
					break;
				case 7:
					afficherSiToutesPositives();
					break;

				case 8:
					afficherSiAuMoinsUnJourDeGel();
			}
		} while (choix >= 1 && choix <= 8);
	}

	public static void afficherSiAuMoinsUnJourDeGel() {
		System.out.println("Au moins une negative : " + temperatures.contientAuMoinsUnJourDeGel());
	}
	public static void afficherSiToutesPositives(){
		System.out.println("Toutes positives : "+ temperatures.toutesPositives());
	}

	private static void afficherNombreJoursDeGel() {
		System.out.println("Nombre de jours de gel :  " + temperatures.nombreJoursDeGel());
	}


	private static void afficherTout() {
		System.out.println(temperatures.toString());
	}

	private static void afficherMoyenne() {

		System.out.println("Moyenne = " + temperatures.moyenne());

	}

	private static void afficherTemperatureMin() {
		System.out.println("Min " + temperatures.temperatureMin());
	}

	public static void afficherTemperatureMax() {
		System.out.println("Max " + temperatures.temperatureMax());
	}

	public static void chargerTemperatures() {
		double[] tableTemperatures = {-1, 1, 0, 1, -1, -3, -3, -2, 0, -1, 0, 1, 1, 3, 5, 4, 2, 0, 1, 1, 5, 3, 2, 0, -1, 0, 1, 1, 3, 4, 5};
		//double[] tableTemperatures = {3,5,6};
		temperatures = new Temperatures("janvier", tableTemperatures);
	}

	public static void afficherTable(int[] table) {
		System.out.println(Arrays.toString(table));
	}

}
