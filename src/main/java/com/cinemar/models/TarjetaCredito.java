package com.cinemar.models;

public class TarjetaCredito {
	private String numero;
	private Usuario usuario;
	private String banco;
	protected double balance;
	private double limite;
	
	public TarjetaCredito(String numero, Usuario usuario, String banco, double balance, double limite) {
		super();
		this.usuario = usuario;
		this.numero = numero;
		this.banco = banco;
		this.balance = balance;
		this.limite = limite;
	}

	public String getNumero() {
		return numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
