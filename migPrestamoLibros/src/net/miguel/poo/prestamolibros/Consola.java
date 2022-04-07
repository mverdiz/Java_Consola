package net.miguel.poo.prestamolibros;

import java.util.Scanner;

public class Consola {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void pl(Object o) {
		System.out.println(o);
	}
	
	public static void p(Object o) {
		System.out.print(o);
	}

	public static void ple(Object o) {
		System.err.println(o);
	}
	
	public static int leerInt(String mensaje) {
		do {
			try {
				return Integer.parseInt(leerString(mensaje));
			} catch (NumberFormatException e) {
				ple("No es un entero, por favor introducelo de nuevo");
			} 
		} while (true);
	}
	
	public static String leerString(String mensaje) {
		p(mensaje + ": ");
		return sc.nextLine();
	}

}
