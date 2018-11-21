package com.ar.entities;

public class Cliente {
	private String name;
	private String mail;
	private int dni;
	private int telefono;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente() {

	}

	public Cliente(String name, String mail, int dni, int telefono) {
		super();
		this.name = name;
		this.mail = mail;
		this.dni = dni;
		this.telefono = telefono;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
