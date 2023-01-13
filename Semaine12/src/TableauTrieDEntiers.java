/**
 *
 * @author Abid Brahim
 *
 */
public class TableauTrieDEntiers{

	private int [] tableDEntiers;  // table d'entiers triee par ordre croissant
	private int nombreDEntiers;    // nombre d'entiers dans tableDEntiers
	private static final int TAILLE = 10;

	public TableauTrieDEntiers(){
		this.tableDEntiers = new int[TAILLE];
		this.nombreDEntiers = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TableauTrieDEntiers t = (TableauTrieDEntiers)obj;
		if (t.nombreDEntiers!=this.nombreDEntiers)
			return false;
		for (int i = 0; i < nombreDEntiers;i++)		
			if (this.tableDEntiers[i]!=t.tableDEntiers[i]) 
				return false;
		return true;
	}
	
	
	public String toString(){
		String aRenvoyer = "\n nombreDEntiers : " + this.nombreDEntiers;
		aRenvoyer += "   tableDEntiers : ";
		for (int i = 0; i < this.nombreDEntiers; i++) {
			aRenvoyer += this.tableDEntiers[i]+" ";
		}
		return aRenvoyer;
	}
	
	/**
	 * constructeur par recopie
	 * ce constructeur leve une exception si la table passee en parametre contient plus de 10 entiers
	 * utile pour les tests et/ou si elle n'est pas triee
	 * @param tableARecopier une table triee d'au plus TAILLE entiers triee par ordre croissant
	 */

	public TableauTrieDEntiers(int[] tableARecopier){
		if (tableARecopier.length>TAILLE) 
			throw new IllegalArgumentException();
		this.nombreDEntiers = tableARecopier.length;
		tableDEntiers= new int[TAILLE];
		if(tableARecopier.length!=0)
			tableDEntiers[0] = tableARecopier[0];
		for (int i = 1; i<nombreDEntiers; i++){
			if(tableARecopier[i]<tableARecopier[i-1]){
				throw new IllegalArgumentException();
			}
			tableDEntiers[i] = tableARecopier[i];
		}     	
	}

	public int getNombreDEntiers(){
		return this.nombreDEntiers;
	}


	/** 
	 * methode qui ajoute un entier si la table n'est pas encore pleine.
	 * La table doit rester triee!
	 * @param entier l'entier a ajouter
	 * @return boolean signale si l'entier a pu etre ajoute
	 */

