/**
 *
 * @author Abid Brahim
 *
 */
public class DuelGuerriers {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {


        int pvFrappeFort = unEntierAuHasardEntre(1, 6);
        System.out.println("FrappeFort a " + pvFrappeFort + " point de vie");

        int pvCogneDur = unEntierAuHasardEntre(1, 6);
        System.out.println("CogneDur a " + pvCogneDur + " point de vie");

        int pointDegatFrappeFort = unEntierAuHasardEntre(1, 6);
        int pointDegatCogneDur = unEntierAuHasardEntre(1, 6);

        // Point de vie de CogneDur et FrappeFort au premier combat
        int pvCogneDurCombat1 = pvCogneDur - pointDegatFrappeFort;
        int pvFrappeFortCombat1 = pvFrappeFort - pointDegatCogneDur;



        System.out.println("FrappeFort inflige " + pointDegatFrappeFort + " points de degat a CogneDur");
        System.out.println("CogneDur a " + pvCogneDurCombat1 + " point de vie");

        if (pvCogneDurCombat1 <= 0) {
            System.out.println("FrappeFort est vainqueur");

        } else {
            System.out.println("CongneDur inflige " + pointDegatCogneDur + " points de degat a FrappeFort");
            System.out.println("FrappeFort a " + pvFrappeFortCombat1 + " point de vie");

            if (pvFrappeFortCombat1 <= 0) {
                System.out.println("CogneDur est vainqueur");

            } else {
                if(pvCogneDurCombat1<pvCogneDurCombat1){
                    System.out.println("CogneDur est vainqueur");

                }else{
                    System.out.println("FrappeFort est vainqueur");

                    if(pvCogneDurCombat1==pvFrappeFortCombat1){
                        System.out.println("Les deux joueurs sont ex-aequo");

                    }

                }



            }
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





