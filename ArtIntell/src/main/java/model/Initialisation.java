package model;

import java.util.Random;

public class Initialisation {

 		
    public static String getFirstName() {
    	 String[] listPrenom = {"El Mamoun", "lydia", "Houssam","NASSIM","KOUSSAILA","GHILES","MOHAMMED","Farah","Yasmine",
				  "Kawtar","JULIEN", "MOHAMED RAMDANE","SARRA","MOUSSA","Amina","Imane","TOUFIK","AMIR","Khaoula",
				  "YESSIROU ARISTO","JULIEN","nassim","SYLVIE","Amine","Sofia", "JEFF","Sakhite","Abdellatif",
				  "Mohamed Amine","MAMADOU","NADJIB","SÉVERINE","MOHAMED-AMOKRANE","CHERIF AMANATOULHA","junyi",
				  " sidi mohamed hicham"};
       
        Integer random  = new Random().nextInt(listPrenom.length);
        return listPrenom[random];
    }

    public static String getLastName() {
    	 String[] listNom = {"AFFANE-AJI", "AGUINI", "ALI", "AMIROUCHE", "ARAB", "BABOU", "BOUKHARI", "BOURRAR",
				   "BOUSSAID", "CHMICHI", "DAURAT", "DEBIANE", "DOUGGUI", "EL HABAR", "FERHATI" ,"GHOUZALI", 
				   "GUENANE", "HAMMAD", "HASSOUNE", "HOUESSOU", "JACQUET", "KABACHE", "KHAMDARANIKORN", 
				   "LAIOU", "LANOUNI", "LIM", "MBOUP", "MISSOUMI", "MKHAIBOU", "NDIAYE", "RAHMANI", "SELAQUET", 
				   "SELMI", "SY", "WU", "ZEKRI" };

        Integer random = new Random().nextInt(listNom.length);
        return listNom[random];
    }
    
    public static String getRandNomEquipe() {
        String[] list = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Raleigh", "Columbia", "Denver", 
                "Hartford", "Bismarck", "Pierre", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", 
                "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", 
                "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", 
                "Albany", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Nashville", "Austin", 
                "Salt Lake City", "Montpelier", "Richmond", "Charleston", "Olympia", "Madison", "Cheyenne" }; 
        Integer random = new Random().nextInt(list.length);
        return list[random];
    }

}
