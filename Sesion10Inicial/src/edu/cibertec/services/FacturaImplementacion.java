package edu.cibertec.services;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.FacCabe;

public class FacturaImplementacion implements FacturaServices{
	DAOFactory factory=DAOFactory.getFactory(1);
	FacturaServices dao=factory.getFacturaServices();
	@Override
	public List<FacCabe> ListaFacturaVendedor(int codven) throws Exception {
		// TODO Auto-generated method stub
		return dao.ListaFacturaVendedor(codven);
	}

}
