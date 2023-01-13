/**
 *
 * @author Abid Brahim
 *
 */
public class Statistiques {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez le nombre de cotes : ");
        int nombreCotes = scanner.nextInt();
        double coteMax = -Double.MAX_VALUE; // le plus petit reel

        double coteMin = Double.MAX_VALUE;

        double somme = 0;


        for (int i = 1; i <= nombreCotes; i++) {
            System.out.print("Entrez la cote n°" + i + ": ");
            double cote = scanner.nextDouble();
            if (cote > coteMax) {
                coteMax = cote;
            }
            if (cote < coteMin) {
                coteMin = cote;

            }

            somme = somme + cote;

        }

        double moyenne = somme / nombreCotes;

        System.out.println("La cote la plus elevee est " + coteMax);
        System.out.println("La cote la plus basse est " + coteMin);
        System.out.println("La moyenne est " + moyenne);


    }
}
