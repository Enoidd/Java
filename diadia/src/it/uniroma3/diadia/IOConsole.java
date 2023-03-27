package it.uniroma3.diadia;
import java.util.Scanner;

public class IOConsole {
	
	/**
	 * Il messaggio che si vuole mostrare
	 * @param msg
	 */
	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * Legge un input
	 * @return riga, "riga" è l'input passato
	 */
	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		//scannerDiLinee.close();
		return riga;	// Di tipo String
	}
}
