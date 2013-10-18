package com.prueba.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fac_deta database table.
 * 
 */
@Entity
@Table(name="fac_deta")
@NamedQuery(name="FacDeta.findAll", query="SELECT f FROM FacDeta f")
public class FacDeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fac_id")
	private int facId;

	@Column(name="art_can")
	private int artCan;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="art_cod")
	private Articulo articulo;

	//bi-directional many-to-one association to FacCabe
	@ManyToOne
	@JoinColumn(name="fac_num")
	private FacCabe facCabe;

	public FacDeta() {
	}

	public int getFacId() {
		return this.facId;
	}

	public void setFacId(int facId) {
		this.facId = facId;
	}

	public int getArtCan() {
		return this.artCan;
	}

	public void setArtCan(int artCan) {
		this.artCan = artCan;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public FacCabe getFacCabe() {
		return this.facCabe;
	}

	public void setFacCabe(FacCabe facCabe) {
		this.facCabe = facCabe;
	}

}