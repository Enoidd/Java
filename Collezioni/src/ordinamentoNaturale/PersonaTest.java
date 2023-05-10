package ordinamentoNaturale;

import static org.junit.Assert.*;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void testCompareTo() {
		
		Persona p1 = new Persona("Paolo", 10);
		Persona p2 = new Persona("Valter", 5);
		
		assertTrue(p1.compareTo(p2) < 0);	// <0
		
		Persona p3 = new Persona("Paolo", 10);
		assertEquals(0, p1.compareTo(p3)); 	// 0
		
		Persona p4 = new Persona("Anna", 8);
		assertTrue(p1.compareTo(p4) > 0);	// >0
	}
	
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
		
		Collections.sort(lista);	// ordina la lista
		
		// lista ordinata
		assertEquals("Alessandro", lista.get(0).getNome());
		assertEquals("Giacomo", lista.get(1).getNome());
		assertEquals("Paolo", lista.get(2).getNome());
		assertEquals("Valter", lista.get(3).getNome());
	}
}
