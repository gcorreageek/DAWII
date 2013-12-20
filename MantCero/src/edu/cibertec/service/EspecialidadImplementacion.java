package edu.cibertec.service;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.EspecialidadJPA;

public class EspecialidadImplementacion implements EspecialidadService {
	DAOFactory factory=DAOFactory.getFactory(1);
	EspecialidadService dao=factory.getEspecialidadService();
 
	@Override
	public List<EspecialidadJPA> listadoespecialidad() throws Exception {
		 return dao.listadoespecialidad();
	}

}
