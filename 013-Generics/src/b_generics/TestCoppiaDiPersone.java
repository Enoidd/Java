package b_generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoppiaDiPersone {

	@Test
	public void testCoppiaDipersone() {
		Coppia<Persona> coppia;	// Coppia di Persone <Persona> coincide con <T> nella classe Coppia
		
		Persona p1 = new Persona("Stanlio");
		Persona p2 = new Persona("Olio");
		
		coppia = new Coppia<Persona>(p1, p2);
		
		assertSame(p1, coppia.getPrimo());
		assertSame(p2, coppia.getSecondo());
		
		String pippo = new String("Pippo");	// Creo una Stringa chiamata 'pippo'
		Persona p3 = new Persona(pippo);	// Creo una Persona e gli passo il riferimento stringa chiamato 'pippo'
		
//		coppia.setPrimo(pippo); //Non COMPILA perché 'setPrimo' in 'coppia' si aspetta una persona
		coppia.setPrimo(p3);	// COMPILA perché 'setPrimo' in 'coppia' si aspetta una persona e p3 è una persona
		
		assertSame(p3, coppia.getPrimo());	// TRUE
		
		
		Coppia<Attrezzo> coppiaAttrezzo;	// Coppia di Attrezzi <Attrezzo> coincide con <T> nella classe Coppia
		
		Attrezzo a1 = new Attrezzo("Spada");
		Attrezzo a2 = new Attrezzo("Sciabola");
		
		coppiaAttrezzo = new Coppia<Attrezzo>(a1, a2);
		
		assertSame(a1, coppiaAttrezzo.getPrimo());
		assertSame(a2, coppiaAttrezzo.getSecondo());
		
		/*
		 * Prova con classe 'Studente' sotto-tipo della classe 'Persona'
		 */
//		Coppia<Persona> coppiaClasseEstesa;
//		
//		Persona p4 = new Studente("Erminio");
//		Persona p5 = new Studente("Erminia");
//		
//		coppiaClasseEstesa = new coppiaClasseEstesa<Studente>(p4, p5);
		
	}

}
