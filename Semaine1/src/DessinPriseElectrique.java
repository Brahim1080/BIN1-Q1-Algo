public class DessinPriseElectrique {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        tortue.accelerer();

        for (int i=0; i<360;i++){

            tortue.avancer(0.1);
            tortue.tournerADroite(1);

        }

        tortue.definirCouleur("noir");
        tortue.avancer(50);
        tortue.definirCouleur("blanc");

        for (int i=0; i<360;i++){

            tortue.avancer(0.1);
            tortue.tournerADroite(1);

        }

        tortue.definirCouleur("noir");
        tortue.tournerAGauche(90);
        tortue.avancer(50);
        tortue.tournerAGauche(90);
        tortue.avancer(25);
        tortue.definirCouleur("blanc");

        for (int i=0; i<360;i++){

            tortue.avancer(1);
            tortue.tournerAGauche(1);

        }






    }

}
