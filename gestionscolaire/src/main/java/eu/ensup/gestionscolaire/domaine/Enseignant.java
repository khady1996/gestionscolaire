package eu.ensup.gestionscolaire.domaine;

import javax.persistence.Entity;

@Entity
public class Enseignant extends Personne {

	private String matiere;

	public Enseignant() {
		super();
	}

	public Enseignant(String matiere) {
		super();
		this.matiere = matiere;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
