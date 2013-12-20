package edu.cibertec.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.EspecialidadJPA;
import edu.cibertec.jpa.NivelJPA;
import edu.cibertec.service.EspecialidadService;

public class EspecialidadDAO implements EspecialidadService {
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
	public List<EspecialidadJPA> listadoespecialidad() throws Exception {
		List<EspecialidadJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select n from EspecialidadJPA n");
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}

}
