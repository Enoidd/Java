package iteratorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class iteratoreTest {

	private List<String> vuota;	// Lista vuota
	private List<String> singoletto;	// Lista con un solo elemento
	private String solitario;
	
	@Before
	public void setUp() {
		
		this.vuota = new ArrayList<>();	// Crea una lista vuota
		this.singoletto = new ArrayList<String>();	// Crea una lista con un solo elemento
		this.solitario = new String("Solitario");	// Crea la stringa "Solitario"
		
		
		/*
		 * this.singoletto.add(this.solitario);
		 * 
		 * 	Singoletto    Solitario
		 * 		↓↓           ↓↓
		 * 	   ____         ____
		 *    |____|→→→→→→→|____|
		 *    
		 * Aggiungi a singoletto un altro elemento. Ora lista di due elementi.
		 */
		this.singoletto.add(this.solitario);
	}

	@Test
	public void testHasNext_noListaVuota() {
		
		Iterator<String> it = this.vuota.iterator();	// Definisci un iteratore per lista vuota
		assertNotNull(it);	// l'iteratore 'it' non è NULL
		assertFalse(it.hasNext());	// Non c'è un prossimo - OK
	}
	
	@Test
	public void testHashNext_primaSiPoiNoSuSingoletto() {
		
		Iterator<String> it = this.singoletto.iterator();	// Definisce un iteratore per lista con un elemento
		assertNotNull(it);	// l'iteratore 'it' non è NULL
		assertTrue(it.hasNext());	// C'è un prossimo elemento (prima del primo elemento 'Singoletto')
		it.next();	// Sei sul secondo elemento
		assertFalse(it.hasNext());	// Non c'è un prossimo elemento (dopo il secondo elemento "Solitario")
	}

	// VARIANTE
	@Test
	public void testNext_singoletto() {
		
		Iterator<String> it = this.singoletto.iterator();	// Definisci un iteratore per lista con un elemento
		assertNotNull(it);	// l'iteratore 'it' non è NULL
		assertTrue(it.hasNext());	// C'è un prossimo elemento (prima del primo elemento 'Singoletto'
		assertSame(this.singoletto, it.next());	// Il prossimo elemento è proprio il 'Singoletto'
	}
	
	@Test
	public void testNext_suListaDiDueElementi() {
		
		List<String> doppietta = new ArrayList<>();
		
		doppietta.add(new String("primo"));		// Aggiungi il primo elemento
		doppietta.add(new String("second"));	// Aggiungi il secondo elemento
		
		Iterator<String> it = doppietta.iterator();	// Definisce un iteratore per la lista 'doppietta'
		assertNotNull(it);	// l'iteratore 'it' non è NULL
		assertTrue(it.hasNext());	// C'è un prossimo elemento (prima di 'primo')
		assertEquals("primo", it.next());	// il prossimo elemento è "primo"
		assertTrue(it.hasNext());	// it.next adesso è prima dell'elemento "secondo", c'è quindi un elemento
		assertEquals("secondo", it.next());	// it.next è dopo l'elemento "secondo"
		assertFalse(it.hasNext());	// E' vero che non ci sono elementi successivi a "secondo"
		
		
	}
}
