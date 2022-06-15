package cinemar.code;

public class Butaca {
	private String fila;
	private Integer numero;
	private Sala sala;
	private Strig modelo;
	
	public Butaca(String fila, Integer numero, Sala sala) {
		super();
		this.fila = fila;
		this.numero = numero;
		this.sala = sala;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
