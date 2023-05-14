package b_iterare_una_collezione;

import static org.junit.Assert.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	private List<String> vuota;	// Collezione Lista vuota.
	private List<String> unElemento;	// Collezione Lista con un elemento (ancora è vuota)
	private String solitario;	// Generica String chiamata 'solitario'
	
	@Before
	public void setUp() {
		this.vuota = new ArrayList<>();
		this.unElemento = new ArrayList<String>();	// String si può anche omettere, come sopra.
		this.solitario = new String("solitario");
		
		this.unElemento.add(this.solitario);	// Aggiungi alla lista di un elemento l'elemento
												// "solitario" creato sopra.
	}
	
	@Test
	public void testHasNext_listaVuota() {
		
		Iterator<String> iteratore = this.vuota.iterator();
		assertNotNull(iteratore);
		assertFalse(iteratore.hasNext());	// Lista vuota, nessun prossimo elemento
	}
	
	@Test
	public void testHasNext_primaSiPoiNoSuSingoletto() {
		
		Iterator<String> iteratore = this.unElemento.iterator();
		assertNotNull(iteratore);	// L'iteratore 'iteratore' non è NULL
		// L'iteratore si trova prima del primo elemento (e unico elemento della lista 'unElemento')
		assertTrue(iteratore.hasNext());	// C'è un prossimo elemento? Si è 'solitario'
		iteratore.next(); // Restituisce il prossimo elemento della collezione.
		assertFalse(iteratore.hasNext());	// C'è un prossimo elemento? No, hai superatore 'solitario'
	}
	
	@Test
	public void testNext_unElemento() {
		
		Iterator<String> iteratore = this.unElemento.iterator();
		
		assertNotNull(iteratore);	// L'iteratore 'iteratore' non è null.
		assertTrue(iteratore.hasNext());	// C'è un elemento
		assertSame(this.solitario, iteratore.next());	// L'elemento nella collezione è solitario
	}
	
	@Test
	public void testNext_suListaDiDueElementi() {
		
		List<String> lista_due_elementi = new ArrayList<>();
		
		lista_due_elementi.add(new String("primo elemento"));
		lista_due_elementi.add(new String("secondo elemento"));
		
		Iterator<String> iteratore = lista_due_elementi.iterator();
		
		assertNotNull(iteratore);
		assertTrue(iteratore.hasNext());
		assertEquals("primo elemento", iteratore.next());
		assertTrue(iteratore.hasNext());
		assertEquals("secondo elemento", iteratore.next());
		assertFalse(iteratore.hasNext());	// Non ci sono altri elementi.
	}
	
	@Test
	public void testRimuoviElemento_suLista() {
		
		List<String> lista_elementi = new ArrayList<>();
		
		// Aggiungi elementi alla lista
		lista_elementi.add(new String("primo elemento"));
		lista_elementi.add(new String("secondo elemento"));
		lista_elementi.add(new String("terzo elemento"));
		lista_elementi.add(new String("quarto elemento"));
		
		Iterator<String> iteratore = lista_elementi.iterator();
		
		assertNotNull(iteratore);
		assertTrue(iteratore.hasNext());	// C'è un prossimo elemento?
		
		//	 1° METODO DI RIMOZIONE DI UN ELEMENTO
		iteratore.next();	// Prendi il prossimo elemento -> "primo elemento"
		iteratore.remove();	// Rimuovilo
		iteratore.next();	// Prendi il prossimo elemento -> "secondo elemento"
		iteratore.remove();	// Rimuovilo
		
		
		assertFalse(lista_elementi.isEmpty());	// La collezione non è vuota (ovviamente)
	}

}
