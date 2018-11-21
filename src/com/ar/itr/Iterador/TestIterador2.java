package com.ar.itr.Iterador;

import java.util.Enumeration;
import java.util.Hashtable;

import com.ar.entities2.Cliente2;

public class TestIterador2 {

	public static void main(String[] args) {

		new TestIterador2().execute();
	}

	private void execute() {

		Hashtable<Integer, Cliente2> clientes = new Hashtable();
		for (int i = 1; i < 16; i++) {
			clientes.put(i, new Cliente2("nombre" + i, 1000 * i, ""));
		}
		Enumeration<Integer> en = clientes.keys();

		while (en.hasMoreElements()) {
			System.out.println(clientes.get(en.nextElement()));
		}
	}

}
