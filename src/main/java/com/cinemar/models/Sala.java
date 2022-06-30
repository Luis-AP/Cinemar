package com.cinemar.models;

public class Sala{
	private Integer numero;
	private String formato;
	private Integer capacidad;
	
	public Sala(Integer numero, String formato, Integer capacidad) {
		super();
		this.numero = numero;
		this.formato = formato;
		this.capacidad = capacidad;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
}