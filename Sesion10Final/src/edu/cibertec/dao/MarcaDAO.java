package edu.cibertec.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.Marca;
import edu.cibertec.services.MarcaServices;


public class MarcaDAO implements MarcaServices {
	EntityManagerFactory emf;
	EntityManager em;
	
	public void Open(){
		emf=Persistence.createEntityManagerFactory("DAWII-Sesion10");
		em=emf.createEntityManager();
	}
	public void Close(){
		em.close();
		emf.close();
	}
	@Override
	public List<Marca> ListadoMarcas() throws Exception {
		List<Marca> lista=null;
		Open();
		try {
			Query q=em.createQuery("select m from Marca m");
			lista = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Close();		
		return lista;

	}
	

}
