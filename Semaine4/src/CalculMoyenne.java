/**
 *
 * @author Abid Brahim
 *
 */
public class CalculMoyenne {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        double somme = 0;
        char reponseUtilisateur;
        int compteur = 0;

        do {
            System.out.print("Entrez la cote : ");
            double cote = scanner.nextDouble();

            somme = somme + cote;
            System.out.print(" Y'a t-il une autre cote ? Entrez Y,y,O,o si oui  : ");
            reponseUtilisateur = scanner.next().charAt(0);

            compteur++;
        } while (reponseUtilisateur == 'Y' ||reponseUtilisateur == 'y' || reponseUtilisateur == 'O' || reponseUtilisateur == 'o');

        double moyenne = somme / compteur;

        System.out.print("La somme est de " + somme + " et la moyenne est de " + moyenne);

    }
}
