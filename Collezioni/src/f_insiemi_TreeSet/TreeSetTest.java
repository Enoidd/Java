package f_insiemi_TreeSet;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class TreeSetTest {

	@Test
	public void testAddDuplicatiEnon() {
		
//		ComparatorePersone comparatore = new ComparatorePersone();
//		Set<Persona> s = new TreeSet<Persona>(comparatore);
		Set<Persona> s = new TreeSet<Persona>(); 	// Insieme

		Persona p1 = new Persona("Paolo");
		Persona p2 = new Persona("Valter");

		assertTrue(s.add(p1));	// Aggiungo all'insieme 's' la persona 'p1'
		assertTrue(s.add(p2));	// Aggiungo all'insieme 's' la persona 'p2'
		
		assertFalse(s.add(p1));	// Non aggiungo perché c'è già 'p1' DOPPIONE 
		
		assertEquals(2,s.size());	// Atteso 2
		
		Iterator<Persona> it = s.iterator();
		
		assertSame(p1, it.next());
		assertSame(p2, it.next());
		
	}
}
