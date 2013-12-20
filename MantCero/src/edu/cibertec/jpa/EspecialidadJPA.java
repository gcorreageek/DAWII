package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the nivel database table.
 * 
 */
@Entity
@Table(name="especialidad")
public class EspecialidadJPA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idEspecialidad;

	 
	private String especialidadnombre;

	//bi-directional many-to-one association to UsuarioJPA
	@OneToMany(mappedBy="especialidadBean")
	private Set<AlumnoJPA> alumnos;

    public EspecialidadJPA() {
    }

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

 

	public Set<AlumnoJPA> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<AlumnoJPA> alumnos) {
		this.alumnos = alumnos;
	}

	public String getEspecialidadnombre() {
		return especialidadnombre;
	}

	public void setEspecialidadnombre(String especialidadnombre) {
		this.especialidadnombre = especialidadnombre;
	}
    
    
    

 
	
}