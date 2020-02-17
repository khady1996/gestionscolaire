package eu.ensup.gestionscolaire.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.gestionscolaire.domaine.Cours;
import eu.ensup.gestionscolaire.domaine.Etudiant;

public class DaoImpl implements IDao {

	EntityManagerFactory emf;
	EntityManager em;

	@Override
	public boolean associerEtudiantCours(Etudiant etu, Cours c) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		etu.getMescours().add(c);
		try {
			tx.begin();

			em.merge(etu);
			tx.commit();
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return false;
		}

	}

	@Override
	public boolean createCours(Cours c) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(c);
			tx.commit();
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean createEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(etu);
			tx.commit();
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return false;
		}

	}

	@Override
	public boolean deleteEtudiant(int id) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(em.getReference(Etudiant.class, id));
			tx.commit();
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return false;
		}

	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		Query req = em.createQuery("select e from Etudiant e");
		return req.getResultList();
	}

	@Override
	public Etudiant readEtudiant(int id) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();

		Etudiant etu = em.getReference(Etudiant.class, id);
		return etu;

	}

	@Override
	public boolean seConnecter(String login, String pwd) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		Query req = em.createQuery(
				"select gest from Gestionnaire gest where login ='" + login + "' and password = '" + pwd + "'");
		System.out.println(req.getResultList().size());
		if (req.getResultList().size() > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean updateEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestionscolaire");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(etu);
			tx.commit();
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return false;
		}

	}

}