	public boolean ajouterUnEntier(int entier){
		int indiceMax = nombreDEntiers;
		int indiceMin = 0;
		int indiceMillieu = (indiceMax-indiceMin)/2;
		
		if (nombreDEntiers == TAILLE)
			return false;
		
		//Ajout en fin de table 
		tableDEntiers[nombreDEntiers]= entier;
		nombreDEntiers++;


		for (int i = nombreDEntiers - 1 ; i >0 ; i--) {

			if(tableDEntiers[i] < tableDEntiers[i - 1] ){

				int temp = tableDEntiers[i -1];
				tableDEntiers[i-1]= tableDEntiers[i];
				tableDEntiers[i]= temp;

			}


			
		}
		

		
		return true;

	}

	
	/**
	 * methode qui recherche l'indice correspondant a la premiere occurrence de l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return indice correspondant a l'entier, -1 s'il n'est pas dans la table
	 */
	private int trouverIndiceLineaire(int entier){
		
		//recherche sequentielle cout O(N)

		for (int i = 0; i < nombreDEntiers; i++) {

			if (tableDEntiers[i] == entier) {
				return i;
			}
		}
		

		return -1;
		
	}

	
	/**
	 * methode qui recherche l'indice correspondant a une occurrence (pas necessairement la premiere)
	 * de l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return indice correspondant a unEntier, -1 s'il n'est pas dans la table
	 */
	private int trouverIndiceDicho(int entier){
		
		//recherche dichotomique cout O(logN)
		
		// TODO
		// Dans un premier temps, passez cette methode difficile
		// Pour tester cette methode, utilisez cette methode dans la methode contient()

		// Si cela ne va pas, refaites la demo su site
		// https://www.infoforall.fr/art/algo/animation-de-la-recherche-dichotomique/
		// et/ou refaites le test moovin recherche dichotomique

		return -1; 
		
	}

	
	/** 
	 * methode qui verifie si la table contient l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return boolean true si l'entier est present dans la table, false sinon
	 */
	public boolean contient(int entier){

		
		if (trouverIndiceLineaire(entier) == -1)
			return false;
		// UTILISER LA METHODE trouverIndiceLineaire() donnee
		// OU (de preference) LA METHODE trouverIndiceDicho() une fois celle-ci ecrite
		return true;
	}  

	
	/** 
	 * methode qui supprime une occurrence de l'entier passe en parametre.
	 * La table doit rester triee!
	 * @param entier l'entier a supprimer
	 * @return boolean signale si l'entier a pu etre supprime
	 */
	public boolean supprimerUneOccurrence(int entier){

		int indice = trouverIndiceLineaire(entier);


		if (indice==-1)
			return false;


		nombreDEntiers--;
		for (int i = indice; i < nombreDEntiers; i++) {
			int temp = tableDEntiers[i];
			tableDEntiers[i] = tableDEntiers[i + 1];
			tableDEntiers[i + 1] = temp;

		}


		return true;
		// UTILISER LA METHODE trouverIndiceLineaire() donnee
		// OU (de preference) LA METHODE trouverIndiceDicho() une fois celle-ci ecrite
	}

	
	/** 
	 * methode qui supprime toutes les occurrences d'un entier
	 * @param entier l'entier a supprimer
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerToutesLesOccurrences(int entier) {


		int i = trouverIndiceLineaire(entier);
		if (i == -1)
			return 0;
		int nombreDeSuppression = 0;

		for (; i < nombreDEntiers; i++) {

			if (tableDEntiers[i] == entier) {
				nombreDeSuppression++;
			} else {
				tableDEntiers[i - nombreDeSuppression] = tableDEntiers[i];
			}

		}

		nombreDEntiers = nombreDEntiers - nombreDeSuppression;


		// UTILISER LA METHODE trouverIndiceLineaire() donnee.
		// Il est possible d'ecrire cette methode en un seul passage dans la boucle
		// Inspirez vous de la solution de la methode supprimerTousLesParticipants()
		// qui vous a ete donnee au cours theorique de la semaine derniere
		// Cette solution se trouve sur moovin !

		// DEFI!!! : UTILISER une recherche dichotomique - cfr fiche d'exercices

		return nombreDeSuppression;

	}


	/** 
	 * methode qui verifie si la table contient des ex-aequos
	 * @return boolean true si la table contient des ex-aequos, false sinon
	 */
	public boolean contientExAequo() {
		for (int i = 1; i < nombreDEntiers ; i++) {
			if (tableDEntiers[i] == tableDEntiers[i -1]) {
				return true;
			}
		}
		return false;

		//Cette methode peut s'ecrire en O(N)
		// N'oubliez pas que la table est triee!

	}

	
	/** 
	 * methode qui supprime tous les ex-aequos
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerTousLesExAequos(){
		int nombreDeSuppression = 0 ;
		for (int i = 1; i < nombreDEntiers   ; i++) {

			if (tableDEntiers[i]==tableDEntiers[i - 1]){

				nombreDeSuppression ++ ;
			}
			else {
				tableDEntiers[i - nombreDeSuppression] = tableDEntiers[i];
			}

		}
		nombreDEntiers = nombreDEntiers - nombreDeSuppression ;
		return nombreDeSuppression;

		// Il est possible d'ecrire cette methode en un seul passage dans la boucle
		// Inspirez vous de la solution de la methode supprimerTousLesParticipants()
		// qui vous a ete donnee au cours theorique de la semaine derniere
		// Cette solution se trouve sur moovin !

	}

	/**
	 * supprime tous les entiers compris entre borneInf et borneSup (bornes comprises)
	 * si borneInf est > que borneSup, il faut inverser les bornes
	 * @param borneInf l'entier le plus petit a supprimer
	 * @param borneSup l'entier le plus grand a supprimer
	 * @return le nombre de suppressions effectuees
	 */
	public int supprimerEntre(int borneInf, int borneSup) {
		//TODO
		return 0;
		//ex supplementaire
		//essayez de faire cet exercice apres avoir termine tous les exercices obligatoires
	}

}