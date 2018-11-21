package com.ar.itr.Enum;

public class EnumColor {

	private Color color;

	public EnumColor(Color color) {
		this.color = color;
	}

	public void getDescription(Color color) {
		switch (color) {
		case ROJO: {
			System.out.println("ESTE ES COLOR ROJO");
		}
		case AZUL: {
			System.out.println("ESTE ES COLOR AZUL");
		}
		case NEGRO: {
			System.out.println("ESTE ES COLOR NEGRO");
		}
		case BLANCO: {
			System.out.println("ESTE ES COLOR BLANCO");
			break;
		}
		case MARRON: {
			System.out.println("ESTE ES COLOR MARRON");
			break;
		}
		case VERDE: {
			System.out.println("ESTE ES COLOR VERDE");
			break;
		}
		case VIOLETA: {
			System.out.println("ESTE ES COLOR VIOLETA");
			break;
		}
		default: {
			System.out.println("ESTE ES COLOR NEGRO");
			break;
		}
		}
	}

	public static void main(String[] args) {
		
	}

	enum Color {
		ROJO, AZUL, NEGRO, BLANCO, VERDE, MARRON, VIOLETA
	}
	
	enum Color2{
		
	}
}
