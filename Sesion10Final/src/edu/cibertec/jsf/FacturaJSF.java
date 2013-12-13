package edu.cibertec.jsf;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import edu.cibertec.jpa.FacCabe;
import edu.cibertec.services.FacturaImplementacion;

@ManagedBean(name="factura")
@SessionScoped
public class FacturaJSF {
		private FacturaImplementacion facturai=new FacturaImplementacion();
		private List<FacCabe> facturas;
		private FacCabe fact;
		int codven;		
		
		public void onEdit(RowEditEvent e){
			System.out.println("Entro");
		}
		public void setFacturas(List<FacCabe> facturas) {
			this.facturas = facturas;
		}	
		public List<FacCabe> getFacturas() throws Exception {
			System.out.println("Codigo "+codven);
			facturas=facturai.ListaFacturaVendedor(codven);
			return facturas;
		}
		public int getCodven() {
			return codven;
		}
		public void setCodven(int codven) {
			this.codven = codven;
		}
	
	public void setFact(FacCabe fact) {
		this.fact = fact;
	}
	public FacCabe getFact() {
		return fact;
	}
}
