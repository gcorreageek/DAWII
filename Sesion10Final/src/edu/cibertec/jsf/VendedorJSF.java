package edu.cibertec.jsf;

import java.io.IOException;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import edu.cibertec.jpa.Vendedor;
import edu.cibertec.services.VendedorImplementacion;

@ManagedBean(name="vendedor")
@SessionScoped
public class VendedorJSF {
	private String sesion_nombre;
	
private int ven_cod;
private String password;
   private Date date1,date2;
   private List<Vendedor> vendedores;
   private Vendedor selectedvendedor;
   private VendedorImplementacion vendedori=new VendedorImplementacion();
   
   public void logueo() throws IOException{
	   	if(getSesion_nombre()==null){
	   		FacesContext.getCurrentInstance().
   			getExternalContext().redirect("ingreso.xhtml");
	   	}
   }
   
   public void cerrar(ActionEvent e) throws IOException{
	   setSesion_nombre(null);
       FacesContext.getCurrentInstance().
       			getExternalContext().redirect("principal.xhtml");
   }
   
	public void validar(ActionEvent e) throws IOException{
		
		  //RequestContext context = RequestContext.getCurrentInstance();  
	        FacesMessage msg = null;  
	        boolean loggedIn = false;  
	          
	        //Vendedor ven=vendedori.buscar(x,y);
	        if(getVen_cod() == 123  && getPassword().equals("admin") ) {  
	        	setSesion_nombre("JUANA PEREZ DIAZ");
	            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", "JUANA SALAS");
	            FacesContext.getCurrentInstance().getExternalContext().redirect("principal.xhtml");
	            
	        } else {  
	        	setSesion_nombre(null);
	            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Error en Password");
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	            
	            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "No podra entrar");
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	        }  
	          
	        FacesContext.getCurrentInstance().addMessage(null, msg);  
	}
	
	public void setVen_cod(int ven_cod) {
		this.ven_cod = ven_cod;
	}
	public int getVen_cod() {
		return ven_cod;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

	
	
	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<Vendedor> getVendedores() throws Exception {
		vendedores=vendedori.ListaVendedorFechas(this.getDate1(), this.getDate2());
		return vendedores;
	}

	public void setSelectedvendedor(Vendedor selectedvendedor) {
		this.selectedvendedor = selectedvendedor;
	}

	public Vendedor getSelectedvendedor() {
		return selectedvendedor;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public Date getDate2() {
		return date2;
	}

	public void setSesion_nombre(String sesion_nombre) {
		this.sesion_nombre = sesion_nombre;
	}

	public String getSesion_nombre() {
		return sesion_nombre;
	}

	}
