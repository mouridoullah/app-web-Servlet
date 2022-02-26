package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CAffectation;
import metier.AReception;
import metier.DPlannification;
import metier.BQualification;
import metier.EValiadtion;
import model.Projet;

@WebServlet(name = "cs", urlPatterns = {"/controleur", "*.php"})
public class Controleur extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nom;
	private String dEtude;

	private String taille;

	private String prenomClient;
	private String nomClient;
	
	private String chef_projet;
	
	Projet projet;
	
	@Override
	public void init() throws ServletException {

		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("Projet", new Projet());
		request.getRequestDispatcher("Vue.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nomClient = request.getParameter("last_name");
		prenomClient = request.getParameter("first_name");
		nom = request.getParameter("project_name");
		taille = request.getParameter("project_size");
		dEtude = request.getParameter("project_area");
		
		projet = new Projet(nom, dEtude, taille, prenomClient, nomClient, chef_projet);

		projet.setStatut(AReception.Notifier(projet));
		
		
		projet.setStatut(BQualification.Analyser(projet));
		
		if(projet.getStatut() == "accepté") {
			projet.setStatut(CAffectation.Affecter(projet));

			if(projet.getStatut() == "projet affecté") {
				projet.setStatut(DPlannification.Plannifier(projet));
				
				if(projet.getStatut() != "On a pas les ressources pour votre projet ") {
					projet.setStatut(EValiadtion.Valider(projet));

				}
			}
			
		}
		
		request.setAttribute("Projet", projet);
		
		request.getRequestDispatcher("Vue.jsp").forward(request, response);
		
	}

}
