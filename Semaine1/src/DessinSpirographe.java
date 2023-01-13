public class DessinSpirographe {

    public  static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        tortue.accelerer();

        for (int e=0; e<36;e++){



            for (int i=0; i<360;i++){

                tortue.tournerADroite(1);
                tortue.avancer(0.75);

            }

            tortue.tournerAGauche(10);

            tortue.avancer(2.5);




        }



    }







}
