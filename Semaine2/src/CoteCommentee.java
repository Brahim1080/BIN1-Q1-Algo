/**
 *
 * @author Abid Brahim
 *
 */

public class CoteCommentee {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Donnez votre note sur 20 : ");
        double cote = scanner.nextDouble();

        if (cote < 10) {
            System.out.println("l’étudiant n’a pas validé l’UE");
        } else {
            if (cote <= 14) {
                System.out.println("l’étudiant a validé l’UE");
            } else {
                if (cote <= 16) {
                    System.out.println("l’étudiant a validé l’UE avec une belle cote");
                } else {
                    System.out.println("l’étudiant a validé l’UE avec une très belle cote");
                }
            }


        }
    }


}

/* Écrivez un programme qui lit la cote (réel) sur 20 (à ne pas vérifier) d’un étudiant et qui la
commente.
cote < 10 : l’étudiant n’a pas validé l’UE
10 ≤ cote < 14 : l’étudiant a validé l’UE
14 ≤ cote < 16 : l’étudiant a validé l’UE avec une belle cote
cote ≥ 16 : l’étudiant a validé l’UE avec une très belle cote */