package edu.cibertec.managed;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import edu.cibertec.jpa.NivelJPA;
import edu.cibertec.service.NivelImplementacion;


@RequestScoped
@ManagedBean
public class nivelManaged {

	private ArrayList<SelectItem> niveles;
	private NivelImplementacion niveli=new NivelImplementacion();
	
	public ArrayList<SelectItem> getNiveles()  throws Exception{
	niveles=new ArrayList<SelectItem>();
		
		for(NivelJPA n:niveli.listadonivel()){
			
			niveles.add(new SelectItem(n.getNivelid(), 
					n.getNiveldes()));
		}		
		return niveles;
	}
	public void setNiveles(ArrayList<SelectItem> niveles) {
		this.niveles = niveles;
	}
	public NivelImplementacion getNiveli() {
		return niveli;
	}
	public void setNiveli(NivelImplementacion niveli) {
		this.niveli = niveli;
	}
	


	
}
