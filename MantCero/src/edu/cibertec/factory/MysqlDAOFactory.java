package edu.cibertec.factory;



import edu.cibertec.dao.AlumnoDAO;
import edu.cibertec.dao.EspecialidadDAO;
import edu.cibertec.dao.NivelDAO;
import edu.cibertec.dao.UsuarioDAO;
import edu.cibertec.jpa.EspecialidadJPA;

import edu.cibertec.service.AlumnoService;
import edu.cibertec.service.EspecialidadService;
import edu.cibertec.service.NivelService;
import edu.cibertec.service.UsuarioService;

public class MysqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioService getUsuarioService() {
		// TODO Auto-generated method stub
		return new UsuarioDAO();
	}

	@Override
	public NivelService getNivelService() {
		// TODO Auto-generated method stub
		return new NivelDAO();
	}

	@Override
	public AlumnoService getAlumnoService() {
		// TODO Auto-generated method stub
		return new AlumnoDAO();
	}

	@Override
	public EspecialidadService getEspecialidadService() {
		// TODO Auto-generated method stub
		return new EspecialidadDAO();
	}


}
