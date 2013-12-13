package edu.cibertec.service;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.NivelJPA;

public class NivelImplementacion implements NivelService {
	DAOFactory factory=DAOFactory.getFactory(1);
	NivelService dao=factory.getNivelService();
	@Override
	public List<NivelJPA> listadonivel() throws Exception {
		// TODO Auto-generated method stub
		return dao.listadonivel();
	}

}
