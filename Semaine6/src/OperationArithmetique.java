/**
 *
 * @author Abid Brahim
 *
 */
public class OperationArithmetique {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int choix;
        do {
            System.out.println("1 : Addition" +
                    "\n2 : Soustraction" +
                    "\n3 : Multiplication");
            System.out.println("Entrez votre choix : ");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    faireUneAddition();
                    break;

                case 2:
                    faireUneSoustraction();
                    break;

                case 3:
                    faireUneMultiplication();
                    break;

            }

        } while (choix >= 1 && choix <= 3);

    }
    public static void faireUneAddition() {
        int nombre1 = unEntierAuHasardEntre(0, 10);
        int nombre2 = unEntierAuHasardEntre(0, 10);
        System.out.print("Calculez : " + nombre1 + " + " + nombre2 + " = ");
        int reponseUser = scanner.nextInt();
        int reponse = nombre1 + nombre2;
        if (reponseUser == reponse) {
            System.out.println("Bravo !");
        } else {
            System.out.println("La bonne réponse est : " + reponse);
        }

    }

    public static void faireUneSoustraction() {
        int nombre1 = unEntierAuHasardEntre(0, 10);
        int nombre2 = unEntierAuHasardEntre(0, 10);
        System.out.print("Calculez : " + nombre1 + " - " + nombre2 + " = ");
        int reponseUser = scanner.nextInt();
        int reponse = nombre1 - nombre2;
        if (reponseUser == reponse) {
            System.out.println("Bravo !");
        } else {
            System.out.println("La bonne réponse est : " + reponse);
        }

    }

    public static void faireUneMultiplication() {
        int nombre1 = unEntierAuHasardEntre(0, 10);
        int nombre2 = unEntierAuHasardEntre(0, 10);
        System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");

        int reponseUser = scanner.nextInt();
        int reponse = nombre1 * nombre2;

        if (reponseUser == (nombre1 * nombre2)) {
            System.out.println("Bravo !");
        } else {
            System.out.println("La bonne réponse est : " + reponse);
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
