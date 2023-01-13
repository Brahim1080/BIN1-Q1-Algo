public class Grille {
    // Types de jetons
    public static final int VIDE       = 0;   // case vide
    public static final int ROUGE      = 1;
    public static final int VERT       = 2;
    public static final int BOMBE      = 3;

    public int[][] table ;        // grille du jeu
    private int taille ;          // taille de la grille
    private int nbreJetons;       // nombre de jetons dans la grille


    public Grille (int taille) {
        this.taille = taille ;
        this.nbreJetons = 0;
        this.table = new int[taille][taille] ;
    }

    // ========================== //
    //   METHODES A IMPLEMENTER   //
    // ========================== //

    /**
     * place un jeton dans une colonne
     * @param couleur
     *          la couleur du jeton à placer
     * @param colonne
     *          la colonne où le jeton doit être placé
     * @return l'indice de la ligne où le jeton est tombé
     * @throws IllegalArgumentException
     *          si la couleur ou l'indice de colonne
     *          sont invalides ou si la colonne est pleine
     */
    public int placerJeton (int couleur, int colonne) {
        if (couleur < VIDE || couleur > VERT)
            throw new IllegalArgumentException();
        if (colonne < 0 || colonne >= taille)
            throw new IllegalArgumentException();
        if (colonnePleine(colonne))
            throw new IllegalArgumentException();

        for (int i = 0 ; i <taille; i++) {

            if (table[i][colonne]==0){
                nbreJetons++;
                return table[i][colonne]= couleur;


            }




        }

        return 0;
    }

    /**
     * vérifie si une colonne contient une succession de 4 jetons de même couleur
     * @param lig
     *          la ligne où le dernier jeton a été placé
     * @param col
     *          la colonne où le dernier jeton a été placé
     * @return true si la colonne col contient une succession de 4 jetons de même couleur
     *         dont le dernier se trouve à la ligne lig ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsCol (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        int jetonAjouter = table [lig][col];
        int memeCouleur = 0;
        for ( int i = 0 ; i < taille ; i++) {

            if (table[i][col]==jetonAjouter){
                memeCouleur++;
            }else {
                memeCouleur=0;
            }
            if (memeCouleur==4){
                return true;
            }

        }

        return false;
    }

    /**
     * vérifie si une ligne contient une succession de 4 jetons de même couleur
     * @param lig
     *          la ligne où le dernier jeton a été placé
     * @param col
     *          la colonne où le dernier jeton a été placé
     * @return true si la ligne lig contient une succession de 4 jetons de même couleur
     *         dont un jeton se trouvant à la colonne col ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsLig (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        for (int i = 3; i < taille; i++){
            if (table[lig][i-3]==table[lig][i-2] &&
                    table[lig][i-1]==table[lig][i] &&
                    table[lig][i-2]==table[lig][i-1] &&
                    table[lig][i]!=0){
                return true;
            }
        }

        return false;
    }

    /**
     * vérifie si une diagonale contient une succession de 4 jetons de même couleur
     * @param lig
     *          la ligne où le dernier jeton a été placé
     * @param col
     *          la colonne où le dernier jeton a été placé
     * @return true si une des deux diagonales passant par la case (lig,col) contient
     *         une succession de 4 jetons de même couleur, dont le jeton se trouvant
     *         à la colonne col et la ligne lig ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsDiag (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        // TODO

        return false;
    }

    // ====================================== //
    //   METHODES FOURNIES (NE PAS MODIFIER)  //
    // ====================================== //

    public int getTaille(){
        return taille;
    }

    public int getNombreJetons () {
        return nbreJetons;
    }

    public boolean grillePleine () {
        return nbreJetons == taille*taille;
    }

    public boolean colonnePleine (int colonne) {
        return table[taille-1][colonne] != VIDE;
    }

    public String toString() {
        String st = "\nNombre de jetons dans la grille: " + nbreJetons + " (max: " + taille*taille + ")\n";
        st += "    ";
        for (int c=0 ; c<taille ; c++)
            st += c + " ";
        st += "\n   ";
        for (int c=0 ; c<taille ; c++)
            st += "--";
        st += "\n";
        for (int l=taille-1 ; l>=0 ; l--) {
            st += l + "|  ";
            for (int c=0 ; c<taille ; c++) {
                st = st+table[l][c]+" " ;
            }
            st += '\n' ;
        }
        return st ;
    }

    // Méthode définie pour les tests - NE PAS MODIFIER
    public void setGrilleTest (int[][] testGrille) {
        table = testGrille;
        nbreJetons = 0;
        for (int l=0; l<taille; l++)
            for (int c=0; c<taille; c++)
                if (table[l][c] != VIDE)
                    nbreJetons++;
    }
}
