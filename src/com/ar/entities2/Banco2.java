package com.ar.entities2;

public class Banco2 {
	private String nombre;
	private String direccion;

	public Banco2(String nombre, String direccion, int id) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.id = id;
	}

	public Banco2() {
		super();
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Banco2 [nombre=" + nombre + ", direccion=" + direccion + ", id=" + id + "]";
	}

}
