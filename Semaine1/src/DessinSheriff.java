public class DessinSheriff {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        for (int e=0; e<8;e++){

            for(int i=0; i<2; i++){


                tortue.avancer(50);
                tortue.tournerAGauche(135);
                tortue.avancer(50);
                tortue.tournerADroite(135);
                tortue.avancer(50);
                tortue.tournerAGauche(45);

            }
            tortue.tournerADroite(0);









        }





    }



}
