package net.miguel.uf1844.coche.presentacion;

import static net.miguel.uf1844.coche.biblioteca.Consola.*;


import net.miguel.uf1844.coche.accesodatos.DaoCoche;
import net.miguel.uf1844.coche.pojos.Coche;

public class Consola {

	private static final boolean SIN_ID = false;
	private static final DaoCoche dao = DaoCoche.getInstancia();

	public static void main(String[] args) {
		int opcion;

		do {
			mostrarMenu();

			opcion = leerInt("Introduce la opcion deseada");

			procesarOpcion(opcion);
		} while (opcion != 0);
	}
	
	public static void menu2() {
		int opcion;
		
		do {
			mostrarMenu2();

			opcion = leerInt("Introduce la opcion deseada");

			procesarOpcion(opcion);
		} while (opcion != 0);

	}

	private static void mostrarMenu() {
		pl("-------------Menu de Opciones-----------------");
		pl("1. Listar Coches");
		pl("2. Buscar Por Id");
		pl("3. Insertar Coche");
		pl("0. Salir");
	}
	
	private static void mostrarMenu2() {
		pl("1. Insertar otro coche");
		pl("0. Salir");
	}
	
	
	private static void procesarOpcion(int opcion) {
		switch (opcion) {
		case 0:
			pl("Gracias por usar este programa !!!!!");
			break;
		case 1:
			mostrarTodos();
			break;
		case 2:
			buscarPorId();
			break;
		case 3:
			insertar();
			do {
				mostrarMenu2();

				opcion = leerInt("Introduce la opcion deseada");

				procesarOpcion2(opcion);
				
			} while (opcion != 0);
			break;
		default:
			ple("No se reconoce dicha opcion");
		}
	}
	
	private static void procesarOpcion2(int opcion) {
		switch (opcion) {
		case 1:
			insertar();
			break;
		case 0:
			mostrarTodos();
			break;
		default:
			ple("No se reconoce dicha opcion");
		}
	}


	private static void buscarPorId() {
		Long id = leerLong("Dime el id a buscar");

		mostrarId(id);
	}

	private static void insertar() {
		Coche coche = consola2Coche(SIN_ID);

		dao.insertar(coche);
	}

	private static Coche consola2Coche(boolean conId) {
		Coche coche = new Coche();

		if (conId) {
			coche.setId(leerLong("Id"));
		}

		coche.setMatricula(leerString("Matricula"));

		boolean correcto = false;

		do {
			try {
				coche.setMarca(leerString("Marca"));
				correcto = true;
			} catch (Exception e) {
				ple(e.getMessage());
			}
		} while (!correcto);

		correcto = false;
		
		do {
			try {
				coche.setModelo(leerString("Modelo"));
				correcto = true;
			} catch (Exception e) {
				ple(e.getMessage());
			}
		} while (!correcto);

		correcto = false;
		
		
		do {
			try {
				coche.setColor(leerString("Color"));
				correcto = true;
			} catch (Exception e) {
				ple(e.getMessage());
			}
		} while (!correcto);

		correcto = false;
		

		do {
			try {
				coche.setCilindrada(leerBigDecimal("Cilindrada"));
				correcto = true;
			} catch (Exception e) {
				ple(e.getMessage());
			}
		} while (!correcto);

		correcto = false;

		do {
			try {
				coche.setPotencia(leerBigDecimal("Potencia"));
				correcto = true;
			} catch (Exception e) {
				ple(e.getMessage());
			}
		} while (!correcto);
		
		return coche;
	}


	private static void mostrarId(long id) {
		Coche coche = dao.obtenerPorId(id);

		if (coche != null) {
			pl(coche);
		} else {
			pl("No se ha encontrado el ordenador con ese id");
		}
	}

	private static void mostrarTodos() {
		for (Coche coche : dao.obtenerTodos()) {
			pl(coche);
		}

		pl();
	}

	/*private static void mostrarTodos(Iterable<Coche> coches) {
		for (Coche coche : coches) {
			pl(coche);
		}

		pl();
	}*/

}
