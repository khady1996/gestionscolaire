package eu.ensup.gestionscolaire.service;

import java.util.List;

import eu.ensup.gestionscolaire.dao.DaoImpl;
import eu.ensup.gestionscolaire.dao.IDao;
import eu.ensup.gestionscolaire.domaine.Cours;
import eu.ensup.gestionscolaire.domaine.Etudiant;

public class GestionnaireService implements IGestionnaireService {
	private IDao dao = new DaoImpl();

	@Override
	public boolean associerEtudiantCours(Etudiant etu, Cours c) {
		// TODO Auto-generated method stub
		return dao.associerEtudiantCours(etu, c);
	}

	@Override
	public boolean creerCours(Cours c) {
		// TODO Auto-generated method stub
		return dao.createCours(c);
	}

	@Override
	public boolean creerEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		return dao.createEtudiant(etu);
	}

	@Override
	public Etudiant lireEtudiant(int id) {
		// TODO Auto-generated method stub
		return dao.readEtudiant(id);
	}

	@Override
	public List<Etudiant> listerTousEtudiants() {
		// TODO Auto-generated method stub
		return dao.getAllEtudiant();
	}

	@Override
	public boolean modifierEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		return dao.updateEtudiant(etu);
	}

	@Override
	public boolean seConnecter(String login, String pwd) {
		// TODO Auto-generated method stub
		return dao.seConnecter(login, pwd);
	}

	@Override
	public boolean supprimerEtudiant(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEtudiant(id);
	}

}
