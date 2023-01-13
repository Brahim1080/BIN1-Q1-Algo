/**
 *
 * @author Abid Brahim
 *
 */
public class NoirJauneRouge {
	
	private Ecolier[] tableTriee;   // table triee d'abord les noirs puis les jaunes puis les rouges
										// Pas de doublons
	private int nombreNoirs;
	private int nombreJaunes;
	private int nombreRouges;
	private static final int NOMBRE_MAX_ECOLIERS = 10;
	
	
	public NoirJauneRouge(){
		this.tableTriee = new Ecolier[NOMBRE_MAX_ECOLIERS];
		this.nombreNoirs = 0;
		this.nombreJaunes = 0;
		this.nombreRouges = 0;
	}
	
	// A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	public NoirJauneRouge(Ecolier[] tableARecopier, int nombreNoirs, int nombreJaunes, int nombreRouges) {
		this.tableTriee = new Ecolier[NOMBRE_MAX_ECOLIERS];
		for (int i = 0; i < tableARecopier.length; i++) {
			tableTriee[i]=tableARecopier[i];
		}
		this.nombreNoirs = nombreNoirs;
		this.nombreJaunes = nombreJaunes;
		this.nombreRouges = nombreRouges;
	}	
	

	// A NE PAS MODIFIER
	// VA SERVIR POUR LES TESTS
	public String toString() {
		String aRenvoyer="";
		for (int i = 0; i < nombreEcoliers(); i++) {
			aRenvoyer += "\n" + tableTriee[i];
		}
		return aRenvoyer;
	}
	

	/**
	 * determine le nombre d ecoliers contenu dans la table
	 * @return le nombre d ecoliers
	 */
	public int nombreEcoliers(){
		return nombreNoirs + nombreJaunes + nombreRouges;
	}
	
	
	public int getNombreNoirs() {
		return nombreNoirs;
	}
	
	public int getNombreJaunes() {
		return nombreJaunes;
	}

	public int getNombreRouges() {
		return nombreRouges;
	}
	
	/**
	 * recherche l ecolier dont le nom est passe en parametre
	 * @param nom le nom de l ecolier recherche
	 * @return l'indice de la table de l ecolier recherche ou -1 si la table ne contient pas ce nom
	 */
	private int trouverIndiceEcolier(String nom){
		
		if(nom == null)
			throw new IllegalArgumentException();
		for (int i = 0; i < nombreEcoliers(); i++) {
			if(tableTriee[i].getNom().equals(nom))
				return i;
		}
		return -1;
		
	}

	/**
	 * ajoute l ecolier, s'il n'y a pas d ecolier avec ce nom et si le nombre max d ecoliers n'est pas atteint
	 * @param nom
	 * @return true si l'ajout a pu etre fait, false sinon
	 */
	public boolean ajouter(String nom, char couleur){
		
		if(nom == null||nom.equals(""))
			throw new IllegalArgumentException();
		
		if(couleur!='n' && couleur!='j' && couleur!='r')
			throw new IllegalArgumentException();
		
		// Pensez a utiliser la methode trouverIndiceEcolier() donnee ci-dessus
		int i = trouverIndiceEcolier(nom);
		if (i!=-1||nombreEcoliers()==NOMBRE_MAX_ECOLIERS){
			return false;
		}
		
		// CONTRAINTE :
		// Utilisez l'algorithme d'ajout IMPOSE.
		// Celui-ci est explique dans le document DrapeauBelge
		if (couleur=='r'){
			tableTriee[nombreEcoliers()]= new Ecolier(nom,couleur);
			nombreRouges++;

			return true;

		}else{
			if (couleur == 'j') {
				tableTriee[nombreNoirs + nombreJaunes + nombreRouges] = tableTriee[nombreNoirs + nombreJaunes];
				tableTriee[nombreJaunes + nombreNoirs] = new Ecolier(nom, couleur);
				nombreJaunes++;

				return true;

			}else {
				//Déplacement d'un rouge
				tableTriee[nombreEcoliers()] = tableTriee[nombreNoirs + nombreJaunes];

				//Déplacement d'un jaune
				tableTriee[nombreNoirs + nombreJaunes] = tableTriee[nombreNoirs];

				tableTriee[nombreNoirs] = new Ecolier(nom, couleur);
				nombreNoirs++;
			}

		}

		return true;


	}


	/**
	 * supprime l ecolier dont le nom est passe en parametre
	 * @param nom le nom de l ecolier a supprimer
	 * @return true si l ecolier a ete supprime, false sinon
	 */
	public boolean supprimer(String nom){
		
		if(nom == null||nom.equals(""))
			throw new IllegalArgumentException();
		


		int i = trouverIndiceEcolier(nom);
		if (i==-1){
			return false;
		}
		// CONTRAINTE :
		// Utilisez l'algorithme de suppression IMPOSE.
		// Celui-ci est explique dans le document DrapeauBelge
		char couleur = tableTriee[i].getCouleur();

		if (couleur == 'r') {
			// deplacement du dernier rouge par l'ecolier a supprimer
			tableTriee[i] = tableTriee[nombreEcoliers() - 1];
			nombreRouges--;
			return true;
		} else {
			if (couleur == 'j') {
				//deplacement du dernier jaune vers l'ecolier a supprimé
				tableTriee[i] = tableTriee[nombreNoirs + nombreJaunes - 1];
				//deplacement du dernier rouge vers le dernier jaune
				tableTriee[nombreNoirs + nombreJaunes - 1] = tableTriee[nombreEcoliers() - 1];
				nombreJaunes--;
				return true;
			} else {

				//deplaccement du dernier noir vers l'ecolier a supprime
				tableTriee[i] = tableTriee[nombreNoirs - 1];
				//deplacement du dernier jaune vers le dernier noir
				tableTriee[nombreNoirs - 1] = tableTriee[nombreNoirs + nombreJaunes - 1];
				//deplacement du dernier rouge vers le dernier jaune
				tableTriee[nombreNoirs + nombreJaunes - 1] = tableTriee[nombreEcoliers() - 1];
				nombreNoirs--;

			}
		}


		return true;

	}

}
