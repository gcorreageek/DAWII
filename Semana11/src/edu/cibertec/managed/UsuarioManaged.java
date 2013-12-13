package edu.cibertec.managed;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import edu.cibertec.jpa.UsuarioJPA;
import edu.cibertec.service.UsuarioImplementacion;
import edu.cibertec.service.UsuarioService;

@RequestScoped
@ManagedBean
public class UsuarioManaged {

	List<UsuarioJPA> usuarios;
	private UsuarioJPA usuario;
	
	public List<UsuarioJPA> getUsuarios() {
		try {
			//nivelBean.niveldes
//			usuarios.get(0).getNivelBean().getNiveldes()
			usuarios =  usuarioService.ListaUsuario();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return usuarios;
	} 
	public void setUsuarios(List<UsuarioJPA> usuarios) {
		this.usuarios = usuarios;
	}


	UsuarioService usuarioService = new UsuarioImplementacion();
	
	public UsuarioManaged() {
		// TODO Auto-generated constructor stub
	}
	
	public String nuevo(){ 
		return "/ui/nuevoUsuario.jsf";
	}
	
	
	public void listarUsuarios() {
		try {
			usuarios =  usuarioService.ListaUsuario();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public UsuarioJPA getUsuario() {
		if(usuario==null){
			usuario = new UsuarioJPA();
		}
		return usuario;
	}
	public void setUsuario(UsuarioJPA usuario) {
		this.usuario = usuario;
	}
	
	
	
}
