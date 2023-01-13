/**
 *
 * @author Abid Brahim
 *
 */
public class DessinCarresEmboites {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        double emboiter=0;
        for (int i = 0; i <5 ; i++) {

            tortue.dessinerUnCarre(50+emboiter);
            emboiter=emboiter+10;
            
        }
    }
}
