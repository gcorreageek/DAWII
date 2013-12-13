package edu.cibertec.factory;



import edu.cibertec.dao.ArticuloDAO;


import edu.cibertec.dao.FacturaDAO;
import edu.cibertec.dao.MarcaDAO;
import edu.cibertec.dao.VendedorDAO;

import edu.cibertec.services.ArticuloServices;
import edu.cibertec.services.FacturaServices;
import edu.cibertec.services.MarcaServices;
import edu.cibertec.services.VendedorServices;


public class MysqlDAOFactory extends DAOFactory {

	@Override
	public MarcaServices getMarcaService() {
		// TODO Auto-generated method stub
		return new MarcaDAO();
	}

	@Override
	public ArticuloServices getArticuloService() {
		// TODO Auto-generated method stub
		return new ArticuloDAO();
	}

	@Override
	public VendedorServices getVendedorService() {
		// TODO Auto-generated method stub
		return new VendedorDAO();
	}


	@Override
	public FacturaServices getFacturaServices() {
		// TODO Auto-generated method stub
		return new FacturaDAO();
	}

		

}
