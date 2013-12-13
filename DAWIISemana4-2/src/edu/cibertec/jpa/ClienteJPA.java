package edu.cibertec.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="cliente")
public class ClienteJPA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcliente; 
	private String nomcliente;
	private String dircliente;
	
	//bi-directional many-to-one association to NivelJPA
//    @ManyToOne
//	@JoinColumn(name="nivel")
//	private NivelJPA nivelBean;

   public ClienteJPA() {
	// TODO Auto-generated constructor stub
}

public Integer getIdcliente() {
	return idcliente;
}

public void setIdcliente(Integer idcliente) {
	this.idcliente = idcliente;
}

public String getNomcliente() {
	return nomcliente;
}

public void setNomcliente(String nomcliente) {
	this.nomcliente = nomcliente;
}

public String getDircliente() {
	return dircliente;
}

public void setDircliente(String dircliente) {
	this.dircliente = dircliente;
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
}