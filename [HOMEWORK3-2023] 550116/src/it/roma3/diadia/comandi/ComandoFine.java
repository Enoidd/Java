package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoFine implements Comando {

	public static final String MESSAGGIO_FINE = "Grazie per aver giocato!";
	private IO console;
	private String nome = "fine";

	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		partita.setFinita(); // Partita terminata
		this.console.mostraMessaggio(MESSAGGIO_FINE);
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIO(IO console) {
		// TODO Auto-generated method stub
		this.console = console;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

}
