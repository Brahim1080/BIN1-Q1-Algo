public class DessinL {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {


        tortue.accelerer();
        tortue.definirCouleur("rouge");
        tortue.tournerADroite(90);
        tortue.avancer(200);
        tortue.tournerAGauche(90);
        tortue.avancer(100);
    }
}
