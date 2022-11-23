package com.TA27.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proyecto")
public class Proyecto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column (name="nombre")
	private String nombre;
	@Column (name="horas")
	private int horas;
	
	@OneToMany
    @JoinColumn(name="proyecto_id")
    private List<Asignado> asignado;
	
	
	/**
	 * 
	 */
	public Proyecto() {
		super();
	}


	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param asignado
	 */
	public Proyecto(Long id, String nombre, int horas, List<Asignado> asignado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado = asignado;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}


	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}


	/**
	 * @return the asignado
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proyecto_id")
	public List<Asignado> getAsignado() {
		return asignado;
	}


	/**
	 * @param asignado the asignado to set
	 */
	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}


	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignado=" + asignado + "]";
	}

}