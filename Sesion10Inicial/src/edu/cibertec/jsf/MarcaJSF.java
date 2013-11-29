package edu.cibertec.jsf;

import java.util.List;

import org.primefaces.event.ToggleEvent;

import edu.cibertec.jpa.Articulo;
import edu.cibertec.jpa.Marca;
import edu.cibertec.services.ArticuloImlementacion;
import edu.cibertec.services.ArticuloServices;
import edu.cibertec.services.MarcaImplementacion;

public class MarcaJSF {
	private MarcaImplementacion marcai=new MarcaImplementacion();
	private ArticuloServices articuloi = new ArticuloImlementacion();
	private List<Marca> modelsmarca;	
	private Marca selectedmarca;	
	
	private List<Articulo> modelsarticulo;
	public void setSelectedmarca(Marca selectedmarca) {
		this.selectedmarca = selectedmarca;
	}
	public Marca getSelectedmarca() {
		return selectedmarca;
	}
	public void setModelsmarca(List<Marca> modelsmarca) {
		this.modelsmarca = modelsmarca;
	}
	public List<Marca> getModelsmarca() throws Exception {
		modelsmarca=marcai.ListadoMarcas();
		return modelsmarca;
	}
	public List<Articulo> getModelsarticulo() {
		return modelsarticulo;
	}
	public void setModelsarticulo(List<Articulo> modelsarticulo) {
		this.modelsarticulo = modelsarticulo;
	}
	
	public void mostrarArticuloxMarca(ToggleEvent event) throws Exception{
		Marca m = (Marca) event.getData();
		modelsarticulo = articuloi.ListadoArticulosMarca(m.getIdmarca());
	}
	
	
}
