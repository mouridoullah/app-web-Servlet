package metier;

import java.util.Random;
import java.util.UUID;

import model.Initialisation;
import model.Projet;

public class CAffectation {
	public static String Affecter(Projet projet) {
        Random r = new Random();
        int n = r.nextInt(25); 
		if(n >= 5) {
			String s = UUID.randomUUID().toString();
			projet.setChef_projet(Initialisation.getFirstName()+" "+Initialisation.getLastName());
			projet.setId_equipe(Initialisation.getRandNomEquipe());
			projet.setId_equipe(s);
			return "projet affecté";
		}
		return "projet refusé, nous n'avons pas l'effectif disponible pour le projet !";
	}

}
