package domanda_1;

/*
 * Cosa stampa questo programma?
 * OUTPUT: 1, 4, 2
 */

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		K k = new K();	// Rif "k" a oggetto di tipo K
		int i = 1;
		k.stampa(i++);	// i=1 -> i++ = 2 -> i è un intero -> STAMPA: 1
		i++;	// i=1 -> i++ = 2
		float a = i++;	// 'a' è float quindi 2.0
		k.stampa("i");	// 'i' passata è una stringa -> STAMPA: 4
		k.stampa(a);	// 'a' è float -> a=2.0 -> STAMPA: 2
	}

}
