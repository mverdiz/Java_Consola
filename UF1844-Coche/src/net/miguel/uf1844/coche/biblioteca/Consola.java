package net.miguel.uf1844.coche.biblioteca;

import java.math.BigDecimal;
import java.util.Scanner;

public class Consola {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void pl() {
		System.out.println();
	}
	
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
	
	public static long leerLong(String mensaje) {
		do {
			try {
				return Long.parseLong(leerString(mensaje));
			} catch (NumberFormatException e) {
				ple("No es un Long, por favor introducelo de nuevo");
			}
		} while (true);
	}
	
	public static BigDecimal leerBigDecimal(String mensaje) {
		do {
			try {
				return new BigDecimal(leerString(mensaje));
			} catch (NumberFormatException e) {
				ple("No es un numero con decimales, por favor introducelo de nuevo");
			}
		} while (true);
	}

	public static String leerString(String mensaje) {
		p(mensaje + ": ");
		return sc.nextLine();
	}

}
