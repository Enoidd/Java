package iteratorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
		
	}

}
