public class DessinMaison {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        for (int i=0; i<4; i++) {

            tortue.tournerADroite(90);
            tortue.avancer(100);

        }

        for (int i=0; i<3; i++){

            tortue.tournerAGauche(120);
            tortue.avancer(100);

        }

    }


}
