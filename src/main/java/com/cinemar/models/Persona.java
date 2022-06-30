package com.cinemar.models;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	
	public Persona(String nombre, String apellido,String email,Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
