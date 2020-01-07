package eu.ensup.gestionscolaire.dao;

import java.util.List;

import eu.ensup.gestionscolaire.domaine.Cours;
import eu.ensup.gestionscolaire.domaine.Etudiant;

public interface IDao {

	public boolean associerEtudiantCours(Etudiant etu, Cours c);

	public boolean createCours(Cours c);

	public boolean createEtudiant(Etudiant etu);

	public boolean deleteEtudiant(int id);

	public List<Etudiant> getAllEtudiant();

	public Etudiant readEtudiant(int id);

	public boolean seConnecter(String login, String pwd);

	public boolean updateEtudiant(Etudiant etu);

}
