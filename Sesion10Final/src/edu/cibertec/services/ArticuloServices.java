package edu.cibertec.services;

import java.util.List;

import edu.cibertec.jpa.Articulo;
import edu.cibertec.jpa.Marca;

public interface ArticuloServices {
	public abstract List<Articulo> ListadoArticulosMarca(String art_marca) throws Exception;
	public abstract List<Articulo> ListadoArticulos() throws Exception;
}
