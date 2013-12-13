package edu.cibertec.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cli_cod")
	private String cliCod;

	@Column(name="cli_cor")
	private String cliCor;

	@Column(name="cli_cre")
	private BigDecimal cliCre;

	@Column(name="cli_dir")
	private String cliDir;

	@Column(name="cli_nom")
	private String cliNom;

	@Column(name="cli_tel")
	private String cliTel;

	//bi-directional many-to-one association to FacCabe
	@OneToMany(mappedBy="cliente")
	private Set<FacCabe> facCabes;

    public Cliente() {
    }

	public String getCliCod() {
		return this.cliCod;
	}

	public void setCliCod(String cliCod) {
		this.cliCod = cliCod;
	}

	public String getCliCor() {
		return this.cliCor;
	}

	public void setCliCor(String cliCor) {
		this.cliCor = cliCor;
	}

	public BigDecimal getCliCre() {
		return this.cliCre;
	}

	public void setCliCre(BigDecimal cliCre) {
		this.cliCre = cliCre;
	}

	public String getCliDir() {
		return this.cliDir;
	}

	public void setCliDir(String cliDir) {
		this.cliDir = cliDir;
	}

	public String getCliNom() {
		return this.cliNom;
	}

	public void setCliNom(String cliNom) {
		this.cliNom = cliNom;
	}

	public String getCliTel() {
		return this.cliTel;
	}

	public void setCliTel(String cliTel) {
		this.cliTel = cliTel;
	}

	public Set<FacCabe> getFacCabes() {
		return this.facCabes;
	}

	public void setFacCabes(Set<FacCabe> facCabes) {
		this.facCabes = facCabes;
	}
	
}