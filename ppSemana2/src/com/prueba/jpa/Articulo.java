package com.prueba.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the articulos database table.
 * 
 */
@Entity
@Table(name="articulos")
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="art_cod")
	private String artCod;

	@Column(name="art_nom")
	private String artNom;

	@Column(name="art_pre")
	private BigDecimal artPre;

	@Column(name="art_stk")
	private int artStk;

	@Column(name="art_uni")
	private String artUni;

	//bi-directional many-to-one association to Marca
	@ManyToOne
	@JoinColumn(name="art_marca")
	private Marca marca;

	//bi-directional many-to-one association to FacDeta
	@OneToMany(mappedBy="articulo")
	private List<FacDeta> facDetas;

	public Articulo() {
	}

	public String getArtCod() {
		return this.artCod;
	}

	public void setArtCod(String artCod) {
		this.artCod = artCod;
	}

	public String getArtNom() {
		return this.artNom;
	}

	public void setArtNom(String artNom) {
		this.artNom = artNom;
	}

	public BigDecimal getArtPre() {
		return this.artPre;
	}

	public void setArtPre(BigDecimal artPre) {
		this.artPre = artPre;
	}

	public int getArtStk() {
		return this.artStk;
	}

	public void setArtStk(int artStk) {
		this.artStk = artStk;
	}

	public String getArtUni() {
		return this.artUni;
	}

	public void setArtUni(String artUni) {
		this.artUni = artUni;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<FacDeta> getFacDetas() {
		return this.facDetas;
	}

	public void setFacDetas(List<FacDeta> facDetas) {
		this.facDetas = facDetas;
	}

	public FacDeta addFacDeta(FacDeta facDeta) {
		getFacDetas().add(facDeta);
		facDeta.setArticulo(this);

		return facDeta;
	}

	public FacDeta removeFacDeta(FacDeta facDeta) {
		getFacDetas().remove(facDeta);
		facDeta.setArticulo(null);

		return facDeta;
	}

}