package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
public class Curso   implements Serializable {
//	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo_cur")
	private String codigoCur;

	@Column(name="nombre_cur")
	private String nombreCur;

	@Column(name="precio_cur")
	private int precioCur;

	public Curso() {
	}

	public String getCodigoCur() {
		return this.codigoCur;
	}

	public void setCodigoCur(String codigoCur) {
		this.codigoCur = codigoCur;
	}

	public String getNombreCur() {
		return this.nombreCur;
	}

	public void setNombreCur(String nombreCur) {
		this.nombreCur = nombreCur;
	}

	public int getPrecioCur() {
		return this.precioCur;
	}

	public void setPrecioCur(int precioCur) {
		this.precioCur = precioCur;
	}

}