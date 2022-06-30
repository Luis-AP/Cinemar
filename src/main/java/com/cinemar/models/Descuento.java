package com.cinemar.models;

public class Descuento {
	private Float procentaje;
	private String dia;
	
	public Descuento(Float procentaje, String dia) {
		super();
		this.procentaje = procentaje;
		this.dia = dia;
	}

	public Float getProcentaje() {
		return procentaje;
	}

	public void setProcentaje(Float procentaje) {
		this.procentaje = procentaje;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}
