/**
 *
 * @author Abid Brahim
 *
 */
public class RechercheMax3V2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez l'entier 1 : ");
        int entier1 = scanner.nextInt();
        System.out.print("Entrez l'entier 2 : ");
        int entier2 = scanner.nextInt();
        System.out.print("Entrez l'entier 3 : ");
        int entier3 = scanner.nextInt();
        int rechercheMax= max3(entier1, entier2, entier3);
        System.out.println("Le plus grand entier est "+ rechercheMax);


    }

    public static int max3(int entier1, int entier2, int entier3) {
        int max;
        if (entier1 > entier2 && entier1 > entier3) {
           max=entier1;
        } else {
            if (entier2 > entier3) {
                max=entier2;
            } else {
                max=entier3;
            }
        }
        return max;
    }

}

