package edu.cibertec.factory;



import edu.cibertec.dao.NivelDAO;
import edu.cibertec.dao.UsuarioDAO;

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


}
