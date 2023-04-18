package it.uniroma3.diadia;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PartitaTest {
	/* Stato iniziale */
	Partita partitaTest = new Partita();
	
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
		this.partitaTest.getGiocatore().setCfu(1);
		assertFalse(this.partitaTest.isFinita());
	}
}
