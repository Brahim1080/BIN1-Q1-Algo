/**
 *
 * @author Abid Brahim
 *
 */

import java.util.Scanner;

public class Losange {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int nbrCroix = n;
        int nbrBlancs = 0;

       //  Haut du losange
        for (int i = n; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print("X");
            }
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= nbrBlancs; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= nbrCroix; m++) {
                System.out.print("X");
            }

            System.out.println();
            nbrBlancs++;
            nbrCroix--;


        }

        // Bas du losange

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");

            }
            for (int k = 1; k <=(n-i)*2 ; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <=i ; l++) {
                System.out.print("X");

            }
            System.out.println();

        }


    }

}
