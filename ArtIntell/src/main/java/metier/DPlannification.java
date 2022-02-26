package metier;

import model.Projet;

public class DPlannification {

	public static String Plannifier(Projet projet) {
		switch (projet.getTaille()) {
			case "Petit":
				return "1 Ingenieur, 3 Developpeurs et 2 semaine";
			case "Moyen":
				return "2 Ingenieur, 7 Developpeurs et 1 mois";
			case "Grand":
				return "8 Ingenieur, 27 Developeurs et 8 mois";
			default:
				return "On a pas les ressources pour votre projet ";
		}
	}
}
