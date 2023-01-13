/**
 *
 * @author Abid Brahim
 *
 */
public class NombreMystereInverse {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Pensez à un chiffre et je le trouverais" +
                " ( mettez - si votre nombre est plus petit, mettez + s'il est plus grand et mettez = si c'est le bon nombre )");
        int nombreOrdi;
        char instructionUtilisateur;


        int valeurMinimale=0;
        int valeurMaximale=100;
        int compteur = 0;

        do{

            nombreOrdi= unEntierAuHasardEntre(valeurMinimale,valeurMaximale);


            System.out.println(nombreOrdi);
            compteur++;
            instructionUtilisateur= scanner.next().charAt(0);

            if(instructionUtilisateur=='+'){

                valeurMinimale=nombreOrdi+1;

            } else{

                if(instructionUtilisateur=='-') {

                    valeurMaximale =  nombreOrdi - 1;

                }

            }

        }while (instructionUtilisateur!='=');

        System.out.println("J'ai trouvé votre nombre en "+compteur+" essais!");


    }



    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
