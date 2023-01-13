/**
 *
 * @author Abid Brahim
 *
 */
public class TableDeMultiplications {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Entrez un entier pour afficher sa table de multiplications : ");
        int entier= scanner.nextInt();
        System.out.println("La table de multiplication de "+entier+" est : ");

        for (int i = 0; i <10; i++) {

            int multiplication = (i+1)*entier;
            System.out.println((i+1) +" x " + entier+ " = " + multiplication);







        }







    }

}
