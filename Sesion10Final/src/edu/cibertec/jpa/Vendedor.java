package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vendedor database table.
 * 
 */
@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Ven_cod")
	private int ven_cod;

    @Lob()
	private byte[] foto;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="Ven_Fig")
	private Date ven_Fig;

	@Column(name="Ven_nom")
	private String ven_nom;

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

}