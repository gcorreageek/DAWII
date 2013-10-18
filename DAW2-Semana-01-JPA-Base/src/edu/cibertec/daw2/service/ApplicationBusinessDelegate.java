package edu.cibertec.daw2.service;

import edu.cibertec.daw2.factory.DAOFactory;

public class ApplicationBusinessDelegate {

	// Se especifica la factoria con la cual trabajamos
	// Se hace aqui para no ejecutarlo en cada Service.
	public EmpleadoService getEmpleadoService() {
		return new EmpleadoDaoService( DAOFactory.JPA ); 
	}
	
}
