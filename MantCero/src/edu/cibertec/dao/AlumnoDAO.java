package edu.cibertec.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.AlumnoJPA;
import edu.cibertec.jpa.AlumnoJPA;
import edu.cibertec.service.AlumnoService;

public class AlumnoDAO implements AlumnoService {
	EntityManagerFactory emf;
	EntityManager em;
	
	public void Open(){
		emf=Persistence.createEntityManagerFactory("DAWII-Sesion5");
		em=emf.createEntityManager();
	}
	public void Close(){
		em.close();
		emf.close();
	}
	
	@Override
	public AlumnoJPA BuscarAlumno(AlumnoJPA objalu) throws Exception {
		AlumnoJPA obj=null;
		Open();
		try {
			obj=em.find(AlumnoJPA.class, objalu.getNombre());			
		} catch (Exception e) {
			System.out.println("Error DAO "+e.getMessage());
		}finally{
			Close();
		}
		return obj;
	}

	@Override
	public String GrabaAlumno(AlumnoJPA objalu) throws Exception {
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			em.persist(objalu);
			em.getTransaction().commit();
			msg="Se grabo exitosamente";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DAO "+e.getMessage());
			msg="DAO "+e.getMessage();
			em.getTransaction().rollback();
		}finally{
			Close();
		}
		return msg;
	}

	@Override
	public String ModificaAlumno(AlumnoJPA objalu) throws Exception {
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			em.merge(objalu);
			em.getTransaction().commit();
			msg="Se edito exitosamente";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DAO "+e.getMessage());
			msg="DAO "+e.getMessage();
			em.getTransaction().rollback();
		}finally{
			Close();
		}
		return msg;
	}

	@Override
	public String EliminaAlumno(AlumnoJPA objalu) throws Exception {
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			AlumnoJPA obj=null;
			obj = em.find(AlumnoJPA.class, objalu.getNombre());
			if(obj!=null)	em.remove(obj);
			em.getTransaction().commit();
			msg="Se Elimino exitosamente";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DAO "+e.getMessage());
			msg="DAO "+e.getMessage();
			em.getTransaction().rollback();
		}finally{
			Close();
		}
		return msg;
	}

	@Override
	public List<AlumnoJPA> ListaAlumno() throws Exception {
		List<AlumnoJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select u from AlumnoJPA u");
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}

	@Override
	public List<AlumnoJPA> ListaAlumnoEspecialidad(String especialidad)
			throws Exception {
		List<AlumnoJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select u from AlumnoJPA u where u.nivelBean.nivelid= :cod");
			q.setParameter("cod", especialidad);
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}

}
