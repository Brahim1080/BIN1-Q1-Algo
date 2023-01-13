/**
 *
 * @author Abid Brahim
 *
 */
public class CoteCommenteeV2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Donnez votre note sur 20 : ");
        double cote = Utilitaires.lireReelComprisEntre(0,20);
        System.out.println(donnerCommentaire(cote));


    }

    public static String donnerCommentaire(double cote) {
        if (cote < 10)
            return "l’étudiant n’a pas validé l’UE";
        if (cote <= 14)
            return "l’étudiant a validé l’UE";
        if (cote <= 16)
            return "l’étudiant a validé l’UE avec une belle cote";
        return "l’étudiant a validé l’UE avec une très belle cote";

    }


}
