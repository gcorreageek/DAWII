package edu.cibertec.service;

import java.util.List;

import edu.cibertec.factory.DAOFactory;
import edu.cibertec.jpa.AlumnoJPA;

public class AlumnoImplementacion implements AlumnoService{

	DAOFactory factory=DAOFactory.getFactory(1);
	AlumnoService dao=factory.getAlumnoService();
 
	@Override
	public AlumnoJPA BuscarAlumno(AlumnoJPA objalu) throws Exception {
		return dao.BuscarAlumno(objalu);
	}
	@Override
	public String GrabaAlumno(AlumnoJPA objalu) throws Exception {
		return dao.GrabaAlumno(objalu);
	}
	@Override
	public String ModificaAlumno(AlumnoJPA objalu) throws Exception {
		return dao.ModificaAlumno(objalu);
	}
	@Override
	public String EliminaAlumno(AlumnoJPA objalu) throws Exception {
		return dao.EliminaAlumno(objalu);
	}
	@Override
	public List<AlumnoJPA> ListaAlumno() throws Exception {
		return dao.ListaAlumno();
	}
	@Override
	public List<AlumnoJPA> ListaAlumnoEspecialidad(String especialidad)
			throws Exception {
		return dao.ListaAlumnoEspecialidad(especialidad);
	}

}
