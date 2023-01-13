/**
 *
 * @author Abid Brahim
 *
 */

public class DeuxMeilleuresCotes {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 1; i <= 5 ; i++) {
            System.out.print("Entrez la cote n°" + i + ": ");
            int cote = scanner.nextInt();
            if(cote>max1){
                max2 = max1;
                max1 = cote;
            } else {
                if(cote>max2){
                    max2 = cote;
                }
            }
        }

        System.out.println("La meilleure cote est "+max1);
        System.out.println("La deuxieme meilleure cote est "+max2);

    }


}
