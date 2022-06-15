package cinemar.code;

import java.util.ArrayList;

public class Sala{
	private Integer numero;
	private ArrayList<String> formatos;
	
	public Sala(Integer numero, ArrayList<String> formatos) {
		super();
		this.numero = numero;
		this.formatos = formatos;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public ArrayList<String> getFormatos() {
		return formatos;
	}

	public void setFormatos(ArrayList<String> formatos) {
		this.formatos = formatos;
	}
	
}