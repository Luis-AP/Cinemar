package com.cinemar.models;

import java.util.ArrayList;

public class Pelicula {
	private String nombre;
	private String sinopsis;
	private ArrayList<String> reparto;
	private Integer duracion;
	private String genero;
	private Clasificacion clasificacion;
	private TipoPelicula tipo;

	public Pelicula(String nombre, String sinopsis, ArrayList<String> reparto, Integer duracion, String genero,
			Clasificacion clasificacion, TipoPelicula tipo) {
		super();
		this.nombre = nombre;
		this.sinopsis = sinopsis;
		this.reparto = reparto;
		this.duracion = duracion;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getReparto() {
		return reparto;
	}

	public void setReparto(ArrayList<String> reparto) {
		this.reparto = reparto;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public TipoPelicula getTipo() {
		return tipo;
	}

	public void setTipo(TipoPelicula tipo) {
		this.tipo = tipo;
	}
}