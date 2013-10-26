package edu.cibertec.service;

import java.util.List;

import edu.cibertec.jpa.NivelJPA;

public interface NivelService {
public abstract List<NivelJPA> listadonivel() throws Exception;
}
