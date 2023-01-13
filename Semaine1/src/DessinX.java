public class DessinX {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        tortue.tournerAGauche(45);
        tortue.avancer(100);

        tortue.definirCouleur("noir");
        tortue.tournerAGauche(225);
        tortue.avancer(70);

        tortue.definirCouleur("blanc");
        tortue.tournerADroite(135);
        tortue.avancer(100);


    }


}
