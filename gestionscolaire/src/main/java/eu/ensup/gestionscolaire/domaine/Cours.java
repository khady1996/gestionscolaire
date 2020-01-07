package eu.ensup.gestionscolaire.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cours implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idcours;
	private String theme;
	private float nbre_heures;
	@ManyToMany(mappedBy = "mescours")
	private List<Etudiant> etudiants = new ArrayList<>();

	public Cours() {
		super();
	}

	public Cours(String theme, float nbre_heures) {
		super();
		this.theme = theme;
		this.nbre_heures = nbre_heures;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public int getIdcours() {
		return idcours;
	}

	public float getNbre_heures() {
		return nbre_heures;
	}

	public String getTheme() {
		return theme;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public void setIdcours(int idcours) {
		this.idcours = idcours;
	}

	public void setNbre_heures(float nbre_heures) {
		this.nbre_heures = nbre_heures;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Cours [idcours=" + idcours + ", theme=" + theme + ", nbre_heures=" + nbre_heures + "]";
	}

}
