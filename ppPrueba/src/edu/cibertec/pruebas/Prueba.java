package edu.cibertec.pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.Curso;

public class Prueba {
	
	
	private static void Grabar() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj = new Curso();
			obj.setCodigoCur("004");
			obj.setNombreCur("DAWII");
			obj.setPrecioCur(10); 
			
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	private static void Eliminar() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj = em.find(Curso.class, "001");
			
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	private static void Listar() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj ;
			Query lista = em.createQuery("select c  from Curso c");
			
//			obj =  lista.getResultList().iterator().next();
//			lista.getResultList().
			
//			List<Curso> lst = lista.getResultList();
			for (Curso curso : (List<Curso>)lista.getResultList()) {
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur());
			}
			
			 
			 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	private static void Modificar() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj = new Curso();
			obj.setCodigoCur("002"); 
			obj.setNombreCur("NOO");
			
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Listar();
	}

}
