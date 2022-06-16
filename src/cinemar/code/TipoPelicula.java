package cinemar.code;

public class TipoPelicula {
	private String genero;
	private String formato;
	
	public TipoPelicula(String genero, String formato) {
		super();
		this.genero = genero;
		this.formato = formato;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormatos(String formato) {
		this.formato = formato;
	}
	
	
	
}
