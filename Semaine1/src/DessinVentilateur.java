public class DessinVentilateur {

    public  static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        for (int i=0; i<3;i++){

            tortue.tournerAGauche(120);

            for (int e=0; e<4; e++){

                tortue.avancer(100);
                tortue.tournerADroite(90);
            }






        }
    }

}
