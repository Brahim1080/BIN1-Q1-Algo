/**
 *
 * @author Abid Brahim
 *
 */
public class CalculBMI {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez votre taille en mètre: ");
        double taille = scanner.nextDouble();
        System.out.print("Entrez votre poids en kg: ");
        double poids = scanner.nextDouble();
        double bmi = poids / (taille * taille);

        if (bmi < 20) {
            System.out.print("Vous etes considéré comme mince avec un BMI de : " + bmi);
        } else {
            if (bmi < 25) {
                System.out.print("Vous etes considéré comme normal avec un BMI de : " + bmi);
            } else {
                if (bmi < 30) {
                    System.out.print("Vous etes considéré comme embonpoint avec un BMI de : " + bmi);
                } else {
                    System.out.print("Vous etes considéré comme obèse avec un BMI de : " + bmi);

                }

            }

        }


    }

}
