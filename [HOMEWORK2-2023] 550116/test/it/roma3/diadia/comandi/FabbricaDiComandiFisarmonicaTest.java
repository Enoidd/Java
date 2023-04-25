package it.roma3.diadia.comandi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IOConsole;

public class FabbricaDiComandiFisarmonicaTest {

	private FabbricaDiComandiFisarmonica fabbricaDiComandi;
	private IOConsole io;
	
	@Before
	public void setUp() {
		fabbricaDiComandi = new FabbricaDiComandiFisarmonica();
		io = new IOConsole();
	}
	
	@Test
	public void testComandoAiuto() {
		Comando comando = fabbricaDiComandi.costruisciComando("aiuto", io);
		assertEquals("aiuto", comando.getNome());
	}
	
	@Test
	public void testComandoFine() {
		Comando comando = fabbricaDiComandi.costruisciComando("fine", io);
		assertEquals("fine", comando.getNome());
	}
	
	@Test
	public void testComandoGuarda() {
		Comando comando = fabbricaDiComandi.costruisciComando("guarda", io);
		assertEquals("guarda", comando.getNome());
	}
	
	@Test
	public void testComandoNonValido() {
		Comando comando = fabbricaDiComandi.costruisciComando("", io);
		assertEquals("Comando non valido", comando.getNome());
	}
	
	@Test
	public void testComandoPosa() {
		Comando comando = fabbricaDiComandi.costruisciComando("posa bastone", io);
		assertEquals("posa", comando.getNome());
		assertEquals("bastone", comando.getParametro());
	}

	@Test
	public void testComandoPrendi() {
		Comando comando = fabbricaDiComandi.costruisciComando("prendi bastone", io);
		assertEquals("prendi", comando.getNome());
		assertEquals("bastone", comando.getParametro());
	}
	
	@Test
	public void testComandoVai() {
		Comando comando = fabbricaDiComandi.costruisciComando("vai nord", io);
		assertEquals("vai", comando.getNome());
		assertEquals("nord", comando.getParametro());
	}
}
