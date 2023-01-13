public class DessinLunettes {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {
        tortue.definirCouleur("vert");

        for (int i=0; i<4; i++){

            tortue.tournerADroite(90);
            tortue.avancer(100);
        }

        tortue.avancer(50);

        for (int i=0; i<4; i++){

            tortue.avancer(100);
            tortue.tournerADroite(90);
        }


    }






}
