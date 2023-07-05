package domanda_6;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * TEORICAMENTE NELL'ESERCIZIO C'E' SOLO IL MAIN CHE NON E' CONTENUTO IN NESSUNA
 * DELLE CLASSI, QUINDI NON STAMPEREBBE NULLA PERCHE' DEVE ESSERE CONTENUTO IN UNA CLASSE
 * PER FUNZIONARE.
 */

public class Principale {

	public static void main(String[] args) {

		int array[] = new int[4];	// Array di dim 4
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;

		int i, j, k = 0;
		// Scorre la sequenza 
		for (i = 0; i < 4; i++) {
			array[i] = k;
			k++;
		}
		// Scorre nuovamente la sequenza
		for (i = 0; i < 4; i++) {

			for (j = 0; j < i + 1; j++)
				System.out.print(array[i] + " ");
				// STAMPA: 0 1 1 2 2 2 3 3 3 3
		}
	}
}
