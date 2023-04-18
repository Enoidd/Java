package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LabirintoTest {
	Labirinto labirintoTest = new Labirinto();
	
	
	@Test
	public void testGetStanzaCorrente() {
		assertNotNull(this.labirintoTest.getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertNotNull(this.labirintoTest.getStanzaVincente());
	}

}
