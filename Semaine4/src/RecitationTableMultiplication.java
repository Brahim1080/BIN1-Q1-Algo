/**
 *
 * @author Abid Brahim
 *
 */
public class RecitationTableMultiplication {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int table = unEntierAuHasardEntre(1,10);
        System.out.println("Tu vas donner la table de multiplication par " +table+ " :");
        int nombre = 1;

        int reponseUser;
        int reponse;


        do {
            System.out.print(nombre+" x "+table+" = ");
            reponseUser = scanner.nextInt();

            reponse= nombre * table;
            nombre++;


        } while (reponseUser==reponse && nombre<=10 );
        if(reponse!=reponseUser) {
            System.out.println("Non c’est faux, la bonne réponse est " + reponse);
        }else {
            System.out.println("Félicitation! ");
        }

    }





    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }



}
