/**
 *
 * @author Abid Brahim
 *
 */

public class SommesNegatifsEtPositifs {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int sommeP = 0;
        int sommeN = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Entrez l'entier n°" + i + " : ");
            int entier = scanner.nextInt();

            if (entier >= 0) {

                sommeP = sommeP + entier;

            } else {

                sommeN = sommeN + entier;


            }





        }
        System.out.println("La somme des nombres positifs est de " + sommeP + " et la somme des nombres négatifs est de " + sommeN);

    }
}
