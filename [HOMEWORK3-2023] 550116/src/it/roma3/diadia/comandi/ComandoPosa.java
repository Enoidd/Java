package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {

	private String nomeAttrezzo;
	private IO console;
	private String nome = "posa";
	
	@Override
	public void esegui(Partita partita) {

		Attrezzo attrezzoInBorsa = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		// Se la borsa è vuota oppure l'attrezzo che si vuole posare non è presente in borsa
		if(partita.getGiocatore().getBorsa().isEmpty())
			console.mostraMessaggio("Borsa vuota");
		// Altrimenti se il numero di attrezzi in stanza è superiore a 10
		else if(partita.getLabirinto().getStanzaCorrente().getAttrezziInStanza() > 10)
			console.mostraMessaggio("Stanza piena. Non puoi posare nessun attrezzo.");
		else	// Altrimenti posalo nella stanza
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
		this.console = console;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return this.nomeAttrezzo;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

}
