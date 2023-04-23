package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {

	private String nomeAttrezzo;
	private IO console;

	@Override
	public void esegui(Partita partita) {

		Attrezzo attrezzoInStanza = partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		// Verifica se l'attrezzo può essere contenuto nella borsa (in base al peso)
		if(partita.getGiocatore().getBorsa().verificaPesoBorsa(attrezzoInStanza)) {	// se l'attrezzo entra nella borsa
			// Rimuovilo dalla stanza e mettilo in borsa
			partita.getGiocatore().getBorsa().addAttrezzo(attrezzoInStanza);
			console.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
			partita.getLabirinto().getStanzaCorrente().removeAttrezzo(attrezzoInStanza);
			// Debugging a stampa
			System.out.println("Rimosso da stanza");
		}
		else
			console.mostraMessaggio("Attrezzo troppo pesante per essere introddo nella borsa.");

	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}

	@Override
	public void setIO(IO console) {
		this.console = console;
	}

}
