package edu.cibertec.jsf;


import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.cibertec.jpa.NivelJPA;
import edu.cibertec.jpa.UsuarioJPA;
import edu.cibertec.service.UsuarioImplementacion;

public class UsuarioJSF {
	private UsuarioImplementacion usuarioi=new UsuarioImplementacion();
	private String usernom,userpwd,nombre,correo,nivel;
	private int estado;
	private String mensaje;
	
private	DataModel<UsuarioJPA> usuariosmodel;
private DataModel<UsuarioJPA> usuariosmodelnivel;

	public void Eliminar(ActionEvent e) throws Exception{
		UsuarioJPA obj=new UsuarioJPA();		
		obj.setUsernom(e.getComponent().getAttributes().get("unom").toString());		
		mensaje=usuarioi.EliminaUsuario(obj);		
	}
	
	public void Buscar(ActionEvent e) throws Exception{
		UsuarioJPA obj=new UsuarioJPA();
		
		obj.setUsernom(e.getComponent().getAttributes().get("unom").toString());
		
		obj=usuarioi.BuscarUsuario(obj);
		if(obj!=null){
			setUsernom(obj.getUsernom());
			setUserpwd(obj.getUserpwd());
			setNombre(obj.getNombre());
			setNivel(obj.getNivelBean().getNivelid());
			setCorreo(obj.getCorreo());
			setEstado(1);
		}
	}
	public void Grabar(ActionEvent e) throws Exception{
		UsuarioJPA obj=new UsuarioJPA();
		obj.setUsernom(getUsernom());
		obj.setUserpwd(getUserpwd());
		obj.setNombre(getNombre());
		obj.setCorreo(getCorreo());
		
		NivelJPA objn=new NivelJPA();
		objn.setNivelid(getNivel());
		obj.setNivelBean(objn);
		
		if(getEstado()==1)
			mensaje=usuarioi.ModificaUsuario(obj);
		else			
			mensaje=usuarioi.GrabaUsuario(obj);
	}
	
	public DataModel<UsuarioJPA> getUsuariosmodel() throws Exception {
		usuariosmodel = new ListDataModel<UsuarioJPA>(usuarioi.ListaUsuario());
		return usuariosmodel;
	}

	public void setUsuariosmodel(DataModel<UsuarioJPA> usuariosmodel) {
		this.usuariosmodel = usuariosmodel;
	}

	
    
    
	public String Validar() throws Exception{
		String vista="ERROR";
		UsuarioJPA obj=new UsuarioJPA();
		obj.setUsernom(getUsernom());
		obj=usuarioi.BuscarUsuario(obj);
		if(obj!=null){
			setNombre("JPA:"+obj.getNombre());
			setCorreo(obj.getCorreo());
			vista="SUCCESS";
		}
		return vista;
	}
	
	public String getUsernom() {
		return usernom;
	}

	public void setUsernom(String usernom) {
		this.usernom = usernom;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getEstado() {
		return estado;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setUsuariosmodelnivel(DataModel<UsuarioJPA> usuariosmodelnivel) {
		this.usuariosmodelnivel = usuariosmodelnivel;
	}

	public DataModel<UsuarioJPA> getUsuariosmodelnivel() throws Exception {
		usuariosmodelnivel = new ListDataModel<UsuarioJPA>(usuarioi.ListaUsuarioNivel(getNivel()));
		return usuariosmodelnivel;
	}

}
