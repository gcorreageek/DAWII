package edu.cibertec.service;


import java.util.List;

import edu.cibertec.jpa.AlumnoJPA;

public interface AlumnoService {
	
	public abstract AlumnoJPA BuscarAlumno(AlumnoJPA objalu) throws Exception;
	public abstract String GrabaAlumno(AlumnoJPA objalu) throws Exception;
	public abstract String ModificaAlumno(AlumnoJPA objalu) throws Exception;
	public abstract String EliminaAlumno(AlumnoJPA objalu) throws Exception;
	public abstract List<AlumnoJPA> ListaAlumno() throws Exception;
	public abstract List<AlumnoJPA> ListaAlumnoEspecialidad(String especialidad) throws Exception;
	
}
