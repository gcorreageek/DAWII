package edu.cibertec.services;

import java.util.List;

import edu.cibertec.jpa.FacCabe;

public interface FacturaServices {
	public abstract List<FacCabe> ListaFacturaVendedor(int codven)throws Exception;
}
