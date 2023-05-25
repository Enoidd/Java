package c_liste_arrayList;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

/*
 * Una lista è una collezione che mantiene gli elementi ordinati secondo l'ordine di inserimento:
 * 1° elemento inserito, 2° elemento inserito, ultimo elemento inserito.
 * 
 * Estende l'interfaccia "Collection<E>" e offre metodi:
 * 	
 * 		- indexOf(Object o); Ritorna l'indice della prima occorrenza trovata, altrimenti -1.
 * 		- E get(int index);	Ritorna l'elemento alla posizione passata 'index' come parametro.
 * 		- contains(Object o);
 * 		- retainAll(Collection<?> c);
 * 		- containsAll(Collection<?> c);
 * 
 */
public class Lista {

	private Collection<Integer> c;
	private List<Integer> t;
	
	private Collection<Integer> b;
	private ArrayList<Integer> e;

	@Before
	public void setUp() {
		
		/*
		 * Gli elementi sono memorizzata in una lista concatenata, la dimensione può variare,
		 * accessi sequenziali.
		 */
		c = new LinkedList<>();	// Funziona perché Collection<E> è supertipo di List<E>
		t = new LinkedList<>();	// equivalente a quella sopra
		
		b = new ArrayList<>();
		e = new ArrayList<>();
		
		// Aggiungi alla lista
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		// Aggiungi all'array
		e.add(5);
		e.add(6);
	}
	
	@Test
	public void testRemove_lista() {
		
		assertFalse(this.c.isEmpty());
		
		Iterator<Integer> iteratore = this.c.iterator();
		assertTrue(iteratore.hasNext());
		assertEquals(1, iteratore.next().intValue());
	}
	
	@Test
	public void testRemove_array() {
		
		assertFalse(this.e.isEmpty());
		
		Iterator<Integer> it = this.e.iterator();
		assertTrue(it.hasNext());
		assertNotEquals(4, it.next().intValue());
		assertEquals(6, it.next().intValue());
	}
}
