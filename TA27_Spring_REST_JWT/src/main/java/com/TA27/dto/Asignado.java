package com.TA27.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado")
public class Asignado {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@ManyToOne
    @JoinColumn(name = "cientifico_id")
	private Cientifico cientifico;

	@ManyToOne
    @JoinColumn(name = "proyecto_id")
	private Proyecto proyecto;

	
	/**
	 * 
	 */
	public Asignado() {
		super();
	}


	/**
	 * @param id
	 * @param cientifico
	 * @param proyecto
	 */
	public Asignado(Long id, Cientifico cientifico, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
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
	 * @return the cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}


	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}


	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}


	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}


	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}


}
	