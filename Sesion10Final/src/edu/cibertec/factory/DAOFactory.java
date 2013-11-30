package edu.cibertec.factory;

import edu.cibertec.services.ArticuloServices;
import edu.cibertec.services.FacturaServices;
import edu.cibertec.services.MarcaServices;
import edu.cibertec.services.VendedorServices;




public abstract class DAOFactory {
	public static final int MYSQL=1;
	public static final int JPA=2;
	public abstract MarcaServices getMarcaService();
	public abstract ArticuloServices getArticuloService();
	public abstract VendedorServices getVendedorService();
	public abstract FacturaServices getFacturaServices();
		
	public static DAOFactory getFactory(int bd){
		switch (bd) {
		case 1:
			return new MysqlDAOFactory();			
		}
		return null;
	}
}
