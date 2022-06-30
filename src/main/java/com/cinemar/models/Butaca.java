package com.cinemar.models;

public class Butaca {
	private Character fila;
	private Integer numero;
	private boolean reservada;
	private Sala sala;

	public Butaca(Character fila, Integer numero, boolean reservada, Sala sala) {
		super();
		this.fila = fila;
		this.numero = numero;
		this.reservada = reservada;
		this.sala = sala;
	}

	public Character getFila() {
		return fila;
	}

	public void setFila(Character fila) {
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

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	
	
	
}
