
/**
 *
 * @author Abid Brahim
 *
 */
import java.util.Scanner;

public class TriangleV3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int nbrCroix = n;
        int nbrBlancs = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nbrBlancs; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= nbrCroix; j++) {
                System.out.print('X');
            }
            System.out.println();
            nbrBlancs++;
            nbrCroix--;
        }

    }
}
