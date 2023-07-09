package domanda_3;

/*
 * Scrivere il metodo aggiungiInCoda(String nuovaStringa) che aggiunge la stringa nuovaStringa in 
 * coda all'array sequenza, che compare come variabile d'istanza, se e solo se l'array non ha già
 * raggiungo la sua capacità massima.
 */

public class SequenzaDiStringhe {
	
	public String[] sequenza;
	
	public SequenzaDiStringhe(int dimensione) {
		this.sequenza = new String[dimensione];
	}
	
	public void aggiungiStringhe(String stringa, int posizione) {
		this.sequenza[posizione] = stringa;
	}
	
	public boolean aggiungiInCoda(String nuovaStringa) {
		
		int count = 0;
		
		// Controlla se tutto l'array è pieno
		for(String iteratore: sequenza) {
			// l'elemento corrente è diverso da null
			if(iteratore!=null) {	// hai trovato un elemento
				count++;
			}
		} // Sei uscito dal for hai visitato tutto l'array
		// Gli elementi contati nell'array sono diversi rispetto alla sua dimensione
		if(count != sequenza.length) {
			// aggiungi l'elemento in coda
			sequenza[sequenza.length-1] = nuovaStringa;
			return true;
		}
		return false;
	}
}
