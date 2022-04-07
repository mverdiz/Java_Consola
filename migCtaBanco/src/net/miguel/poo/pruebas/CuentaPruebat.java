//VERDION ORIGINAL SENCILLA

package net.miguel.poo.pruebas;

import java.util.Scanner;

import net.miguel.poo.pojos.Cuenta;

public class CuentaPruebat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe, ingreso,debito;

		// se crea objeto cuenta1 sin parámetros
		// se ejecuta el constructor por defecto
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		System.out.println("---------------------------------------");

		// se crea el objeto cuenta2 con los valores leidos por teclado
		// se ejecuta el constructor con parámetros
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 0);

		// se crea cuenta3 como copia de cuenta1
		// se ejecuta el constructor copia
		Cuenta cuenta = new Cuenta(cuenta1);

		// mostrar los datos de cuenta1
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println("********************************************************");

		// se realiza un ingreso en cuenta1
		System.out.print("ingreso a la cuenta de " + cuenta1.getNombre() + ": ");
		ingreso = sc.nextDouble();
		cuenta1.ingreso(ingreso);

		// mostrar el saldo de cuenta1 después del ingreso
		System.out.println("Saldo Actual: " + "****"+cuenta1.getSaldo()+"*****");
		System.out.println();
		System.out.println("**********************************");

		// mostrar los datos de cuenta2
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar los datos de cuenta3
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println("---------------------------------------");
		System.out.println();

		// realizar una transferencia desde cuenta1 a cuenta2
		System.out.print("transferir de la cuenta de " + cuenta1.getNombre() + "a la cuenta "+ cuenta2.getNombre() + ": ");
		debito = sc.nextDouble();
		cuenta1.transferencia(cuenta2, debito);
		System.out.println();

		// mostrar el saldo de cuenta2
		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar el saldo de cuenta1
		System.out.println("Saldo de la cuenta 1");
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();
	}

}
