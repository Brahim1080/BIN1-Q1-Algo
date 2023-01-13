/**
 *
 * @author Abid Brahim
 *
 */
public class NombreMystere {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombreMystere = unEntierAuHasardEntre(0,100);


        System.out.println("Trouvez le nombre mystere entre 0 et 100 ");
        int nombreUser = scanner.nextInt();

        while (nombreUser!=nombreMystere){

            if(nombreUser<nombreMystere){
                System.out.println("Le nombre mystere est plus grand ");
            }else{
                    System.out.println("Le nombre mystere est plus petit ");
                }

            nombreUser= scanner.nextInt();
        }
        System.out.println("Bravo vous avez trouvez le nombre mystere qui est "+nombreMystere);




    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}

