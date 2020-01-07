package eu.ensup.gestionscolaire.domaine;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Gestionnaire extends Personne {

	private String login;
	private String password;
	@OneToOne(mappedBy = "directeur")
	private Ecole school;

	public Gestionnaire() {
		super();
	}

	public Gestionnaire(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
