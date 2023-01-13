public class Jeu {

    private static final int TAILLE_MIN = 7;
    private static final int TAILLE_MAX = 10;

    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main (String[] args) {

        System.out.print("Entrez la taille de la grille (entre " +
                TAILLE_MIN + " et " + TAILLE_MAX + "): ");
        int taille = scanner.nextInt();
        if (taille<TAILLE_MIN || taille>TAILLE_MAX) {
            System.out.println("Erreur: Taille non valide");
            return;
        }
        Grille grille = new Grille(taille) ;
        PlateauDeJeu plateau = new PlateauDeJeu(grille);
        plateau.afficherInformations("Debut de la partie");
        int joueur = Grille.VERT;

        boolean allignement = false;



        while (!grille.grillePleine() || allignement == false){
            plateau.afficherJetonSuivant(joueur);
            int colonne = plateau.cliquerColonne();

            grille.placerJeton(joueur,colonne);
            if (!grille.verifier4JetonsCol(taille-1,colonne)){
                plateau.afficherInformations(joueur + "Est gagnant");
                allignement = true;


            }
            plateau.actualiserGrille();

            if (joueur == Grille.VERT){
                joueur = Grille.ROUGE;
            }else{
                joueur = Grille.VERT;
            }
        }




    }

}
