package com.ar.entities2;

public class Cliente2 {

	private int id;
	private int dni;
	private String nombre;
	private String apellido;
	private double saldo;
	private String password;

	public Cliente2(int id, int dni, String nombre, String apellido, double saldo) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
	}
	
	

	public Cliente2(String nombre, double saldo, String password) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.password = password;
	}



	public Cliente2() {
		super();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Cliente2 [id=" + id + ", nombre=" + nombre + ", saldo=" + saldo + ", password=" + password + "]";
	}

//	@Override
//	public String toString() {
//		return "Cliente2 [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + "]";
//	}
	

}
