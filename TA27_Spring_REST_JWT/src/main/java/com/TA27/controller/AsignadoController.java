package com.TA27.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TA27.dto.Asignado;
import com.TA27.service.AsignadoServiceImpl;


@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignados")
	public List<Asignado> listarAsignado(){
		return asignadoServiceImpl.listarAsignado();
	}
	
	
	@PostMapping("/asignados")
	public Asignado salvarAsignado(@RequestBody Asignado asignado) {
		
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	
	@GetMapping("/asignado/{id}")
	public Asignado asignadoXID(@PathVariable(name="id") Long id) {
		
		Asignado asignado_xid= new Asignado();
		
		asignado_xid=asignadoServiceImpl.asignadoXID(id);
				
		return asignado_xid;
	}
	
	@PutMapping("/asignado/{id}")
	public Asignado actualizarAsignado(@PathVariable(name="id")Long id,@RequestBody Asignado asignado) {
		
		Asignado asignado_seleccionado= new Asignado();
		Asignado asignado_actualizado= new Asignado();
		
		asignado_seleccionado= asignadoServiceImpl.asignadoXID(id);
		
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());
		
		asignado_actualizado = asignadoServiceImpl.actualizarAsignado(asignado_seleccionado);
				
		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignado(@PathVariable(name="id")Long id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
	
	
}
