package edu.cibertec.managemend;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.cibertec.jpa.ClienteJPA;

public class ClienteManagedBean {
  
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
	public String Grabar() throws Exception {
		try {
			Open();
			ClienteJPA cli =null;
			cli = (ClienteJPA) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("clientejpa");
			System.out.println("Logger:"+cli.getDircliente()+"|"+cli.getNomcliente());
			
			em.getTransaction().begin();
			em.persist(cli);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally{
			Close();
		}
		return "listado";
	}
	
	
	
	
	
}
