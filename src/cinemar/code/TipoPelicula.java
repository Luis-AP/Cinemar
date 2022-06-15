package cinemar.code;

public class TipoPelicula{
	private String formato;
	private String idioma;
	private boolean subtitulada;
	
	public TipoPelicula(String formato, String idioma, boolean subtitulada) {
		super();
		this.formato = formato;
		this.idioma = idioma;
		this.subtitulada = subtitulada;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isSubtitulada() {
		return subtitulada;
	}

	public void setSubtitulada(boolean subtitulada) {
		this.subtitulada = subtitulada;
	}
}
