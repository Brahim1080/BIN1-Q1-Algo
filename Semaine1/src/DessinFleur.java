import java.util.stream.IntStream;

public class DessinFleur {

    public static Tortue tortue= new Tortue();

    public static void main(String[] args) {

        for(int i=0; i<4; i++){

            tortue.tournerADroite(90);

            for (int j=0; j<3; j++){
                tortue.avancer(100);
                tortue.tournerADroite(120);
            }
        }

    }
}
