package com.ar.entities2;

public class Usuario2 {

	private int id;
	private String usuario;
	private String contrase�a;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuario2 [usuario=" + usuario + ", contrase�a=" + contrase�a + "]";
	}

	public Usuario2(int id, String usuario, String contrase�a) {

		super();
		this.id = id;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	public Usuario2() {
		super();
	}

}
