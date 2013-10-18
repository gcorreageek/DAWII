package com.prueba.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the vendedor database table.
 * 
 */
@Entity
@NamedQuery(name="Vendedor.findAll", query="SELECT v FROM Vendedor v")
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ven_cod;

	@Lob
	private byte[] foto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ven_Fig;

	private String ven_nom;

	//bi-directional many-to-one association to FacCabe
	@OneToMany(mappedBy="vendedor")
	private List<FacCabe> facCabes;

	public Vendedor() {
	}

	public int getVen_cod() {
		return this.ven_cod;
	}

	public void setVen_cod(int ven_cod) {
		this.ven_cod = ven_cod;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Date getVen_Fig() {
		return this.ven_Fig;
	}

	public void setVen_Fig(Date ven_Fig) {
		this.ven_Fig = ven_Fig;
	}

	public String getVen_nom() {
		return this.ven_nom;
	}

	public void setVen_nom(String ven_nom) {
		this.ven_nom = ven_nom;
	}

	public List<FacCabe> getFacCabes() {
		return this.facCabes;
	}

	public void setFacCabes(List<FacCabe> facCabes) {
		this.facCabes = facCabes;
	}

	public FacCabe addFacCabe(FacCabe facCabe) {
		getFacCabes().add(facCabe);
		facCabe.setVendedor(this);

		return facCabe;
	}

	public FacCabe removeFacCabe(FacCabe facCabe) {
		getFacCabes().remove(facCabe);
		facCabe.setVendedor(null);

		return facCabe;
	}

}