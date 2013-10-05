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
			for (Curso curso : (List<Curso>)lista.getResultList()) {
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur());
			} 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	private static void Listar2() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj ;
			Query q = em.createQuery("select c  from Curso c where c.nombreCur like :nom");
			q.setParameter("nom", "%A%");
			
			for (Curso curso : (List<Curso>)q.getResultList()) {
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur());
			} 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	private static void Listar3() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj ;
			Query q = em.createNamedQuery("Consulta3");
			q.setParameter(1, 200);
			q.setParameter(2, 500);
			
			for (Curso curso : (List<Curso>)q.getResultList()) {
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur());
			} 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void Listar4() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try {
			Curso obj ;
			Query q = em.createNamedQuery("Consulta2");
			q.setParameter("variable1", 200);
			q.setParameter("variable2", 500);
			
			for (Curso curso : (List<Curso>)q.getResultList()) {
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur());
			} 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	private static void Listar5() {
		EntityManagerFactory emf;
		EntityManager em;
		emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppPrueba");
		em = emf.createEntityManager();
		try { 
			Query q = em.createNamedQuery("Consulta4");
			q.setParameter(1, "001"); 
			Curso curso = null;
			
			try {
				curso = (Curso) q.getSingleResult();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			if(curso!=null){
				System.out.println("Pasa:"+curso.getCodigoCur()+"|"+curso.getNombreCur()); 	
			} else{
				
				System.out.println("errror!");
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
		Listar5();
	}

}
