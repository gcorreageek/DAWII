package edu.cibertec.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="alumno")
public class AlumnoJPA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue
	private Integer idAlumno;

	private String email;

	private String nombre;

	private String telefono; 
	
	//bi-directional many-to-one association to NivelJPA
    @ManyToOne
	@JoinColumn(name="idespecialidad")
	private EspecialidadJPA  especialidadBean;

    public AlumnoJPA() {
    	especialidadBean=new EspecialidadJPA();
    }

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

//	public String getCorreo() {
//		return correo;
//	}
//
//	public void setCorreo(String correo) {
//		this.correo = correo;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public EspecialidadJPA getEspecialidadBean() {
		return especialidadBean;
	}

	public void setEspecialidadBean(EspecialidadJPA especialidadBean) {
		this.especialidadBean = especialidadBean;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
 
	
}