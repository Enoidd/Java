package it.uniroma3.diadia;


import java.util.Scanner;

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

public class Comando {

    private String nome;
    private String parametro;
    
    public Comando(String istruzione) {
		Scanner scannerDiParole = new Scanner(istruzione);
	
		// prima parola: nome del comando
		if (scannerDiParole.hasNext())
			this.nome = scannerDiParole.next(); 

		// seconda parola: eventuale parametro
		if (scannerDiParole.hasNext())
			this.parametro = scannerDiParole.next();
    }

    /**
     * Ritorna il nome del comando inserito
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Ritorna il nome del parametro inserito
     * @return parametro, è il parametro, es. {nord, sud, est ovest} etc..
     */
    public String getParametro() {
        return this.parametro;
    }

    /**
     * Verifica se il nome è null
     * @return null
     */
    public boolean sconosciuto() {
        return (this.nome == null);
    }
}