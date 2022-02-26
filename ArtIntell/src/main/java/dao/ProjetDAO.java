package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Projet;

public class ProjetDAO implements IProjet{

	@Override
	public Projet save(Projet projet) {
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement statementInsert = connection.prepareStatement
					("INSERT INTO PROJET (NOM, DETUDE, STATUT, TAILLE) VALUES (?,?,?,?)");
			statementInsert.setString(1, projet.getNom());
			statementInsert.setString(2, projet.getdEtude());
			statementInsert.setString(3, projet.getStatut());
			statementInsert.setString(4, projet.getTaille());
			
			statementInsert.execute();
			
			PreparedStatement statementSelect = connection.prepareStatement
					("SELECT MAX(ID) AS MAX_ID FROM PROJET");
			ResultSet set = statementSelect.executeQuery();
			
			if (set.next()) {
				projet.setId_projet(set.getString("MAX_ID"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return projet;
	}

	@Override
	public List<Projet> projetParMC(String mc) {
		List<Projet> projets = new ArrayList<Projet>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement
					("SELECT * FROM PROJET WHERE NOM LIKE ?");
			statement.setString(1, mc);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				Projet projet = new Projet();
				projet.setId_projet(set.getString("ID"));
				projet.setNom(set.getString("NOM"));
				projet.setdEtude(set.getString("DETUDE"));
				projet.setStatut(set.getString("STATUT"));
				projet.setTaille(set.getString("TAILLE"));
				
				projets.add(projet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return projets;
	}

	@Override
	public Projet getProjet(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projet update(Projet projet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProjet(String id) {
		// TODO Auto-generated method stub
		
	}

}
