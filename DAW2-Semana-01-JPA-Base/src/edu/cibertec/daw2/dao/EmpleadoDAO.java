package edu.cibertec.daw2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import edu.cibertec.daw2.bean.EmpleadoDTO;
import edu.cibertec.daw2.jpa.Empleado;
import edu.cibertec.daw2.service.EmpleadoService;

public class EmpleadoDAO implements EmpleadoService {
	
	
//	JPA-Web
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-Web");
	
	
	
	
	
	@Override
	public void insertarEmpleado(EmpleadoDTO emp) throws Exception {
		EntityManager em = emf.createEntityManager();
		try { 
			Empleado empJPA = new Empleado();
			empJPA.setId(emp.getCodigo());
			empJPA.setNombres(emp.getNombre());
			empJPA.setApellido(emp.getApellido());
			empJPA.setEdad(emp.getEdad());
			em.getTransaction().begin();
			em.persist(empJPA);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		
	}

	@Override
	public void actualizarEmpleado(EmpleadoDTO emp) throws Exception {
		EntityManager em = emf.createEntityManager();
		try { 
			
			Empleado empJPA = new Empleado();
			empJPA.setId(emp.getCodigo());
			empJPA.setNombres(emp.getNombre());
			empJPA.setApellido(emp.getApellido());
			empJPA.setEdad(emp.getEdad());
			
			
			em.getTransaction().begin();
			em.merge(empJPA);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
	}

	@Override
	public void eliminarEmpleado(EmpleadoDTO emp) throws Exception {
		EntityManager em = emf.createEntityManager();  
		try {
			Empleado obj = em.find(Empleado.class, emp.getCodigo());
			
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		
	}

	@Override
	public EmpleadoDTO obtenerEmpleado(EmpleadoDTO emp) throws Exception {
		EntityManager em = emf.createEntityManager();  
		EmpleadoDTO empJPA =  null;
		try {

			
			Empleado obj = em.find(Empleado.class, emp.getCodigo());
			 empJPA = new EmpleadoDTO(obj.getId(), obj.getNombres(),obj.getApellido(), obj.getEdad());
			
			 
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		return empJPA;
	}

//	EntityManager em = getEntityManager();
//	CriteriaBuilder qb = em.getCriteriaBuilder();
//	CriteriaQuery<Employee> query = qb.createQuery(Employee.class);
//	Root<Employee> employee = query.from(Employee.class);
//	query.where(qb.equal(employee.get("firstName"), "Bob"));
//	List<Employee> result = em.createQuery(query).getResultList();
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmpleadoDTO> obtenerTodosEmpleados() throws Exception {
		EntityManager em = emf.createEntityManager();  
		List<EmpleadoDTO> lstEmpleadoJPA = new ArrayList<EmpleadoDTO>();
		try {
			Query q = em.createQuery("select e from Empleado e");
			List<Empleado> lstEmpleado = q.getResultList();
			for (Empleado empleado : lstEmpleado) {
				EmpleadoDTO  empDto = new EmpleadoDTO();
				empDto.setCodigo(empleado.getId());
				empDto.setNombre(empleado.getNombres());
				empDto.setApellido(empleado.getApellido());
				empDto.setEdad(empleado.getEdad());
				lstEmpleadoJPA.add(empDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			em.close();
		}
		
		
		return lstEmpleadoJPA;
	}

	@Override
	public List<EmpleadoDTO> obtenerTodosEmpleadosCriteria() throws Exception {
		EntityManager em = emf.createEntityManager(); 
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<Empleado> query= qb.createQuery(Empleado.class);
//		Root<Empleado> employee 
		
		
		
		return null;
	}

}
