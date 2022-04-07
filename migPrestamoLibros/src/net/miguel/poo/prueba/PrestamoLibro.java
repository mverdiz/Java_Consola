package net.miguel.poo.prueba;

import java.util.InputMismatchException;
import java.util.Scanner;



import net.miguel.poo.pojos.Libro;
import static net.miguel.poo.prestamolibros.Consola.*;

public class PrestamoLibro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;

		pl("**********Ingresa dos(2) libros*****************");
		
		// se crea el objeto libro1 utilizando el constructor con parámetros
		Libro libro1 = new Libro();

		p("Introduce titulo 1: ");
		titulo = sc.nextLine();
		p("Introduce autor 1: ");
		autor = sc.nextLine();
		p("Numero de ejemplares: ");		
		ejemplares = sc.nextInt();
		sc.nextLine();
		
	
		/*do {
			try {
				return;
			}catch (InputMismatchException e) {
				pl("Introduce un valor numerico");
				sc.nextLine();
			}
		}while(true);*/

		// se asigna a libro2 los datos pedidos por teclado.
		// para ello se utilizan los métodos setters
		libro1.setTitulo(titulo.toUpperCase());
		libro1.setAutor(autor);
		libro1.setEjemplares(ejemplares);

		// se crea el objeto libro2 utilizando el constructor por defecto
		Libro libro2 = new Libro();

		System.out.print("Introduce titulo 2: ");
		titulo = sc.nextLine();
		System.out.print("Introduce autor 2: ");
		autor = sc.nextLine();
		System.out.print("Numero de ejemplares: ");
		ejemplares = sc.nextInt();
		/*do {
			try {
				return;
			}catch (InputMismatchException e) {
				pl("Introduce un valor numerico");
				sc.nextLine();
			}
		}while(true);*/
		
		pl("----------------------------------");

		// se asigna a libro2 los datos pedidos por teclado.
		// para ello se utilizan los métodos setters
		libro2.setTitulo(titulo.toUpperCase());
		libro2.setAutor(autor);
		libro2.setEjemplares(ejemplares);

		pl("LIBROS REGISTRADOS");
		// se muestran por pantalla los datos del objeto libro1
		// se utilizan los métodos getters para acceder al valor de los atributos
		pl("Libro 1:");
		pl("Titulo: " + libro1.getTitulo());
		pl("Autor: " + libro1.getAutor());
		pl("Ejemplares: " + libro1.getEjemplares());
		pl("Prestados: " + libro1.getPrestados());

		// se muestran por pantalla los datos del objeto libro1
		// se utilizan los métodos getters para acceder al valor de los atributos
		pl("Libro 2:");
		pl("Titulo: " + libro2.getTitulo());
		pl("Autor: " + libro2.getAutor());
		pl("Ejemplares: " + libro2.getEjemplares());
		pl("Prestados: " + libro2.getPrestados());


		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {
			pl("**************Selecciona una de las opciones********************");
			pl("1. Prestar Libro");
			pl("2. Devolver Libro");
			pl("3. Libros Disponibles");
			pl("4. Salir");

			try {

				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					Scanner sn1 = new Scanner(System.in);
					boolean salir1 = false;
					int opcion1; // Guardaremos la opcion del usuario

					while (!salir1) {
						pl("Selecciona el prestamo de un libro");
						pl("1. libro 1");
						pl("2. libro 2");
						pl("3. Salir");

						try {

							opcion1 = sn1.nextInt();

							switch (opcion1) {
							case 1:
								pl("Has seleccionado la opcion 1");
								// se realiza un préstamo de libro1. El método devuelve true si se ha podido
								// realizar el préstamo y false en caso contrario
								if (libro1.prestamo()) {
									pl("Se ha prestado el libro " + libro1.getTitulo());
								} else {
									pl(
											"No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
								}
								break;
							case 2:
								pl("Has seleccionado la opcion 2");
								// se realiza un préstamo de libro1. El método devuelve true si se ha podido
								// realizar el préstamo y false en caso contrario
								if (libro2.prestamo()) {
									pl("Se ha prestado el libro " + libro2.getTitulo());
								} else {
									pl(
											"No quedan ejemplares del libro " + libro2.getTitulo() + " para prestar");
								}
								break;
							case 3:
								salir1 = true;
								break;
							default:					
								
								pl("Solo números entre 1 y 3");
							}
						} catch (InputMismatchException e) {
							pl("Debes introducir un número");
							break;
							//sn.nextLine();
						}
					}
							
					break;
				case 2:
					Scanner sn2 = new Scanner(System.in);
					boolean salir2 = false;
					int opcion2; // Guardaremos la opcion del usuario

					while (!salir2) {
						pl("Selecciona la devolucion de un libro");
						pl("1. libro 1");
						pl("2. libro 2");
						pl("3. Salir");

						try {

							opcion2 = sn2.nextInt();

							switch (opcion2) {
							case 1:
								pl("Has seleccionado la opcion 1");
								// se realiza una devolución de libro1. El método devuelve true si se ha podido
								// realizar la devolución y false en caso contrario
								if (libro1.devolucion()) {
									pl("Se ha devuelto el libro " + libro1.getTitulo());
								} else {
									pl(
											"No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
								}
								break;
							case 2:
								pl("Has seleccionado la opcion 2");
								// se realiza una devolución de libro1. El método devuelve true si se ha podido
								// realizar la devolución y false en caso contrario
								if (libro2.devolucion()) {
									pl("Se ha devuelto el libro " + libro2.getTitulo());
								} else {
									pl(
											"No hay ejemplares del libro " + libro2.getTitulo() + " prestados");
								}
								break;
							case 3:
								salir2 = true;
								break;
							default:
								pl("Solo números entre 1 y 3");
							}
						} catch (InputMismatchException e) {
							pl("Debes insertar un número");
							break;
							//sn.next();
						}
					}
					break;
				case 3:
					pl("Has seleccionado la opcion 3");
					// mostrar los datos del objeto libro1
					pl("Libro 1:");
					pl("Titulo: " + libro1.getTitulo());
					pl("Autor: " + libro1.getAutor());
					pl("Ejemplares: " + libro1.getEjemplares());
					pl("Prestados: " + libro1.getPrestados());
		

					// mostrar los datos del objeto libro2
					pl("Libro 2:");
					pl("Titulo: " + libro2.getTitulo());
					pl("Autor: " + libro2.getAutor());
					pl("Ejemplares: " + libro2.getEjemplares());
					pl("Prestados: " + libro2.getPrestados());
		
					break;
				case 4:
					pl("!!! Gracias por usar este programa");
					salir = true;
					break;
				default:
					pl("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				pl("Debes insertar un número");
				sn.next();
			}
		}

	}

}
