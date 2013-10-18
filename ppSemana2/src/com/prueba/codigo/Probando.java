package com.prueba.codigo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.prueba.jpa.Articulo;
import com.prueba.jpa.FacCabe;
import com.prueba.jpa.FacDeta;
import com.prueba.jpa.Marca;

public class Probando {
	public static EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ppSemana2");
	public static EntityManager em = emf.createEntityManager();
	
	
	private static void Grabar() {
		
		try {
			Articulo art = new Articulo();
			art.setArtCod("A346");
			art.setArtNom("ARTICULO BB");
			art.setArtUni("005");
//			art.setArtPre(artPre);
			Marca marca = em.find(Marca.class, "IBM");
			art.setMarca(marca);
			
//			'A345', 'ARTICULO A', 'kg', NULL, '10', 'IBM'

//			Curso obj = new Curso();
//			obj.setCodigoCur("004");
//			obj.setNombreCur("DAWII");
//			obj.setPrecioCur(10); 
			
			em.getTransaction().begin();
			em.persist(art);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static void ListarFacturaDetalle(){
		try { 
			Query eq = em.createQuery("select a from FacCabe a where a.cliente.cliNom like :a ");
			eq.setParameter("a", "%A");
			List<FacCabe> lstAlumno = eq.getResultList();
			for (FacCabe alumno : lstAlumno) {
				System.out.println("-------------------------------");
				System.out.println("Factura:");
				System.out.println(alumno.getFacNum()+"|"+alumno.getFacFec()+"|"+alumno.getCliente().getCliNom()+"|"+alumno.getVendedor().getVen_nom());
//				System.out.println("-------------------------------");
				System.out.println("Detalle");
				List<FacDeta> lstDetalle= alumno.getFacDetas();
//				double monto = 0;
				for (FacDeta facDeta : lstDetalle) {
					double monto   = facDeta.getArtCan() * Double.parseDouble(facDeta.getArticulo().getArtPre().toString());
					System.out.println(facDeta.getFacId()+"|"+facDeta.getArticulo().getArtNom()+"|"+facDeta.getArticulo().getArtPre()+"|"+facDeta.getArtCan()+"|"+monto);
				}
			}    
		} catch (Exception e) {
			e.getStackTrace();
		} 
	}
	
	
	public static void main(String[] args) {
		ListarFacturaDetalle();
	}

}
