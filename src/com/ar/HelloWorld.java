//package com.ar;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//import com.ar.entities.Banco;
//import com.ar.entities.Usuario;
//
//public class HelloWorld {
//
//	public static void main(String[] args) {
//		new HelloWorld().execute();
//	}
//
//	private void execute() {
//
//		Banco banco = seleccionarBanco();
//		System.out.println("Banco Seleccionado : " + banco.getNombreBanco());
//		ingresarUsuario(banco);
//
//	}
//
//	private Banco seleccionarBanco() {
//		Scanner scanner = new Scanner(System.in);
////		List<Banco> bancos = new ArrayList<>();
//		Map<String, Banco> bancos;
//		Banco bank = new Banco("PrimerBanco", "EnAlgunLado 123"), banco2 = new Banco("Provincia", ""),
//				banco3 = new Banco("ISBC", ""), banco4 = new Banco("Santander", "");
//
//		bank.setId(0);
//		banco2.setId(1);
//		banco3.setId(2);
//		banco4.setId(3);
//
//		bancos.put("0", bank);
//		bancos.put("1", banco2);
//		bancos.put("2", banco3);
//		bancos.put("3", banco4);
//
//		// Agregar usuarios
//
//		Map<String, Usuario> usuarios1;
//		Map<String, Usuario> usuarios2;
//		Map<String, Usuario> usuarios3;
//		Map<String, Usuario> usuarios4;
//
//		usuarios1.put("0", new Usuario(1,"curso", "123456", 2000));
//		usuarios2.put("0", new Usuario(2,"pepe", "epep1", 5000));
//		usuarios3.put("0", new Usuario(3,"jacinto", "jaycinto", 500));
//		usuarios4.put("0", new Usuario(4,"romualdo", "romualdocapo", 10));
//
////		bank.agregarUsuario(new Usuario("curso", "123456", 2000));
////		banco2.agregarUsuario(new Usuario("pepe", "epep1", 5000));
////		banco3.agregarUsuario(new Usuario("jacinto", "jaycinto", 500));
////		banco4.agregarUsuario(new Usuario("romualdo", "romualdocapo", 10));
//
////		bancos.add(bank);
////		bancos.add(banco2);
////		bancos.add(banco3);
////		bancos.add(banco4);
//
//		int i = 0;
//
////		for (Banco banco : bancos) {
////			System.out.println(i + " - " + banco.getNombreBanco());
////			i++;
////		}
//		System.out.println("Ingrese el numero asociado a su banco");
//		int eleccion = scanner.nextInt();
////		scanner.close();
//		return bancos.get(eleccion);
//	}
//
//	private void ingresarUsuario(Banco banco) {
//		Scanner scanner = new Scanner(System.in);
//		String userIn = "";
//		String passIn = "";
//
//		System.out.println("Usuario : ");
//		userIn = scanner.nextLine();
//
//		System.out.println("Contraseña : ");
//		passIn = scanner.nextLine();
//
//		Usuario usuarioCoincidente = intentoLog(banco, userIn, passIn);
//		if (usuarioCoincidente != null) {
//			System.out.println("Bienvenido!");
//			System.out.println("Su saldo es de $" + usuarioCoincidente.getSaldo());
//
//			System.out.println("Desea Agregar Saldo?");
//			System.out.println("1 - SI");
//			System.out.println("2 - NO");
//
//			int eleccionAgregarSaldo = scanner.nextInt();
//			if (eleccionAgregarSaldo == 1) {
//				agregarSaldo(usuarioCoincidente);
//			}
//			System.out.println("Gracias por su utilizacion de nuestro programa. Adiós.");
//		}
//
//	}
//
//	private void agregarSaldo(Usuario usuarioCoincidente) {
//		Scanner scanner = new Scanner(System.in);
//		int importeASumar = 0;
//		System.out.println("Ingrese el saldo a agregar:");
//		importeASumar = scanner.nextInt();
//		usuarioCoincidente.sumarSaldo(importeASumar);
//		System.out.println("Se ha agregado exitosamente.");
//		System.out.println("su nuevo saldo es de $" + usuarioCoincidente.getSaldo());
//	}
//
//	// Devuelve el usuario encontrado
//	private Usuario intentoLog(Banco banco, String user, String pass) {
//
//		Usuario usuario = null;
//		for (Usuario _user : banco.getUsuarios()) {
//			if (_user.getUsuario().equals(user)) {
//				usuario = _user;
//				if (!_user.getPassword().equals(pass)) {
//					usuario = null;
//				}
//			}
//			if (usuario == null) {
//				System.out.println("Usuario no existe o la contraseña es incorrecta");
//				System.exit(1);
//			} else {
//				System.out.println("El usuario y contraseña son correctos.");
//			}
//
//		}
//		return usuario;
//	}
//
//}
