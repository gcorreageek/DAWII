package com.prueba.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the fac_cabe database table.
 * 
 */
@Entity
@Table(name="fac_cabe")
@NamedQuery(name="FacCabe.findAll", query="SELECT f FROM FacCabe f")
public class FacCabe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fac_num")
	private String facNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fac_fec")
	private Date facFec;

	@Column(name="fac_igv")
	private String facIgv;

	//bi-directional many-to-one association to Vendedor
	@ManyToOne
	@JoinColumn(name="ven_cod")
	private Vendedor vendedor;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="cli_cod")
	private Cliente cliente;

	//bi-directional many-to-one association to FacDeta
	@OneToMany(mappedBy="facCabe")
	private List<FacDeta> facDetas;

	public FacCabe() {
	}

	public String getFacNum() {
		return this.facNum;
	}

	public void setFacNum(String facNum) {
		this.facNum = facNum;
	}

	public Date getFacFec() {
		return this.facFec;
	}

	public void setFacFec(Date facFec) {
		this.facFec = facFec;
	}

	public String getFacIgv() {
		return this.facIgv;
	}

	public void setFacIgv(String facIgv) {
		this.facIgv = facIgv;
	}

	public Vendedor getVendedor() {
		return this.vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<FacDeta> getFacDetas() {
		return this.facDetas;
	}

	public void setFacDetas(List<FacDeta> facDetas) {
		this.facDetas = facDetas;
	}

	public FacDeta addFacDeta(FacDeta facDeta) {
		getFacDetas().add(facDeta);
		facDeta.setFacCabe(this);

		return facDeta;
	}

	public FacDeta removeFacDeta(FacDeta facDeta) {
		getFacDetas().remove(facDeta);
		facDeta.setFacCabe(null);

		return facDeta;
	}

}