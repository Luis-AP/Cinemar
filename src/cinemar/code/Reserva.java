package cinemar.code;

public class Reserva {
	private Butaca butaca;
	private Usuario usuario;
	private Float precio;
	private Integer descuento;
	
	public Reserva(Butaca butaca, Usuario usuario, Float precio, Integer descuento) {
		super();
		this.butaca = butaca;
		this.usuario = usuario;
		this.precio = precio;
		this.descuento = descuento;
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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	
}
