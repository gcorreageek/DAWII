package edu.cibertec.managed;



import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import edu.cibertec.jpa.UsuarioJPA;
import edu.cibertec.service.UsuarioImplementacion;

@RequestScoped
@ManagedBean
public class usuarioManaged {

	private List<UsuarioJPA> usuarios;
	private UsuarioJPA usuario=new UsuarioJPA();
	private int estado;
	

	private UsuarioImplementacion usuarioi=new UsuarioImplementacion();

	public String Nuevo(){
	//Limpiar variables
		return "/ui/nuevoUsuario.jsf";
	}
	
   public String Lista(){
		return "/ui/registroUsuario.jsf";
	} 
	
	public void Eliminar(ActionEvent e) throws Exception{
		String xuser;
		xuser=e.getComponent().getAttributes().get("xusernom").toString();
		
		UsuarioJPA obj=new UsuarioJPA();
		obj.setUsernom(xuser);
		usuarioi.EliminaUsuario(obj);
		Lista();
	
	}	
	
	
	
	public String Grabar() throws Exception{
		if(estado==1)
			usuarioi.ModificaUsuario(usuario);
		else 
		usuarioi.GrabaUsuario(usuario);
		
		
		return "/ui/registroUsuario.jsf";	
	}
	
	public void Buscar(ActionEvent e) throws Exception{
		String xusernom;
		xusernom=e.getComponent().getAttributes().get("xusernom").toString();
		
		UsuarioJPA obju=new UsuarioJPA();
		obju.setUsernom(xusernom);
		estado=1;
		usuario=usuarioi.BuscarUsuario(obju);
	}
	
	
	
	
	
	
	public List<UsuarioJPA> getUsuarios() throws Exception {
		usuarios=usuarioi.ListaUsuario();
		return usuarios;
	}

	public void setUsuarios(List<UsuarioJPA> usuarios) {
		this.usuarios = usuarios;
	}
	public UsuarioJPA getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioJPA usuario) {
		this.usuario = usuario;
	}
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
