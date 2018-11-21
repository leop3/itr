package com.ar.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int id;
	private String nombreBanco;
	private String direccionBanco;
	private List<Usuario> usuarios = new ArrayList<>();

	public Banco(String nombreBanco, String direccionBanco) {
		super();
		this.nombreBanco = nombreBanco;
		this.direccionBanco = direccionBanco;
	}

	public Banco(String nombreBanco, String direccionBanco, List<Usuario> usuarios) {
		super();
		this.nombreBanco = nombreBanco;
		this.direccionBanco = direccionBanco;
		this.usuarios = usuarios;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getDireccionBanco() {
		return direccionBanco;
	}

	public void setDireccionBanco(String direccionBanco) {
		this.direccionBanco = direccionBanco;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
