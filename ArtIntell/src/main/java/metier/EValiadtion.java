package metier;

import java.util.Random;

import model.Projet;

public class EValiadtion {
	
	public static String Valider(Projet projet){
        Random r = new Random();
        int n = r.nextInt(25); 
		if(n >= 7) {
			return "Le projet : "+projet.getNom()+
					"\nID : "+projet.getId_projet()+
					"\nEquipe : "+projet.getId_equipe()+
					"\nID Chef de projet : "+projet.getChef_projet()+
					"\nNom de l'Equipe : "+projet.getEquipe();
		}else {
			return "Nous sommes desol�, nous ne pouvons pas donn� uns suite favorable � la poursuite du projet";
		}
		
	}
}
