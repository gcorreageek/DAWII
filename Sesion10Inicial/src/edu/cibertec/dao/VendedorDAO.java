package edu.cibertec.dao;




import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import edu.cibertec.jpa.Articulo;
import edu.cibertec.jpa.Vendedor;
import edu.cibertec.services.VendedorServices;

public class VendedorDAO implements VendedorServices {
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
	public List<Vendedor> ListaVendedorFechas(Date f1,Date f2) throws Exception {
		List<Vendedor> lista=null;
		Open();
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
			//if(f1!=null){
				Query q=em.createQuery("select v from Vendedor v");
			//	q.setParameter("f1", f1,TemporalType.DATE);
			//	q.setParameter("f2", f2,TemporalType.DATE);
				lista = q.getResultList();
			//}
		    
		    /*Date tim1 = null,tim2=null;		    
		    tim1=sdf.parse(f1); 
		    tim2=sdf.parse(f2);
*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Close();		
		return lista;

	}

}
