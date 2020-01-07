package eu.ensup.gestionscolaire.service;

import java.util.List;

import eu.ensup.gestionscolaire.domaine.Cours;
import eu.ensup.gestionscolaire.domaine.Etudiant;

public interface IGestionnaireService {
	public boolean associerEtudiantCours(Etudiant etu, Cours c);

	public boolean creerCours(Cours c);

	public boolean creerEtudiant(Etudiant etu);

	public Etudiant lireEtudiant(int id);

	public List<Etudiant> listerTousEtudiants();

	public boolean modifierEtudiant(Etudiant etu);

	public boolean seConnecter(String login, String pwd);

	public boolean supprimerEtudiant(int id);

}
