package com.TA27.service;

import java.util.List;

import com.TA27.dto.Cientifico;

public interface ICientificoService {

	
		public List<Cientifico> listarCientifico();
		
		public Cientifico guardarCientifico(Cientifico cientifico);
		
		public Cientifico cientificoXID(Long id); 
		
		public Cientifico actualizarCientifico(Cientifico cientifico); 
		
		public void eliminarCientifico(Long id);
	

}


