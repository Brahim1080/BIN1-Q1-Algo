/**
 *
 * @author Abid Brahim
 *
 */
public class Multiplication {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int nombre1 = unEntierAuHasardEntre(0, 10);
        int nombre2 = unEntierAuHasardEntre(0, 10);
        System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");

        int reponse = scanner.nextInt();

        if (reponse == (nombre1 * nombre2)) {
            System.out.println("Bravo !");
        } else {
            System.out.println("La bonne réponse est : " + (nombre1 * nombre2));
        }

    }

    public static int unEntierAuHasardEntre(int valeurMinimale, int valeurMaximale) {
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;


    }
}