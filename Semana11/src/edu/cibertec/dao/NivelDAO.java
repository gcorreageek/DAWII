package edu.cibertec.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.NivelJPA;
import edu.cibertec.jpa.UsuarioJPA;
import edu.cibertec.service.NivelService;

public class NivelDAO implements NivelService {
	EntityManagerFactory emf;
	EntityManager em;
	
	public void Open(){
		emf=Persistence.createEntityManagerFactory("Semana11");
		em=emf.createEntityManager();
	}
	public void Close(){
		em.close();
		emf.close();
	}
	@Override
	public List<NivelJPA> listadonivel() throws Exception {
		List<NivelJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select n from NivelJPA n");
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}

}
