package edu.cibertec.managed;

public class UsuarioManagedBean {

	private String login;
	private String password;
	private String nombre;
	
	public String validar(){
		String resultado = "error";
		if("cibertec".equals(login) && "123456".equals(password)){
			setNombre("Juanoto Perez");
			resultado = "exito";
		}
		
		
		
		return resultado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
}
