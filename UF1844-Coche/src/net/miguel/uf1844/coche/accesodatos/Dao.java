package net.miguel.uf1844.coche.accesodatos;


public interface Dao<T> {

	default Iterable<T> obtenerTodos() {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}
	default T obtenerPorId(Long id) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}
	
	default void insertar(T objeto) {
		throw new AccesoDatosException("NO IMPLEMENTADO");
	}
	
}
