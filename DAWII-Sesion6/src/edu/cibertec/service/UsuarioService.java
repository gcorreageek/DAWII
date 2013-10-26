package edu.cibertec.service;


import java.util.List;

import edu.cibertec.jpa.UsuarioJPA;

public interface UsuarioService {
	
	public abstract UsuarioJPA BuscarUsuario(UsuarioJPA objusu) throws Exception;
	public abstract String GrabaUsuario(UsuarioJPA objusu) throws Exception;
	public abstract String ModificaUsuario(UsuarioJPA objusu) throws Exception;
	public abstract String EliminaUsuario(UsuarioJPA objusu) throws Exception;
	public abstract List<UsuarioJPA> ListaUsuario() throws Exception;
	public abstract List<UsuarioJPA> ListaUsuarioNivel(String nivel) throws Exception;
	
}
