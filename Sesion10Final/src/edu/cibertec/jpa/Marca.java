package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the marcas database table.
 * 
 */
@Entity
@Table(name="marcas")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idmarca;

	private String desmarca;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="marca")
	private Set<Articulo> articulos;

    public Marca() {
    }

	public String getIdmarca() {
		return this.idmarca;
	}

	public void setIdmarca(String idmarca) {
		this.idmarca = idmarca;
	}

	public String getDesmarca() {
		return this.desmarca;
	}

	public void setDesmarca(String desmarca) {
		this.desmarca = desmarca;
	}

	public Set<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}
	
}