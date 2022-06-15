package cinemar.code;

public class Clasificacion {
	private String identificador;
	private String descripcion;
	
	public Clasificacion(String identificador, String descripcion) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
