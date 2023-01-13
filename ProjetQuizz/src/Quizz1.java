
public class Quizz1 {

	public static FenetreQuizz fenetreQuizz;


	
	public static void main(String[] args){
		
		// creation de  l equipe
		
		Candidat[] candidats = new Candidat[6];
		for (int i = 0; i < candidats.length; i++) {
			candidats[i] = new Candidat("nom"+(i+1));
		}
		Equipe equipe = new Equipe(1, candidats);

		// creation du questionnaire
		
		Questionnaire questionnaire = chargerQuestions();

		// creation de la fenetre de depart
		
		fenetreQuizz = new FenetreQuizz("Quizz - Capitales des pays de l'union europeenne");
		fenetreQuizz.afficherEquipe(equipe);
		//int indice = 0 ;


		do {


			fenetreQuizz.afficherQuestion(questionnaire.fournirQuestion());

			fenetreQuizz.afficherCandidat(equipe.selectionnerCandidat());

			fenetreQuizz.cliquerChoix();
			if (fenetreQuizz.cliquerChoix() == questionnaire.fournirQuestion().getNumeroChoixCorrect()) {
				fenetreQuizz.afficherCandidat(equipe.remettreEnJeu());
				fenetreQuizz.afficherPouceOK();
				fenetreQuizz.afficherEquipe(equipe);

			} else{
				fenetreQuizz.afficherPouceKO();
			fenetreQuizz.afficherEquipe(equipe);
		}





		}while(equipe > 0 );




		// TODO


	}
	
	
	public static Questionnaire chargerQuestions(){

		QuestionCM[] questions = new QuestionCM[5];
		questions[0]= new QuestionCM("Allemagne","Amsterdam","Dublin","Berlin",3);
		questions[1]= new QuestionCM("Autriche","Vienne","Prague", "Vilnius",1);
		questions[2]= new QuestionCM("Belgique","Amsterdam", "Bruxelles","Paris",2);
		questions[3]= new QuestionCM("Bulgarie"	,"Sofia","Budapest","Bucarest",1);
		questions[4]= new QuestionCM("Italie",	"Nicosie","Riga","Rome",3);
		

//		Croatie		Zagreb
//		Danemark	Copenhague
//		Espagne		Madrid
//		Estonie		Tallinn
//		Finlande	Helsinki
//		France		Paris
//		Grece		Athenes
//		Hongrie		Budapest
//		Irlande		Dublin
//		Italie		Rome
//		Lettonie	Riga
//		Lituanie	Vilnius
//		Luxembourg	Luxembourg
//		Malte		La Valette
//		Pays-Bas	Amsterdam
//		Pologne		Varsovie
//		Portugal	Lisbonne
//		Republiquetcheque	Prague
//		Roumanie	Bucarest
//		Royaume-Uni	Londres
//		Slovaquie	Bratislava
//		Slovenie	Ljubljana
//		Suede		Stockholm

		return new Questionnaire(questions);
		
	}

}
