package com.TA27.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientifico")
public class Cientifico {
	
	@Id
	@Column(name="dni")
	private Long dni;
	@Column (name="nomapels")
	private String nomapels;
	
	@OneToMany
    @JoinColumn(name="cientifico_id")
    private List<Asignado> asignado;

	
	/**
	 * 
	 */
	public Cientifico() {
		super();
	}


	/**
	 * @param dni
	 * @param nomapels
	 * @param asignado
	 */
	public Cientifico(Long dni, String nomapels, List<Asignado> asignado) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.asignado = asignado;
	}


	/**
	 * @return the dni
	 */
	public Long getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(Long dni) {
		this.dni = dni;
	}


	/**
	 * @return the nomapels
	 */
	public String getNomapels() {
		return nomapels;
	}


	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}


	/**
	 * @return the asignado
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientifico_id")
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
		return "Cientifico [dni=" + dni + ", nomapels=" + nomapels + ", asignado=" + asignado + "]";
	}
	
}
	


