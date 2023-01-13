
public class JeuCombatGuerriers {

	public static void main(String[] args){

		int pointsDeVieCogneDur = 25;   //1
		int pointsDeVieFrappeFort = 25; //2
		FenetreCombatGuerriers jeu = new FenetreCombatGuerriers(pointsDeVieCogneDur, pointsDeVieFrappeFort);

		while (pointsDeVieCogneDur > 0 && pointsDeVieFrappeFort > 0) {
			jeu.afficherInformation("A CogneDur");
			jeu.afficherEpee(1);
			jeu.afficherBouclier(2);
			int de = jeu.lancerDe();
			pointsDeVieFrappeFort = pointsDeVieFrappeFort - de;
			if (pointsDeVieFrappeFort < 0) {
				pointsDeVieFrappeFort = 0;
			}
			jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);
			if (pointsDeVieFrappeFort > 0) {
				jeu.afficherInformation("A FrappeFort");
				jeu.afficherEpee(2);
				jeu.afficherBouclier(1);
				de = jeu.lancerDe();
				pointsDeVieCogneDur = pointsDeVieCogneDur - de;

			}
			if (pointsDeVieCogneDur < 0) {
				pointsDeVieCogneDur = 0;
			}
			jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);

		}
		jeu.afficherInformation("Fin du combat");
		if (pointsDeVieFrappeFort == 0) {
			jeu.afficherCroix(2);
			jeu.afficherCoupe(1);
		} else {
			jeu.afficherCroix(1);
			jeu.afficherCoupe(2);
		}

	}
}
