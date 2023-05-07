package a_object;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CoppiaSenzaGenericsTest {

	@Test
	public void testCheCompilaEdEsegue() {
		
		Coppia coppia = new Coppia();	// Creo una 'coppia' di tipo 'Coppia'
		String pippo = new String("Pippo");
		String pluto = new String("Pluto");
		
		Persona p1 = new Persona(pippo);
		coppia.setPrimo(p1);	// setPrimo prende come parametro nel metodo un riferimento di tipo 'Object'
		
		Persona p2 = new Persona(pluto);
		coppia.setSecondo(p2);	// setSecondo prende come parametro nel metodo un riferimento di tipo 'Object'
		
		/*
		 * il metodo 'getPrimo' è nella classe 'Coppia' e non nella classe 'Persona' quindi faccio DOWNCASTING.
		 * 'Persona' è sotto-tipo di 'Object'. - 'Object' è radice di tutti i tipi in Java
		 */
		Persona persona = (Persona)coppia.getPrimo();	// <<-- Downcasting
		
		assertSame(pippo, persona.getNome());	// Verifica se 'persona' che contiene ora 'pippo' è uguale a 'pippo'
		
		/*
		 * Il tipo statico 'Object' coppia non contiene il metodo 'getNome' (è contenuto in Persona)
		 */
//		assertSame(pippo, coppia.getPrimo().getNome);
		
		 
	}
}
