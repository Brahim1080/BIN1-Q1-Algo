/**
 *
 * @author Abid Brahim
 *
 */

public class DessinVentilateur {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        tortue.accelerer();

        for (int i = 0; i < 3; i++) {

            tortue.tournerAGauche(120);

            for (int j = 0; j < 4; j++) {
                tortue.tournerADroite(90);

                tortue.avancer(100);

            }


        }
    }
}
