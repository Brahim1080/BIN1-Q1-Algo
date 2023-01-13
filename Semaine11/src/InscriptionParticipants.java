/**
 *
 * @author Abid Brahim
 *
 */
public class InscriptionParticipants {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Participants p;

	public static void main(String[] args) {

		int choix;
		System.out.println("Exercices d'algorithmique et Java");
		System.out.println("1ere Informatique IPL");
		System.out.println();
		System.out.println("******************************");
		System.out.println("Inscription des participants :");
		System.out.println("******************************");
		System.out.println();
		System.out.print("Entrez le nombre maximum de participants : ");
		int nombreMax = scanner.nextInt();
		p = new Participants(nombreMax);
		do {
			System.out.println();
			System.out.println("1 -> Afficher tous les inscrits");
			System.out.println("2 -> Ajouter un participant en fin de liste");
			System.out.println("3 -> Ajouter un participant apres un autre participant");
			System.out.println("4 -> Verifier l'appartenance d'un participant");
			System.out.println("5 -> Supprimer un participant via son nom");
			System.out.println("6 -> Supprimer tous les participants via leur nom");
			System.out.print("\nEntrez votre choix : ");
			choix = scanner.nextInt();
			System.out.println();
			switch (choix) {
				case 1:
					afficher();
					break;
				case 2:
					ajouterFin();
					break;
				case 3:
					ajouterApres();
					break;
				case 4:
					verifierExistence();
					break;
				case 5:
					supprimerViaNom();
					break;
				case 6:
					supprimerTous();
					break;
			}
		} while (choix >= 1 && choix <= 9);
		System.out.println("Merci pour votre visite.");
	}

	private static void afficher() {
		System.out.println(p.toString());
		System.out.println();
	}

	private static void ajouterFin() {
		System.out.print("Entrez le nom du participant : ");
		String participant = scanner.next();
		if (p.ajouterParticipant(participant))

			System.out.println("Le participant a ete ajoute avec succes");
		else
			System.out.println("Le participant n'a pas ete ajoute car le nombre maximum d'inscriptions est atteint");
	}

	private static void ajouterApres() {
		System.out.print("Comment s'appelle le participant ");
		String participant = scanner.next();

		System.out.print("Apres qui voulez vous l'ajouter ");
		String apresCeparticipant= scanner.next();
		int indexParticipantApres = p.donnerIndex(apresCeparticipant);

		p.ajouterParticipant(indexParticipantApres+1,participant);


	}

	private static void verifierExistence() {
		System.out.println("Verifiez si quelqu'un est dans la liste : ");
		String participantAVerifier = scanner.next();
		if(p.contient(participantAVerifier)){
			System.out.println("Le participent est bien inscrit ");
		} else{
			System.out.println("Le participant n'est pas inscrit ");
		}
	}

	private static void supprimerViaNom() {
		System.out.print("Entrez le nom de la personne a supprimer");
		String participantASupprimer = scanner.next();
		p.supprimerParticipant(participantASupprimer);

	}

	private static void supprimerTous() {
		System.out.print("Entrez le nom de la personne a supprimer : ");
		String participantsAsupprimer = scanner.next();
		p.supprimerTousLesParticipants(participantsAsupprimer);
		
	}

}
