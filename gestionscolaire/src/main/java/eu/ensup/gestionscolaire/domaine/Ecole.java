package eu.ensup.gestionscolaire.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ecole implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idecole;
	private String nom;
	private String email;
	private String adresse;
	private String telephone;
	@OneToOne
	private Gestionnaire directeur;

	public Ecole() {
		super();
	}

	public Ecole(String nom, String email, String adresse, String telephone) {
		super();
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getEmail() {
		return email;
	}

	public int getIdecole() {
		return idecole;
	}

	public String getNom() {
		return nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdecole(int idecole) {
		this.idecole = idecole;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Ecole [idecole=" + idecole + ", nom=" + nom + ", email=" + email + ", adresse=" + adresse
				+ ", telephone=" + telephone + "]";
	}

}
