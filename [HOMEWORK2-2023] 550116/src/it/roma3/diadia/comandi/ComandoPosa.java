package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {

	private String nomeAttrezzo;
	private IO console;
	@Override
	public void esegui(Partita partita) {

		Attrezzo attrezzoInBorsa = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		// Se la borsa è vuota oppure l'attrezzo che si vuole posare non è presente in borsa
		if(partita.getGiocatore().getBorsa().isEmpty())
			console.mostraMessaggio("Borsa vuota");
		else if(partita.getLabirinto().getStanzaCorrente().getAttrezziInStanza() > 10)
			console.mostraMessaggio("Stanza piena. Non puoi posare nessun attrezzo.");
		else
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(attrezzoInBorsa);
			partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);

	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		this.nomeAttrezzo = parametro;
	}

	@Override
	public void setIO(IO console) {
//		this.console = console;
	}

}
