package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StanzaTest {
	/* Stato iniziale pronto */
	Attrezzo attrezzo = new Attrezzo("ascia", 10);
	Stanza stanza_1 = new Stanza("stanza_1");
	Stanza stanza_2 = new Stanza("stanza_2");
	Attrezzo attrezzo1 = null;
	
	@Test
	public void testAddAttrezzo() {
		assertTrue(stanza_1.addAttrezzo(attrezzo));
	}
	
	@Test
	public void testRemoveAttrezzo() {
		assertNull(stanza_1.removeAttrezzo(null));	// assertNull il parametro passato deve essere NULL
	}
	
	
	@Test
	public void testHashAttrezzo() {
		assertFalse(stanza_1.hasAttrezzo("ascia"));
	}

}
