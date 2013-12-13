package edu.cibertec.daw2.bean;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable {

	private Integer codigo;
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public EmpleadoDTO() {
	}

	public EmpleadoDTO(Integer codigo, String nombre,String apellido,  Integer edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
