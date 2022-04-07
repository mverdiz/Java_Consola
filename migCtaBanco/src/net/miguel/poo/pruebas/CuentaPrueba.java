//VERSION FINAL CON MENU DE OPCIONES Y CAPTURA DE ERRORES

package net.miguel.poo.pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;
import net.miguel.poo.pojos.Cuenta;

public class CuentaPrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe, ingreso, debito;

		// se crea objeto cuenta1 sin parámetros
		// se ejecuta el constructor por defecto
		Cuenta cuenta1 = new Cuenta();
		System.out.println("**** Ingresa Datos de tu Cuenta Bancaria *****");
		System.out.println();
		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		System.out.println();

		cuenta1.setNombre(nombre.toUpperCase());
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		

		// se crea el objeto cuenta2 con los valores leidos por teclado
		// se ejecuta el constructor con parámetros
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 0);
		Cuenta cuenta3 = new Cuenta("Luisa Martinez", "12345678901234567890", 3.75, 500);

		// se crea cuenta3 como copia de cuenta1
		// se ejecuta el constructor copia
		Cuenta cuenta = new Cuenta(cuenta1);
		
		//Menu de Opciones
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {
			
			System.out.println("************** Selecciona una de las opciones ***************");
			System.out.println("1. Ver datos de la cuenta");
			System.out.println("2. Cuentas Asociadas");
			System.out.println("3. Ingresar dinero a la cuenta");
			System.out.println("4. Hacer transferencia entre cuentas");
			System.out.println("5. Salir");

			try {				
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					// mostrar los datos de cuenta1
					System.out.println("Opcion 1: Datos de la cuenta Principal");
					System.out.println("Nombre del titular: " + cuenta1.getNombre());
					System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
					System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
					System.out.println("Saldo: " + cuenta1.getSaldo());
					System.out.println("********************************************************");
					break;
				case 2:
					// mostrar los datos de cuenta2
					System.out.println("Opcion 2: Datos de las cuentas Asociadas");
					System.out.println();
					System.out.println("Nombre del titular: " + cuenta2.getNombre());
					System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
					System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
					System.out.println("Saldo: " + cuenta2.getSaldo());					
					System.out.println("--------------------------------------------------------");
					System.out.println("Nombre del titular: " + cuenta3.getNombre());
					System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
					System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
					System.out.println("Saldo: " + cuenta3.getSaldo());
					System.out.println();
					break;
				case 3:
					// se realiza un ingreso en cuenta1
					System.out.print("Opcion 3: ingreso a la cuenta de " + cuenta1.getNombre() + ": ");
					ingreso = sc.nextDouble();
					cuenta1.ingreso(ingreso);

					// mostrar el saldo de cuenta1 después del ingreso
					System.out.println("Saldo Actual: " + "****" + cuenta1.getSaldo() + "*****");
					System.out.println();
			
					break;
				case 4:
					
					Scanner snv = new Scanner(System.in);
			        boolean exit = false;
			        int seleccion; //Guardaremos la opcion del usuario
			 
			        while (!exit) {
			        	
			        	System.out.println("Selecciona una Cuenta Asociada");
			            System.out.println("1. Cta. "+ cuenta2.getNombre());
			            System.out.println("2. Cta. "+ cuenta3.getNombre());
			            System.out.println("3. Salir");
			 
			            try {
			 
			                
			                seleccion = snv.nextInt();
			 
			                switch (seleccion) {
			                    case 1:
			                        System.out.println("Has seleccionado la opcion 1");
			                     // realizar una transferencia desde cuenta1 a cuenta2
			    					System.out.print("Opcion 4: Cantidad a transferir de la cuenta de " + cuenta1.getNombre() + "a la cuenta "
			    							+ cuenta2.getNombre() + ": ");
			    					debito = sc.nextDouble();
			    					cuenta1.transferencia(cuenta2, debito);
			    					System.out.println();

			    					// mostrar el saldo de cuenta2
			    					System.out.println("Saldo de la cuenta de "+ cuenta2.getNombre());
			    					System.out.println("Saldo: " + cuenta2.getSaldo());
			    					System.out.println();

			    					// mostrar el saldo de cuenta1
			    					System.out.println("Saldo de la cuenta de "+ cuenta1.getNombre());
			    					System.out.println("Saldo: " + cuenta1.getSaldo());
			    					System.out.println();
			                        break;
			                    case 2:
			                        System.out.println("Has seleccionado la opcion 2");
			                     // realizar una transferencia desde cuenta1 a cuenta2
			    					System.out.print("Opcion 4: Cantidad a transferir de la cuenta de " + cuenta1.getNombre() + "a la cuenta "
			    							+ cuenta3.getNombre() + ": ");
			    					debito = sc.nextDouble();
			    					cuenta1.transferencia(cuenta3, debito);
			    					System.out.println();

			    					// mostrar el saldo de cuenta2
			    					System.out.println("Saldo de la cuenta de "+ cuenta3.getNombre());
			    					System.out.println("Saldo: " + cuenta3.getSaldo());
			    					System.out.println();

			    					// mostrar el saldo de cuenta1
			    					System.out.println("Saldo de la cuenta de "+ cuenta1.getNombre());
			    					System.out.println("Saldo: " + cuenta1.getSaldo());
			    					System.out.println();
			                        break;
			                    case 3:
			                        exit = true;
			                        break;
			                    default:
			                        System.out.println("Solo números entre 1 y 4");
			                }
			            } catch (InputMismatchException e) {
			                System.out.println("Debes insertar un número");
			                sn.next();
			            }
			        }			
					
					
					
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}
	}

}