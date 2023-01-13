/**
 *
 * @author Abid Brahim
 *
 */

public class Championnat {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        double coteHaute = -Double.MAX_VALUE;
        double coteBasse = Double.MAX_VALUE;
        double somme = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Entrez la cote n°" + i + ": ");
            double cote = scanner.nextDouble();

            if (cote > coteHaute) {
                coteHaute = cote;
            }
            if (cote < coteBasse) {
                coteBasse = cote;
            }


            somme = somme + cote;


        }
        double moyenne = (somme - coteBasse - coteHaute) / 6;

        if (moyenne >= 8) {
            System.out.println("Le concurrent est sélectionné pour la finale avec une moyenne de " + moyenne);

        } else {
            System.out.println("Le concurrent est élliminé avec une moyenne de " + moyenne);
        }


    }


}
