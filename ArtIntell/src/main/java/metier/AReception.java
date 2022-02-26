package metier;

import model.Projet;

public class AReception {
	public static String Notifier(Projet projet) {
		return "Le projet : "+projet.getNom()+
				"\nID : "+projet.getId_projet()+
				"  est bien reçu";
	}
}
