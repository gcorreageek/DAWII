package edu.cibertec.services;

import java.util.Date;
import java.util.List;

import edu.cibertec.jpa.Vendedor;

public interface VendedorServices {
	public abstract List<Vendedor> ListaVendedorFechas(Date f1,Date f2) throws Exception;
}
