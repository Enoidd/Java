package e_insiemi_HashSet;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class HashSetTest {

	@Test
	public void testAddDuplicatiEnon() {
		
		Set<Persona> s = new HashSet<Persona>();	// Insieme

		assertEquals(0, s.size());	// Dimensione insieme 's' -> 0
		
		Persona paolo = new Persona("Paolo", "Borseli", 10);
		Persona valter = new Persona("Valter", "Crescenzi", 11);
		
		assertTrue(s.add(paolo));	// Aggiungi 'paolo' all'insieme 's'

		assertEquals(1, s.size());	// Dimensione insieme 's' -> 1
		
		assertTrue(s.add(valter));	// Aggiungi 'valter' all'insieme 's'
		
		assertEquals(2, s.size());	// Dimensione insieme 's' -> 2
		
		assertFalse(s.add(paolo));	// Ri-aggiungo 'paolo'	-> NON LO AGGIUNGE
		
		Persona paolo2 = new Persona("Paolo", "Borseli", 10);
		
		assertFalse(s.add(paolo2));	// Fallisce perché confronta: nomi, cognomi, età e sono uguali
		
		
	}
}
