package edu.cibertec.daw2.service;

import java.util.List;

import edu.cibertec.daw2.bean.EmpleadoDTO;
import edu.cibertec.daw2.dao.EmpleadoDAO;
import edu.cibertec.daw2.factory.DAOFactory;


public class EmpleadoDaoService implements EmpleadoService {

	private DAOFactory fabrica = null;
    private EmpleadoDAO dao = null;
   
    
    public EmpleadoDaoService(int whichFactory) {
    	System.out.println("AYYYY AKI!");
    	fabrica = DAOFactory.getDAOFactory(whichFactory);
    	this.dao = fabrica.getEmpleadoDAO();
    }
	
    public void insertarEmpleado(EmpleadoDTO emp) throws Exception{
    	dao.insertarEmpleado(emp);
    }

    public void actualizarEmpleado(EmpleadoDTO emp) throws Exception{
    	dao.actualizarEmpleado(emp);
    }

    public void eliminarEmpleado(EmpleadoDTO emp) throws Exception{
    	dao.eliminarEmpleado(emp);
    }

    public EmpleadoDTO obtenerEmpleado(EmpleadoDTO emp) throws Exception{
    	return dao.obtenerEmpleado(emp);
    }

    public List<EmpleadoDTO> obtenerTodosEmpleados() throws Exception{
    	return dao.obtenerTodosEmpleados();
    }

	@Override
	public List<EmpleadoDTO> obtenerTodosEmpleadosCriteria() throws Exception {
		// TODO Auto-generated method stub
		return dao.obtenerTodosEmpleados();
	}
}
