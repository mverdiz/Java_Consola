package net.miguel.uf1844.coche.accesodatos;

import java.util.TreeMap;

import net.miguel.uf1844.coche.pojos.Coche;

public class DaoCoche implements Dao<Coche> {
	
	private static final TreeMap<Long, Coche> coches = new TreeMap<>();
	
	// Patron Singleton
		private DaoCoche() {}
		private static final DaoCoche INSTANCIA = new DaoCoche();
		public static DaoCoche getInstancia() { return INSTANCIA; }
		// Fin Singleton
		
		
		@Override
		public Iterable<Coche> obtenerTodos() {
			return coches.values();
		}
		
		@Override
		public Coche obtenerPorId(Long id) {
			return coches.get(id);
		}
		
		@Override
		public void insertar(Coche coche) {
			long id = coches.size() != 0 ? coches.lastKey() + 1L : 1L;
			
			coche.setId(id);
			
			coches.put(coche.getId(), coche);
		}
		
	

}
