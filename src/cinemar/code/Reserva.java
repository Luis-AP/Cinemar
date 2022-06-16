package cinemar.code;

import java.sql.Date;

public class Reserva {
	private Sesion sesion;
	private Butaca butaca;
	private Usuario usuario;
	private Date f_compra;
	
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
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
	public Date getF_compra() {
		return f_compra;
	}
	public void setF_compra(Date f_compra) {
		this.f_compra = f_compra;
	}
	
}
