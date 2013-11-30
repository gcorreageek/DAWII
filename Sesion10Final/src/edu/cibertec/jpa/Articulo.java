package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the articulos database table.
 * 
 */
@Entity
@Table(name="articulos")
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
	private Set<FacDeta> facDetas;

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
	
	public Set<FacDeta> getFacDetas() {
		return this.facDetas;
	}

	public void setFacDetas(Set<FacDeta> facDetas) {
		this.facDetas = facDetas;
	}
	
}