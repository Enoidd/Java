package domanda_3;

/*
 * Cosa stampa questo programma?
 * OUTPUT: 160 - 160 - 280
 */

public class Quiz {

	public static void main(String[] args) {

		Messaggio messaggio = new SMS("gigi", "damiano");

		Messaggio tweet = new Tweet("@gigi");

		Messaggio msg = new Messaggio();

		System.out.println(messaggio.getLunghezzaMassima());	// OP: 160
		System.out.println(msg.getLunghezzaMassima());	// OP: 160
		System.out.println(tweet.getLunghezzaMassima());	// OP: 280
	}
}
