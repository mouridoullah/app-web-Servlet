package metier;

import model.Projet;

public class BQualification {

public static String Analyser(Projet projet) {

		switch (projet.getdEtude()) {
			case "Product_and_application_dévelopment":
				return "accepté";
			case "Data_Engineering":
				return "accepté";
			case "Business_Intelligence":
				return "accepté";
			case "Data_Science":
				return "accepté";
			case "Social_Media_Analytics":
				return "accepté";
			case "Video_Analytics":
				return "accepté";
			case "Chatbot":
				return "accepté";
			case "Formation_et_transfert_de_connaissances":
				return "accepté";
			default:
				return "refusé, nous ne sommes pas qualifiés pour votre projet";
			
		}
	}
}
