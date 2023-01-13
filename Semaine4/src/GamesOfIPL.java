/**
 *
 * @author Abid Brahim
 *
 */
public class GamesOfIPL {


    public static void main(String[] args) {
        int pvCogneDur = 25;
        int pvFrappeFort = 25;


        int pointDeDegatCogneDur;
        int pointDeDegatFrappeFort;


        System.out.println("Bienvenue au combat entre Cognedur et Frappefort ");

        do {
            pointDeDegatCogneDur = unEntierAuHasardEntre(1, 6);

            System.out.println("CogneDur inflige " + pointDeDegatCogneDur + " à FrappeFort");
            pvFrappeFort = pvFrappeFort - pointDeDegatCogneDur;
            if (pvFrappeFort < 0) {
                pvFrappeFort = 0;
                System.out.println("Il reste " + pvFrappeFort + " points de vie à FrappeFort");

            } else {
                System.out.println("Il reste " + pvFrappeFort + " points de vie à FrappeFort");
            }


            pointDeDegatFrappeFort = unEntierAuHasardEntre(1, 6);
            pvCogneDur = pvCogneDur - pointDeDegatFrappeFort;


            if (pvFrappeFort > 0) {
                System.out.println("FrappeFort inflige " + pointDeDegatFrappeFort + " à CogneDur");

                if (pvCogneDur < 0) {
                    pvCogneDur = 0;
                    System.out.println("Il reste " + pvCogneDur + " points de vie à CogneDur");
                } else {
                    System.out.println("Il reste " + pvCogneDur + " points de vie à CogneDur");
                }

            }
            System.out.println();

        } while (pvFrappeFort > 0 && pvCogneDur > 0);
        if (pvFrappeFort <= 0) {
            System.out.println("Frappefort est mort. Paix à son âme il est mort en brave");
        } else {
            System.out.println("CogneDur est mort. Paix à son âme il est mort en brave");

        }
    }


    public static int unEntierAuHasardEntre(int valeurMinimale, int valeurMaximale) {
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
