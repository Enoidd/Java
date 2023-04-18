package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LabirintoTest {
	Labirinto labirintoTest = new Labirinto();
	
	
	@Test
	public void testGetStanzaCorrente() {
		assertNull(this.labirintoTest.getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertNull(this.labirintoTest.getStanzaVincente());
	}

}
