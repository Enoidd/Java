package domanda_2;

// OK

/* 
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: 1, 4, 2
 */

public class Quiz {

	public static void main (String[] args) {
		
		K k = new K();
		int i = 1;
		k.stampa(i++);
		i++;
		float a = i++;
		k.stampa("i");
		k.stampa(a);
	}

}

