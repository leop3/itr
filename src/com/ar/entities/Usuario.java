package com.ar.entities;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	private TipoDeUsuario tipo;
	private Cliente cliente;
	private int saldo = 0;

	public Usuario() {
	}

	public Usuario(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}

	public Usuario(int id,String usuario, String password, int _saldo) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.saldo = _saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Usuario(String usuario, String password, Cliente cliente) {
		this.usuario = usuario;
		this.password = password;
		this.cliente = cliente;
	}

	public Usuario(String usuario, String password, TipoDeUsuario tipo, Cliente cliente) {
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
		this.cliente = cliente;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoDeUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeUsuario tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void sumarSaldo(int _saldo) {
		this.saldo += _saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
