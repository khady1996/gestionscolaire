package eu.ensup.gestionscolaire.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Etudiant extends Personne {

	private String date_naissance;
	@ManyToMany
	private List<Cours> mescours = new ArrayList<>();

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String email, String telephone, String adresse, String date_naissance) {
		// TODO Auto-generated constructor stub
		super(nom, prenom, email, telephone, adresse);
		this.date_naissance = date_naissance;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public List<Cours> getMescours() {
		return mescours;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public void setMescours(List<Cours> mescours) {
		this.mescours = mescours;
	}

}
