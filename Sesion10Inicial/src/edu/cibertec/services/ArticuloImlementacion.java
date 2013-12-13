package edu.cibertec.services;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.Articulo;

public class ArticuloImlementacion implements ArticuloServices {

	DAOFactory factory=DAOFactory.getFactory(1);
	ArticuloServices dao=factory.getArticuloService();
	@Override
	public List<Articulo> ListadoArticulosMarca(String art_marca)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.ListadoArticulosMarca(art_marca);
	}

	@Override
	public List<Articulo> ListadoArticulos() throws Exception {
		// TODO Auto-generated method stub
		return dao.ListadoArticulos();
	}

}
