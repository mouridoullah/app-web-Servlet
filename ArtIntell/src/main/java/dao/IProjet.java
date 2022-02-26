package dao;

import java.util.List;

import model.Projet;

public interface IProjet {
	public Projet save(Projet projet);
	public List<Projet> projetParMC(String mc);
	public Projet getProjet(String id);
	public Projet update(Projet projet);
	public void deleteProjet(String id);
}
