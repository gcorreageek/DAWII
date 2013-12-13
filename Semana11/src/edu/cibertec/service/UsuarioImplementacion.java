package edu.cibertec.service;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.UsuarioJPA;

public class UsuarioImplementacion implements UsuarioService{

	DAOFactory factory=DAOFactory.getFactory(1);
	UsuarioService dao=factory.getUsuarioService();
	@Override
	public UsuarioJPA BuscarUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		return dao.BuscarUsuario(objusu);
	}
	@Override
	public String GrabaUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		return dao.GrabaUsuario(objusu);
	}
	@Override
	public String ModificaUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		return dao.ModificaUsuario(objusu);
	}
	@Override
	public String EliminaUsuario(UsuarioJPA objusu) throws Exception {
		// TODO Auto-generated method stub
		return dao.EliminaUsuario(objusu);
	}
	@Override
	public List<UsuarioJPA> ListaUsuario() throws Exception {
		// TODO Auto-generated method stub
		return dao.ListaUsuario();
	}
	@Override
	public List<UsuarioJPA> ListaUsuarioNivel(String nivel) throws Exception {
		// TODO Auto-generated method stub
		return dao.ListaUsuarioNivel(nivel);
	}

}
