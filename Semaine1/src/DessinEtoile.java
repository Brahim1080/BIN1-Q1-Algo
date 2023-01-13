public class DessinEtoile {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        tortue.definirCouleur("rouge");

        for (int i=0; i<3;i++){

            tortue.avancer(100);
            tortue.tournerADroite(120);


        }
        tortue.definirCouleur("noir");
        tortue.tournerAGauche(270);
        tortue.avancer(50);
        tortue.tournerAGauche(90);
        tortue.definirCouleur("bleu");
        tortue.avancer(100);

        for (int i=0; i<3; i++){

            tortue.tournerAGauche(120);
            tortue.avancer(100);


        }


    }


}
