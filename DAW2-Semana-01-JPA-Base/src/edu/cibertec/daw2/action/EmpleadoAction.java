package edu.cibertec.daw2.action;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;
import edu.cibertec.daw2.bean.*;
import edu.cibertec.daw2.service.*;

public class EmpleadoAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
    private EmpleadoDTO empleado;
    private List<EmpleadoDTO> empleados;
   
    private static ApplicationBusinessDelegate abd = new ApplicationBusinessDelegate();
	private static EmpleadoService empService = abd.getEmpleadoService();

    // Metodo 1: Listar todos los empleados
    public String obtenerTodosEmpleados() throws Exception{
    	 empleados = empService.obtenerTodosEmpleados();
    	 return "success";
    }

    // Metodo 2: Carga la data del Empleado para Actualizar o abrir formulario vacio
	public String inicializarInsertarOActualizar() throws Exception{

		if (empleado != null && empleado.getCodigo() != null) {
			empleado = empService.obtenerEmpleado(empleado);
		}
		return "success";
	}
	
	// Metodo 3: inserta o actualiza un empleado
    public String insertarOActualizar() throws Exception{
    	
		if (empleado.getCodigo() == null) {
			empService.insertarEmpleado(empleado);
		} else {
			empService.actualizarEmpleado(empleado);
		}
 
    	return "success";
    }
    
    // Metodo 4: Borrar registro
    public String eliminarEmpleado() throws Exception{
		empService.eliminarEmpleado(empleado);
		return "success";
	}

	public EmpleadoDTO getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoDTO empleado) {
		this.empleado = empleado;
	}

	public List<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}
    
    

}
