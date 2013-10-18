package edu.cibertec.daw2.factory;

import edu.cibertec.daw2.dao.EmpleadoDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public EmpleadoDAO getEmpleadoDAO() {
		// TODO Auto-generated method stub
		return new EmpleadoDAO() ;
	}

}
