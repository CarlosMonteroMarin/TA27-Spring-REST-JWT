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

import com.TA27.dto.Cientifico;
import com.TA27.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCcursos(){
		return cientificoServiceImpl.listarCientifico();
	}
	
	
	@PostMapping("/cientificos")
	public Cientifico salvarCurso(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientifico/{id}")
	public Cientifico cursoXID(@PathVariable(name="id") Long id) {
		
		Cientifico Cientifico_xid= new Cientifico();
		
		Cientifico_xid=cientificoServiceImpl.cientificoXID(id);
				
		return Cientifico_xid;
	}
	
	@PutMapping("/cientifico/{id}")
	public Cientifico actualizarCurso(@PathVariable(name="id")Long id,@RequestBody Cientifico cientifico) {
		
		Cientifico Cientifico_seleccionado= new Cientifico();
		Cientifico Cientifico_actualizado= new Cientifico();
		
		Cientifico_seleccionado= cientificoServiceImpl.cientificoXID(id);
		
		Cientifico_seleccionado.setDni(cientifico.getDni());
		Cientifico_seleccionado.setNomapels(cientifico.getNomapels());
		
		Cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(Cientifico_seleccionado);
				
		return Cientifico_actualizado;
	}
	
	@DeleteMapping("/cientifico/{id}")
	public void eleiminarCurso(@PathVariable(name="id")Long id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
	
	
}
