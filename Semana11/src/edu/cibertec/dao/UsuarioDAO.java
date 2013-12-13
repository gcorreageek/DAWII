package edu.cibertec.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.jpa.UsuarioJPA;
import edu.cibertec.service.UsuarioService;

public class UsuarioDAO implements UsuarioService{

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
	public UsuarioJPA BuscarUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		UsuarioJPA obj=null;
		Open();
		try {
			obj=em.find(UsuarioJPA.class, objusu.getUsernom());			
		} catch (Exception e) {
			System.out.println("Error DAO "+e.getMessage());
		}finally{
			Close();
		}
		return obj;
	}
	@Override
	public String GrabaUsuario(UsuarioJPA objusu) throws Exception {
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			em.persist(objusu);
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
	public String ModificaUsuario(UsuarioJPA objusu) throws Exception {
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			em.merge(objusu);
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
	public String EliminaUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		String msg="";
		try {
			Open();
			em.getTransaction().begin();
			UsuarioJPA obj=null;
			obj = em.find(UsuarioJPA.class, objusu.getUsernom());
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
	public List<UsuarioJPA> ListaUsuario() throws Exception {
		// TODO Auto-generated method stub
		List<UsuarioJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select u from UsuarioJPA u");
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}
	@Override
	public List<UsuarioJPA> ListaUsuarioNivel(String nivel) throws Exception {
		List<UsuarioJPA> lista=null;
		Open();
		try {
			Query q=em.createQuery("select u from UsuarioJPA u where u.nivelBean.nivelid= :cod");
			q.setParameter("cod", nivel);
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("DAO "+e.getMessage());
			// TODO: handle exception
		}
		Close();
		
		return lista;
	}

}







