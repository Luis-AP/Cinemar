package com.cinemar.models;

import java.sql.Date;

public class Reserva {
	private Butaca butaca;
	private Usuario usuario;
	private Sesion sesion;
	private Float precio;
	private TarjetaCredito medioPago;
	private Descuento descuento;
	private Date fecha_compra;
	
	public Reserva(Butaca butaca, Usuario usuario, Sesion sesion, Date fecha_compra) {
		super();
		this.butaca = butaca;
		this.usuario = usuario;
		this.sesion = sesion;
		this.fecha_compra = fecha_compra;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public TarjetaCredito getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(TarjetaCredito medioPago) {
		this.medioPago = medioPago;
	}
}
