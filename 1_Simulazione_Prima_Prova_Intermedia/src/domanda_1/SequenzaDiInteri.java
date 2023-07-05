package domanda_1;

// OK

/*
 * Scrivere il metodo sommaDispari() che restituisce la somma di tutti 
 * gli elementi di posto dispari all’interno dell’array sequenza che compare 
 * come variabile d’istanza.
 * Suggerimento: l’operatore % serve a calcolare il resto di una divisione
 * 
 */

public class SequenzaDiInteri {
	// Variabile di istanza
	private int[] sequenza;
	// Setta la dimensione della 'sequenza'
	public SequenzaDiInteri(int dimensione) {
		this.sequenza = new int[dimensione];
	}
	
	public int sommaDispari() {
		
		int somma = 0;
		// Scorri la 'sequenza'
		for(Integer i : sequenza) {
			// L'elemento corrente è disparo? -> Sommalo a 'somma'
			if(i%2!=0) {
				somma += i;
			}
		}	// hai visitato tutta la 'sequenza'
		return somma;
	}
	
	public static void main(String[] args) {
		
		SequenzaDiInteri sequenza = new SequenzaDiInteri(5);
		
		sequenza.sequenza[0] = 1;
		sequenza.sequenza[1] = 2;
		sequenza.sequenza[2] = 3;
		sequenza.sequenza[3] = 4;
		sequenza.sequenza[4] = 5;
		
		System.out.println("Somma dei numeri dispari: "+sequenza.sommaDispari());
	}

}
