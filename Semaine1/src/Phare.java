public class Phare {

    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        tortue.accelerer();

        // les murs
        for(int i=0; i<2; i++){
            tortue.avancer(100);
            tortue.tournerAGauche(90);
            tortue.avancer(200);
            tortue.tournerAGauche(90);
        }

        tortue.tournerAGauche(90);
        tortue.avancer(200);
        tortue.tournerADroite(90);

        // le toit
        for(int i=0; i<3; i++){
            tortue.avancer(100);
            tortue.tournerAGauche(120);
        }

        tortue.avancer(62);
        tortue.tournerAGauche(90);
        tortue.definirCouleur("noir");
        tortue.avancer(30);
        tortue.definirCouleur("blanc");

        // la lumiere
        for(int i=0; i<360; i++){
            tortue.avancer(0.2);
            tortue.tournerAGauche(1);
        }

        tortue.definirCouleur("noir");
        tortue.tournerAGauche(180);
        tortue.avancer(62);
        tortue.definirCouleur("blanc");


        // les fenetres
        for(int i=0; i<4; i++){
            tortue.avancer(20);
            tortue.tournerADroite(90);
        }

        tortue.avancer(20);
        tortue.definirCouleur("noir");
        tortue.avancer(42);
        tortue.definirCouleur("blanc");

        // les fenetres
        for(int i=0; i<4; i++){
            tortue.avancer(20);
            tortue.tournerADroite(90);
        }

        tortue.avancer(20);
        tortue.definirCouleur("noir");
        tortue.avancer(42);
        tortue.definirCouleur("blanc");

        // les fenetres
        for(int i=0; i<4; i++){
            tortue.avancer(20);
            tortue.tournerADroite(90);
        }

        tortue.avancer(20);
        tortue.definirCouleur("noir");
        tortue.avancer(25);
        tortue.definirCouleur("blanc");
        tortue.tournerADroite(90);
        tortue.avancer(100);

        // la base du phare
        for(int i=0; i<2; i++){
            tortue.tournerAGauche(90);
            tortue.avancer(50);
            tortue.tournerAGauche(90);
            tortue.avancer(176);
        }

        tortue.tournerADroite(90);

        // vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerAGauche(1);
        }

        // vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerADroite(1);
        }

        //vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerAGauche(1);
        }

        //vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerADroite(1);

        }

        tortue.tournerAGauche(180);
        tortue.definirCouleur("noir");
        tortue.avancer(40);
        tortue.definirCouleur("blanc");

        // vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerAGauche(1);
        }

        // vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerADroite(1);
        }

        //vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerAGauche(1);
        }

        //vague
        for(int i=0; i<180; i++){
            tortue.avancer(0.5);
            tortue.tournerADroite(1);
        }
    }
}
