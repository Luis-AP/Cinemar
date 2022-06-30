package com.cinemar.models;

import java.sql.Date;

public class Sesion {
	private Integer id;
	private Pelicula pelicula;
	private Date fecha;
	private Sala sala;
	
	public Sesion(Integer id, Pelicula pelicula, Date fecha, Sala sala) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.fecha = fecha;
		this.sala = sala;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}