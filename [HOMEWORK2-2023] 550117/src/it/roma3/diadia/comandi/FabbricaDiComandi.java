package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;

public interface FabbricaDiComandi {
	public Comando costruisciComando(String istruzione, IOConsole console);
	
}
