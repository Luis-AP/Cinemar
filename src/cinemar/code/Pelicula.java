package cinemar.code;

import java.util.ArrayList;

public class Pelicula {
	private Integer id;
	private String nombre;
	private ArrayList<String> reparto;
	private String director;
	private Integer duracion;
	private Clasificacion clasificacion;
	private TipoPelicula categoria;
	
	public Pelicula(Integer id, String nombre, ArrayList<String> reparto, String director, Integer duracion,
			Clasificacion clasificacion, TipoPelicula categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.reparto = reparto;
		this.director = director;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public TipoPelicula getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoPelicula categoria) {
		this.categoria = categoria;
	}
	
}