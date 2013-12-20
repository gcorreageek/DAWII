package edu.cibertec.managed;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import edu.cibertec.jpa.EspecialidadJPA;
import edu.cibertec.service.EspecialidadImplementacion;


@RequestScoped
@ManagedBean
public class especialidadManaged {

	private ArrayList<SelectItem> especialidades;
	private EspecialidadImplementacion especialidadi=new EspecialidadImplementacion();
	public ArrayList<SelectItem> getEspecialidades() throws Exception{
		especialidades=new ArrayList<SelectItem>();
		
		for(EspecialidadJPA n:especialidadi.listadoespecialidad()){
			
			especialidades.add(new SelectItem(n.getIdEspecialidad(), 
					n.getEspecialidadnombre()));
		}		
		return especialidades;
	}
	public void setEspecialidades(ArrayList<SelectItem> especialidades) {
		this.especialidades = especialidades;
	}
	public EspecialidadImplementacion getEspecialidadi() {
		return especialidadi;
	}
	public void setEspecialidadi(EspecialidadImplementacion especialidadi) {
		this.especialidadi = especialidadi;
	}
	
	
	
//	public ArrayList<SelectItem> getNiveles()  throws Exception{
//	niveles=new ArrayList<SelectItem>();
//		
//		for(NivelJPA n:niveli.listadonivel()){
//			
//			niveles.add(new SelectItem(n.getNivelid(), 
//					n.getNiveldes()));
//		}		
//		return niveles;
//	}
//	public void setNiveles(ArrayList<SelectItem> niveles) {
//		this.niveles = niveles;
//	}
//	public NivelImplementacion getNiveli() {
//		return niveli;
//	}
//	public void setNiveli(NivelImplementacion niveli) {
//		this.niveli = niveli;
//	}
	


	
}
