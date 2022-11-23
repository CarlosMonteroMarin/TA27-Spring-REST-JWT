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

import com.TA27.dto.Proyecto;
import com.TA27.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyecto(){
		return proyectoServiceImpl.listarProyecto();
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyecto/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") Long id) {
		
		Proyecto proyecto_xid= new Proyecto();
		
		proyecto_xid=proyectoServiceImpl.proyectoXID(id);
				
		return proyecto_xid;
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")Long id,@RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();
		
		proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id);
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		
		proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(proyecto_seleccionado);
				
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eliminarProyecto(@PathVariable(name="id")Long id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
	
	
}
