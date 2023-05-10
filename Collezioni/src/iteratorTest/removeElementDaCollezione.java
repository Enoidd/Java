package iteratorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class removeElementDaCollezione {

	private List<String> lista;	// Definisco una lista
	
	
	@Before
	public void setUp() throws Exception {
		this.lista = new ArrayList<String>();	// Creo una lista
		
		// Aggiungi elementi nella lista 'lista'
		lista.add(new String("Primo"));
		lista.add(new String("Secondo"));
		lista.add(new String("Terzo"));
		lista.add(new String("Quarto"));
	}

	@Test
	public void testIterator() {
		
		Iterator<String> it = this.lista.iterator();	// Creo un iteratore
		assertTrue(it.hasNext());	// C'è un primo elemento
		it.next();	// Sei tra il primo e il secondo se c'è
		assertTrue(it.hasNext());	// C'è un secondo elemento
		it.next();	// Sei tra il secondo e il terzo se c'è
		assertTrue(it.hasNext());	// C'è un terzo elemento
		it.next();	// Sei tra il terzo e il quarto
		assertTrue(it.hasNext());	// C'è un quarto elemento
		it.next();	// Sei dopo il quarto elemento
		assertFalse(it.hasNext());	// Non ci sono altri elementi della lista
	}
	
	@Test
	public void testRemove_listaNonVuota() {
		
		Iterator<String> it = this.lista.iterator();

		assertFalse(this.lista.isEmpty());	// La lista non è vuota
		
		it.next();
		it.remove(); 	// Rimuovi l'elemento
	}

}
