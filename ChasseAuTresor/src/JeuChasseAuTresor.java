
public class JeuChasseAuTresor {
	
	public static void main(String[] args){

		int positionIndi = 1;
		int positionLara = 4;
		//int positionCobra = 10;

		PlateauJeu jeu = new PlateauJeu();
		//Position de Lara et Indi au début du jeu
		jeu.placerIndi(positionIndi);
		jeu.placerLara(positionLara);
		//jeu.placerCobra(positionCobra);

		while(positionIndi!=16 && positionLara!=16){
			jeu.afficherInformation("A Indi");
			int de = jeu.lancerDe();
			positionIndi=positionIndi+de;

			//Cas de dépassement de case

			if( positionIndi>16){
				positionIndi=16;
			}

			//Cas d'arret sur une case occupée
			if(positionIndi==positionLara){
				jeu.deplacerIndi(positionIndi-1);
			} else{
				jeu.deplacerIndi(positionIndi);
			}
			if(positionIndi==16){
				jeu.afficherInformation("Indi a trouvé le trésor");
			}else {
				jeu.afficherInformation("A Lara");
				de = jeu.lancerDe();
				positionLara = positionLara + de;

				//Cas de dépassement de case
				if (positionLara > 16) {
					positionLara = 16;
				}
				//Cas d'arret sur une case occupée
				if(positionLara==positionIndi){
					jeu.deplacerLara(positionLara-1);
				} else {
					jeu.deplacerLara(positionLara);
				}
				if(positionLara==16){
					jeu.afficherInformation("Lara a trouvée le tresor");
				}
			}
		}




		

	}
}
