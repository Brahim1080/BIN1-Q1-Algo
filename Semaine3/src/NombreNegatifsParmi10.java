/**
 *
 * @author Abid Brahim
 *
 */


public class NombreNegatifsParmi10 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombreD_EntierNégatif = 0;

        for (int i = 1; i <=10 ; i++) {
            System.out.print("Entrez l'entier n°"+i+" : ");
            int entier = scanner.nextInt();

            if(entier<0){

                nombreD_EntierNégatif++;



            }

        }

        System.out.println("Parmis les 10 entiers que vous avez entré "+ nombreD_EntierNégatif + " d'entre eux sont négatifs. ");

    }


}
