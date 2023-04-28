package it.uniroma3.diadia.fixture;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IOSimulator;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;


/*
 * Fixture è una classe che si trova all'interno della cartella di test che non contiene dei test,
 * ma contiene una serie di metodi utili a tutti i test e non ad una singola classe di test.
 * 
 * E' possibile effettuare dei test con IOSimulator su tutti i comandi grazie a questa classe, contenente
 * dei "factory methods" cioè dei metodi a fattor comune validi per almeno due classi di test.
 */
public class Fixture {

	public static IOSimulator creaSimulazionePartitaEgioca(String... righeDaLeggere) {
		IOSimulator io = new IOSimulator(righeDaLeggere);	// creo IOSimulator e gli passo le righe da leggere
		new DiaDia(io).gioca();	// Invochiamo "gioca" di DiaDia e gli passiamo IOSimulator
		return io;	// ritorna IOSimulator (contiene al suo interno tutti i msg di output)
	}
	
	public static Attrezzo creaAttrezzoEaggiungiAstanza(Stanza stanzaDaRiempire, String nomeAttrezzo, int peso) {
		Attrezzo attrezzo = new Attrezzo(nomeAttrezzo, peso);
		stanzaDaRiempire.addAttrezzo(attrezzo);
		return attrezzo;
	}
}
