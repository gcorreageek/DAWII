package com.prueba.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the marcas database table.
 * 
 */
@Entity
@Table(name="marcas")
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idmarca;

	private String desmarca;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="marca")
	private List<Articulo> articulos;

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

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo addArticulo(Articulo articulo) {
		getArticulos().add(articulo);
		articulo.setMarca(this);

		return articulo;
	}

	public Articulo removeArticulo(Articulo articulo) {
		getArticulos().remove(articulo);
		articulo.setMarca(null);

		return articulo;
	}

}