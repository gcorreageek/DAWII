package edu.cibertec.managed;



import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import edu.cibertec.jpa.AlumnoJPA;
import edu.cibertec.service.AlumnoImplementacion;

@RequestScoped
@ManagedBean
public class alumnoManaged {

	private List<AlumnoJPA> alumnos;
	private AlumnoJPA alumno=new AlumnoJPA();
	private int estado;
	

	private AlumnoImplementacion usuarioi=new AlumnoImplementacion();

	public alumnoManaged() {
		// TODO Auto-generated constructor stub
	}
	public String Nuevo(){
//		getAlumno().getNombre()
	//Limpiar variables
		return "/ui/nuevoAlumno.jsf";
	}
	
   public String Lista(){
		return "/ui/registroAlumno.jsf";
	} 
	
	public void Eliminar(ActionEvent e) throws Exception{
		String xuser;
		xuser=e.getComponent().getAttributes().get("xusernom").toString();
		
		AlumnoJPA obj=new AlumnoJPA();
		obj.setIdAlumno(Integer.parseInt(xuser));
		usuarioi.EliminaAlumno(obj);
		Lista();
	
	}	
	
	
	
	public String Grabar() throws Exception{
		if(estado==1)
			usuarioi.ModificaAlumno(getAlumno());
		else 
		usuarioi.GrabaAlumno(getAlumno());
		
		
		return "/ui/registroAlumno.jsf";	
	}
	
	public void Buscar(ActionEvent e) throws Exception{
		String xusernom;
		xusernom=e.getComponent().getAttributes().get("xusernom").toString();
		System.out.println("hola peru:"+xusernom);
		AlumnoJPA obju=new AlumnoJPA();
		obju.setIdAlumno(Integer.parseInt(xusernom));
		estado=1;
		setAlumno(usuarioi.BuscarAlumno(obju));
		System.out.println("nombre:"+alumno.getNombre());
	}
	
	
	
	
	
	
	public List<AlumnoJPA> getAlumnos() throws Exception {
		alumnos=usuarioi.ListaAlumno();
//		for (AlumnoJPA s : alumnos) {
//			System.out.println(s.getEmail()+"|"+"");
//		}
//		alumnos.get(0).getEspecialidadBean().getEspecialidad();
//		especialidadBean.especialidad
		return alumnos;
	}

	public void setAlumnos(List<AlumnoJPA> alumnos) {
		this.alumnos = alumnos;
	}
 
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public AlumnoJPA getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoJPA alumno) {
		this.alumno = alumno;
	}
}
