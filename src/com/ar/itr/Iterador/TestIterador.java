package com.ar.itr.Iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ar.entities2.Cliente2;

public class TestIterador {

	public static void main(String[] args) {
		new TestIterador().execute();

	}

	private void execute() {
		List<Cliente2> clientes = new ArrayList<>();

		for (int i = 1; i < 16; i++) {
			clientes.add(new Cliente2("nombre" + i, 1000 * i, ""));
		}

		Iterator<Cliente2> it = clientes.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}

