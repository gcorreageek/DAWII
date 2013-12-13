package edu.cibertec.jsf;

import java.util.ArrayList;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import edu.cibertec.jpa.NivelJPA;
import edu.cibertec.service.NivelImplementacion;

public class NivelJSF {
	private NivelImplementacion niveli=new NivelImplementacion();
	private DataModel<NivelJPA> nivelesmodel;
	private ArrayList<SelectItem> nivellista;
	
	public void setNivelesmodel(DataModel<NivelJPA> nivelesmodel) {
		this.nivelesmodel = nivelesmodel;
	}
	public DataModel<NivelJPA> getNivelesmodel() throws Exception {
		nivelesmodel=new ListDataModel<NivelJPA>(niveli.listadonivel());
		return nivelesmodel;
	}
	public void setNivellista(ArrayList<SelectItem> nivellista) {
		this.nivellista = nivellista;
	}
	public ArrayList<SelectItem> getNivellista() throws Exception {
		nivellista=new ArrayList<SelectItem>();
		for(NivelJPA obj:niveli.listadonivel()){
			nivellista.add(new SelectItem(obj.getNivelid(), obj.getNiveldes()));
		}
		return nivellista;
	}
	
}
