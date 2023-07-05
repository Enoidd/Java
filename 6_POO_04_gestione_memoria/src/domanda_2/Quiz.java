package domanda_2;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: DIVERSI - UGUALI
 */

public class Quiz {

	private void run() {
		String nome1 = new String("Mario"); // 2°
		String nome2 = new String("Mario"); // 3°

		if(nome1 == nome2) // confronta le allocazioni di memoria che ovviamente sono diverse
			System.out.print("UGUALI");
		else
			System.out.print("DIVERSI");	// <<-- Stampa "DIVERSI"

		System.out.print("-"); // <<-- Stampa

		if(nome1.equals(nome2))	// Confronta il contenuto delle stringhe (Mario e Mario sono uguali)
			System.out.print("UGUALI");	// <<-- Stampa "UGUALI"
		else
			System.out.print("DIVERSI");

	}

	public static void main(String[] args) {
		new Quiz().run(); // 1°
	}

}
