package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.ambienti.Stanza;

public class StanzaTest {
	/* Stato iniziale pronto */
	Attrezzo attrezzo = new Attrezzo("ascia", 10);
	Stanza stanza_1 = new Stanza("stanza_1");
	Attrezzo attrezzo1 = null;
	
	@Test
	/*public void testAddAttrezzo() {
		assertTrue(stanza_1.addAttrezzo(attrezzo));
	}*/

	public void testRemoveAttrezzo() {
		assertNotNull(stanza_1.removeAttrezzo(null));	// assertNull il parametro passato deve essere NULL
	}
	
	

}
