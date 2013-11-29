package edu.cibertec.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import edu.cibertec.jpa.FacCabe;
import edu.cibertec.jpa.Vendedor;
import edu.cibertec.services.FacturaServices;

public class FacturaDAO implements FacturaServices{
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
	public List<FacCabe> ListaFacturaVendedor(int codven) throws Exception {
		List<FacCabe> lista=null;
		Open();
		try {			
				Query q=em.createQuery("select f from " +
						" FacCabe f where f.vendedor.ven_cod=:codven");
				q.setParameter("codven",codven);				
				lista = q.getResultList();		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		Close();		
		return lista;

	}

}
