package edu.cibertec.services;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.Marca;


public class MarcaImplementacion implements MarcaServices{
	DAOFactory factory=DAOFactory.getFactory(1);
	MarcaServices dao=factory.getMarcaService();
	@Override
	public List<Marca> ListadoMarcas() throws Exception {
		// TODO Auto-generated method stub
		return dao.ListadoMarcas();
	}

}
