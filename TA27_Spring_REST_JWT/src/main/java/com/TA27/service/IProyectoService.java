package com.TA27.service;

import java.util.List;
import com.TA27.dto.Proyecto;

public interface IProyectoService {

	
		public List<Proyecto> listarProyecto();
		
		public Proyecto guardarProyecto(Proyecto proyecto);
		
		public Proyecto proyectoXID(Long id); 
		
		public Proyecto actualizarProyecto(Proyecto proyecto); 
		
		public void eliminarProyecto(Long id);
	

}


