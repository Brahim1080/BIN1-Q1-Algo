public class CalculMoyenne {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez le nombre de cotes : ");
        int nombreCotes = scanner.nextInt();

        double somme = 0;


        for (int i = 1; i <= nombreCotes; i++) {
            System.out.print("Entrez la cote n°" + i + ": ");
            double cote = scanner.nextDouble();

            somme = somme + cote;

        }
        double moyenne = somme / nombreCotes;

        System.out.println("La moyenne est de : " + moyenne);

    }
}
