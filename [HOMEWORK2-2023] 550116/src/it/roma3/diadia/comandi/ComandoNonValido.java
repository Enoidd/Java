package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {

	private IO console;
	private String nome = "Comando non valido";

	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		this.console.mostraMessaggio("Comando non valido");
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
