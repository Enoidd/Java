package comparator_liste;

import static org.junit.Assert.*;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PersonaTest {
	
	@Test
	public void testSort() {
		
		List<Persona> lista = new LinkedList<Persona>();
		
		lista.add(new Persona("Valter", 5));
		lista.add(new Persona("Paolo", 10));
		lista.add(new Persona("Giacomo", 7));
		lista.add(new Persona("Alessandro", 8));
		
		// lista 
		assertEquals("Valter", lista.get(0).getNome());
		assertEquals("Paolo", lista.get(1).getNome());
		assertEquals("Giacomo", lista.get(2).getNome());
		assertEquals("Alessandro", lista.get(3).getNome());
		
		ComparatoreEta comparatore = new ComparatoreEta();
		
		Collections.sort(lista, comparatore);	// ordina la lista
		
		// lista ordinata
		assertEquals("Alessandro", lista.get(0).getNome());
		assertEquals("Giacomo", lista.get(1).getNome());
		assertEquals("Paolo", lista.get(2).getNome());
		assertEquals("Valter", lista.get(3).getNome());
	}

}
