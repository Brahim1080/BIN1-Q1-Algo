/**
 *
 * @author Abid Brahim
 *
 */
public class Utilitaires {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    /**
     * genere un entier compris entre les 2 valeurs passees en parametre
     * @param valeurMinimale la valeur minimale de l'entier genere
     * @param valeurMaximale la valeur maximale de l'entier genere
     * @return l'entier genere
     */
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;
        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }

    /**
     * lit un nombre reel positif ou nul
     * @param message le message affiche en cas de lecture invalide
     * @return un nombre reel positif
     */
    public static double lireReelPositif(String message){
        double x = scanner.nextDouble();
        while(x < 0){
            System.out.println("Attention " + message);
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();
        }
        return x;
    }


    /**
     * lit un nombre reel positif
     * @return un nombre reel positif
     */
    public static double lireReelPositif(){

        return lireReelPositif("le reel doit etre positif !");
    }

    /**
     * lit un entier
     * @return un entier positif
     */
    public static int lireEntierPositif(){
        int entier= scanner.nextInt();
        while (entier<0){
            System.out.print("Entrez un entier positif : ");
            entier=scanner.nextInt();
        }
        return entier;
    }


    /**
     * lit un nombre reel compris entre les 2 valeurs passees en parametre
     * @param message le message affiche en cas de lecture invalide
     * @param min le plus petit reel accepte
     * @param max le plus grand reel accepte
     * @return un nombre reel compris entre 2 bornes
     */
    public static double lireReelComprisEntre(String message, double min, double max) {
        double x = scanner.nextDouble();
        while (x < min || x > max) {
            System.out.println("Attention " + message);
            System.out.print("Recommencez : ");
            x = scanner.nextDouble();


        }
        return x;
        // TODO
    }


    /**
     * lit un nombre reel compris entre les 2 valeurs passees en parametre
     * @param min le plus petit reel accepte
     * @param max le plus grand reel accepte
     * @return un nombre reel compris entre 2 bornes
     */
    public static double lireReelComprisEntre(double min, double max ){
        String message = "le reel doit etre compris entre "+min+ " et "+max;
        return lireReelComprisEntre(message,min,max);
    }


    /**
     * lit le caractere o ou n
     * @return le caractere o un n
     */
    public static char lireOouN() {
        char caractere;

        do {
            System.out.println("Entrez O ou N : ");
            caractere = scanner.next().charAt(0);


        } while (caractere != 'O' && caractere != 'N');
        return caractere;
        // TODO
    }

    /**
     * lit des entiers
     * @return entier
     */
    public static int lireEntierNonNul(){
        int entier;
        do {
            entier= scanner.nextInt();
            if(entier==0){
                System.out.print("Entrez un entier non nul :");
            }
        }while (entier==0);

        return entier;

    }

}
