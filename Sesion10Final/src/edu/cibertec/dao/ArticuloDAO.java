package edu.cibertec.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.Articulo;
import edu.cibertec.jpa.Marca;
import edu.cibertec.services.ArticuloServices;





public class ArticuloDAO implements ArticuloServices {
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
	public List<Articulo> ListadoArticulos() throws Exception {
		List<Articulo> lista=null;
		Open();
		try {
			Query q=em.createQuery("select a from Articulo a");
			lista = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Close();		
		return lista;

	}
	@Override
	public List<Articulo> ListadoArticulosMarca(String art_marca)
			throws Exception {
		List<Articulo> lista=null;
		Open();
		try {
			Query q=em.createQuery("select a from Articulo a where a.marca.idmarca=:xmarca");
			q.setParameter("xmarca", art_marca);
			lista = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Close();		
		return lista;
		}

}
