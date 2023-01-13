/**
 *
 * @author Abid Brahim
 *
 */

public class DessinCarresEmboites {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        tortue.accelerer();


        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {
                tortue.avancer(50+(i*10));
                tortue.tournerADroite(90);


            }


            
        }
        
    }



}
