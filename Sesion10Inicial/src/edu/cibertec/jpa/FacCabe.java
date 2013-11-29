package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fac_cabe database table.
 * 
 */
@Entity
@Table(name="fac_cabe")
public class FacCabe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fac_num")
	private String facNum;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="fac_fec")
	private Date facFec;

	@Column(name="fac_igv")
	private String facIgv;

	//bi-directional many-to-one association to Vendedor
    @ManyToOne
	@JoinColumn(name="ven_cod")
	private Vendedor vendedor;

	//bi-directional many-to-one association to FacDeta
	@OneToMany(mappedBy="facCabe")
	private Set<FacDeta> facDetas;

	//bi-directional many-to-one association to Cliente
    @ManyToOne
	@JoinColumn(name="cli_cod")
	private Cliente cliente;

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
	
	public Set<FacDeta> getFacDetas() {
		return this.facDetas;
	}

	public void setFacDetas(Set<FacDeta> facDetas) {
		this.facDetas = facDetas;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}