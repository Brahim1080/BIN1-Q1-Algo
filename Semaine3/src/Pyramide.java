/**
 *
 * @author Abid Brahim
 *
 */

import java.util.Scanner;

public class Pyramide {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int j;

        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <=(n + i - j); k++) {
                System.out.print("X");
            }
            System.out.println();
        }


    }


}



