package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the nivel database table.
 * 
 */
@Entity
@Table(name="nivel")
public class NivelJPA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nivelid;

	private String niveldes;

	//bi-directional many-to-one association to UsuarioJPA
	@OneToMany(mappedBy="nivelBean")
	private Set<UsuarioJPA> usuarios;

    public NivelJPA() {
    }

	public String getNivelid() {
		return this.nivelid;
	}

	public void setNivelid(String nivelid) {
		this.nivelid = nivelid;
	}

	public String getNiveldes() {
		return this.niveldes;
	}

	public void setNiveldes(String niveldes) {
		this.niveldes = niveldes;
	}

	public Set<UsuarioJPA> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<UsuarioJPA> usuarios) {
		this.usuarios = usuarios;
	}
	
}