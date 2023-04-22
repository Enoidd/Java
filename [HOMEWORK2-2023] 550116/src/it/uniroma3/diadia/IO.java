package it.uniroma3.diadia;

public interface IO {
	
	/**
	 * Il messaggio che si vuole mostrare
	 * @param msg
	 */
	public void mostraMessaggio(String messaggio);
	
	
	/**
	 * Legge un input
	 * @return riga, "riga" è l'input passato
	 */
	public String leggiRiga();
}
