/**
 *
 * @author Abid Brahim
 *
 */
public class Multiplication3Essais {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici une multiplication :");
        System.out.println("Tu as droit a 3 essais");
        int premierNombre = unEntierAuHasardEntre(0, 10);
        int secondNombre = unEntierAuHasardEntre(0, 10);
        System.out.println("Calculez : " + premierNombre + " x " + secondNombre + " = ");
        int reponse = premierNombre * secondNombre;
        int reponseUser = scanner.nextInt();

        int nombreDessaie = 1 ;


        while (nombreDessaie <3 && reponseUser != reponse){
            System.out.println("C’est faux, recommence");
            reponseUser = scanner.nextInt();
            nombreDessaie++;
        }
        if(reponseUser!=reponse){
            System.out.println("La bonne réponse est de "+ reponse);
        } else{
            System.out.println("Bravo , c'est la bonne réponse !");
        }





        // A COMPLETER
    }

    // A NE PAS MODIFIER
    public static int unEntierAuHasardEntre(int valeurMinimale, int valeurMaximale) {
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }

}
