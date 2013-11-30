package edu.cibertec.services;

import java.util.Date;
import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.Articulo;
import edu.cibertec.jpa.Vendedor;

public class VendedorImplementacion implements VendedorServices{
	DAOFactory factory=DAOFactory.getFactory(1);
	VendedorServices dao=factory.getVendedorService();
	@Override
	public List<Vendedor> ListaVendedorFechas(Date f1, Date f2)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.ListaVendedorFechas(f1, f2);
	}
	

}
