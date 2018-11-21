package com.ar.entities2;

public class Usuario2 {

	private int id;
	private String usuario;
	private String contraseña;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario2 [usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}

	public Usuario2(int id, String usuario, String contraseña) {

		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Usuario2() {
		super();
	}

}
