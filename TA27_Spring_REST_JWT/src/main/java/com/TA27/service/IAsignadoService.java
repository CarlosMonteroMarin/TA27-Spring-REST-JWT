package com.TA27.service;

import java.util.List;

import com.TA27.dto.Asignado;

public interface IAsignadoService {

	
		public List<Asignado> listarAsignado();
		
		public Asignado guardarAsignado(Asignado asignado);
		
		public Asignado asignadoXID(Long id); 
		
		public Asignado actualizarAsignado(Asignado asignado); 
		
		public void eliminarAsignado(Long id);
	

}


