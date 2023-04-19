package it.roma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

/**
 * Questa classe modella un comando.
 * Un comando consiste al piu' di due parole:
 * il nome del comando ed un parametro
 * su cui si applica il comando.
 * (Ad es. alla riga digitata dall'utente "vai nord"
 *  corrisponde un comando di nome "vai" e parametro "nord").
 *
 * @author  docente di POO
 * @version base
 */

public interface Comando{
	/** 
	 * Esecuzione del comando
	 */
	public void esegui(Partita partita);

	/** 
	 * Set parametro del comando
	 */
	public void setParametro(String parametro);
	
	/**
	 * Set IOConsole
	 */
	public void setIO(IO console);
}	