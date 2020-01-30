package eu.ensup.gestionscolaire.test;

import org.junit.Assert;
import org.junit.Test;

import eu.ensup.gestionscolaire.domaine.Etudiant;
import eu.ensup.gestionscolaire.service.GestionnaireService;

public class TestGestionnaireService {

	// IDao dao = mock(IDao.class);
	GestionnaireService service = new GestionnaireService();

	@Test
	public void testAssociationEtudiantCours() {
		Assert.assertEquals(service.creerEtudiant(new Etudiant("nd", "KH", "H@h", "09873", "trappes", "010287")), true);
	}

	@Test
	public void testLectureEtudiant() {
	}

}
