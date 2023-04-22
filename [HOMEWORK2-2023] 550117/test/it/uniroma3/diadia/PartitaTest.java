package it.uniroma3.diadia;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {
	/* Stato iniziale */
	Partita partitaTest = new Partita();
	Stanza stanza = new Stanza("stanza");
	
	@Test
	public void testVinta() {
		this.partitaTest.getLabirinto().setStanzaCorrente(this.partitaTest.getLabirinto().getStanzaVincente());
		assertTrue(this.partitaTest.isFinita());
	}
	
	@Test 
	public void testFinita_setFinita() {
		this.partitaTest.setFinita();
		assertTrue(this.partitaTest.isFinita());
	}
	
	@Test
	public void testFinita_cfuZero() {
		this.partitaTest.getGiocatore().setCfu(0);
		assertTrue(this.partitaTest.isFinita());
	}
	
	@Test
	public void testStanzaCorrente() {
		partitaTest.getLabirinto().setStanzaCorrente(stanza);
		assertEquals(stanza, partitaTest.getLabirinto().getStanzaCorrente());
	}
	
	@Test
	public void testStanzaVincente() {
		assertEquals("Biblioteca", partitaTest.getLabirinto().getStanzaVincente().getNome());
	}
	
}
