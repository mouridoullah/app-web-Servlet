package model;

import java.io.Serializable;
import java.util.UUID;

public class Projet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id_projet;
	private String nom;
	private String dEtude;
	private String statut;
	private String taille;

	private String prenomClient;
	private String nomClient;
	

	private String id_equipe;
	private String chef_projet;
	private String equipe;
	
	/**
	 * 
	 */
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_projet
	 * @param nom
	 * @param dEtude
	 * @param statut
	 * @param taille
	 * @param prenomClient
	 * @param nomClient
	 * @param id_equipe
	 * @param chef_projet
	 */
	public Projet(String nom, String dEtude, String taille, String prenomClient,
			String nomClient, String chef_projet) {
		super();
		this.id_projet = UUID.randomUUID().toString();
		this.nom = nom;
		this.dEtude = dEtude;
		this.statut = "";
		this.taille = taille;
		this.prenomClient = prenomClient;
		this.nomClient = nomClient;
		this.id_equipe = "";
		this.chef_projet = "";
		this.equipe = "";
	}

	/**
	 * @return the id_projet
	 */
	public String getId_projet() {
		return id_projet;
	}

	/**
	 * @param id_projet the id_projet to set
	 */
	public void setId_projet(String id_projet) {
		this.id_projet = id_projet;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the dEtude
	 */
	public String getdEtude() {
		return dEtude;
	}

	/**
	 * @param dEtude the dEtude to set
	 */
	public void setdEtude(String dEtude) {
		this.dEtude = dEtude;
	}

	/**
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}

	/**
	 * @return the taille
	 */
	public String getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(String taille) {
		this.taille = taille;
	}

	/**
	 * @return the prenomClient
	 */
	public String getPrenomClient() {
		return prenomClient;
	}

	/**
	 * @param prenomClient the prenomClient to set
	 */
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	/**
	 * @return the nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}

	/**
	 * @param nomClient the nomClient to set
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	/**
	 * @return the id_equipe
	 */
	public String getId_equipe() {
		return id_equipe;
	}

	/**
	 * @param id_equipe the id_equipe to set
	 */
	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	/**
	 * @return the chef_projet
	 */
	public String getChef_projet() {
		return chef_projet;
	}

	/**
	 * @param chef_projet the chef_projet to set
	 */
	public void setChef_projet(String chef_projet) {
		this.chef_projet = chef_projet;
	}

	/**
	 * @return the equipe
	 */
	public String getEquipe() {
		return equipe;
	}

	/**
	 * @param equipe the equipe to set
	 */
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
		
}
