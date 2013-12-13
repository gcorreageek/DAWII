package edu.cibertec.daw2.service;


import java.util.List;

import edu.cibertec.daw2.bean.EmpleadoDTO;

public interface EmpleadoService {
	
	  public void insertarEmpleado(EmpleadoDTO emp) throws Exception;
	  public void actualizarEmpleado(EmpleadoDTO emp) throws Exception;
	  public void eliminarEmpleado(EmpleadoDTO emp) throws Exception;
	  public EmpleadoDTO obtenerEmpleado(EmpleadoDTO emp) throws Exception;
	  public List<EmpleadoDTO> obtenerTodosEmpleados() throws Exception;
	  public List<EmpleadoDTO> obtenerTodosEmpleadosCriteria() throws Exception;
}
