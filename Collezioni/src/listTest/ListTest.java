package listTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

	private Collection<Integer> c;	// Creo la collezione 'c'
	private Collection<Integer> t;	// Creo la collezione 't'
	
	@Before
	public void setUp() {
		/*
		 * LinkedList:
		 * Gli elementi sono memorizzati in una lista concatenata. E ogni elemento contiene:
		 * 	- un riferimento all'elemento successivo
		 * 	- un riferimento all'oggetto memorizzato
		 */
		c = new LinkedList<Integer>();	// Creo una lista
		
		/*
		 * ArrayList:
		 * Gli elementi sono memorizzati in un contenitore implementato con array con indicatore di riempimento,
		 * al momento della creazione la dimensione dell'array è pari al valore prestabilito, quando questa
		 * raggiunge il valore prestabilito viene creato un nuovo array di dimensione doppia rispetto al 
		 * precedente.
		 */
		t = new ArrayList<Integer>(); 	// Creo una lista di array
		
		// Aggiungi elementi alla lista 'c'
		c.add(1);
		c.add(2);
		c.add(3);
		
		// Aggiungi elementi all'ArrayList
		t.add(1);
		t.add(2);
	}

	@Test
	public void testRemoveAll() {
		
		Iterator<Integer> it = this.c.iterator();	// Crea un iteratore
		
		assertNotNull(it);
		assertTrue(it.hasNext());	// C'è un prossimo elemento
		assertEquals(1 , it.next().intValue());	// Il primo elemento è 1 - ad ogni it.next passa prima del prossimo
		assertEquals(2 , it.next().intValue());	// Il primo elemento è 2
		assertEquals(3 , it.next().intValue());	// Il primo elemento è 3
		
		/*
		 * removeAll rimuove tutti gli elementi di 't' che sono anche in 'c'
		 */
		assertTrue(c.removeAll(t));	// rimane sono '3'
		
		assertEquals(1, this.c.size());	// la dimensione attuale della lista 'c' è 1 perché è rimasto il valore '3'
		
		this.c.clear();// cancella tutti gli elementi in una lista
		
		assertEquals(0, this.c.size());	// Nessun elemento presente in 'c'
	}

}
