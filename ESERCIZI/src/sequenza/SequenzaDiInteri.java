package sequenza;

public class SequenzaDiInteri {

	private int [] sequenza;

	public SequenzaDiInteri(int numeroInteri) {
		//this.sequenza - new int[numeroIntreri];
		this.sequenza = new int[numeroInteri];
	}

	/**
	 * Metodo che somma tutti i valori dispari dell'array
	 * @return somma
	 */
	public int sommaDispari() {
		//int somma;
		int somma = 0;

		for(int i = 0; i < sequenza.length; i++) {
			//if(i % 2 == 1)
			if(sequenza[i] % 2 == 1)
				somma += sequenza[i];
		}

		return somma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SequenzaDiInteri sequenza = new SequenzaDiInteri(5);

		// inizializza i valori dell'array
		sequenza.sequenza[0] = 1;
		sequenza.sequenza[1] = 2;
		sequenza.sequenza[2] = 3;
		sequenza.sequenza[3] = 4;
		sequenza.sequenza[4] = 5;

		// chiama il metodo sommaDispari() e stampa il risultato
		int sommaDispari = sequenza.sommaDispari();
		System.out.println("La somma degli elementi con indice dispari è: " + sommaDispari);
	}

}