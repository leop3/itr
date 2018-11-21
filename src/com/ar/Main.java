package com.ar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ar.entities2.Banco2;
import com.ar.entities2.Cliente2;
import com.ar.entities2.Usuario2;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {

		Map<String, Banco2> bancos = new HashMap();
		Map<String, Cliente2> clientes = new HashMap();
		Map<String, Usuario2> usuarios = new HashMap();

		// MAPA DE BANCOS

		bancos.put("PrimerBanco", new Banco2("PrimerBanco", "EnAlgunLado 123", 1));
		bancos.put("Provincia", new Banco2("Provincia", "dire 1", 2));
		bancos.put("ISBC", new Banco2("ISBC", "dire 2", 3));
		bancos.put("Santander", new Banco2("Santander", "dire 3", 4));

		// MAPA DE CLIENTES

		clientes.put("12345678", new Cliente2(0, 12345678, "Juan", "Perez", 1000));
		clientes.put("13355679", new Cliente2(1, 13355679, "Juan", "Perez", 1000));
		clientes.put("22346672", new Cliente2(2, 22346672, "Juan", "Perez", 1000));
		clientes.put("40345677", new Cliente2(3, 40345677, "Juan", "Perez", 1000));

		// MAPA DE USUARIOS

		usuarios.put("curso", new Usuario2(0, "curso", "123456"));
		usuarios.put("romualdo", new Usuario2(1, "romualdo", "romualdocapo"));
		usuarios.put("pepe", new Usuario2(2, "pepe", "epep1"));
		usuarios.put("jacinto", new Usuario2(3, "jacinto", "jaycinto"));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese Usuario");
		String userIn = scanner.nextLine();
		System.out.println("Ingrese contraseña");
		String passIn = scanner.nextLine();

		Usuario2 usuarioBuscado = usuarios.get(userIn);

		if (usuarioBuscado != null) {
			if (passIn.equals(usuarioBuscado.getContraseña())) {
				System.out.println("Usuario Logueado. Bienvenido.");
			} else {
				System.out.println("contraseña incorrecta.");
			}
		} else {
			System.out.println("Usuario incorrecto");
		}
	}

}
