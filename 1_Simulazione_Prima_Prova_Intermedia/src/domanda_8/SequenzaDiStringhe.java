package domanda_8;

// OK

/*
 * Scrivere il metodo aggiungiInCoda(String nuovaStringa) che aggiunge la stringa nuovaStringa
 * in coda all'array sequenza, che compare come variabile d'istanza, se e solo se l'array
 * non ha già raggiunto la sua capacità massima.
 */

public class SequenzaDiStringhe {

	private String[] sequenza;
	
	public SequenzaDiStringhe(int dimensione) {
		this.sequenza = new String[dimensione];
	}
	
	public boolean aggiungiInCoda(String nuovaStringa) {
		
		// Scorro l'array
		for(int i=0; i<sequenza.length; i++) {
			// l'elemento i-esimo corrente è null
			if(sequenza[i]==null) {
				sequenza[i] = nuovaStringa;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		SequenzaDiStringhe sequenza = new SequenzaDiStringhe(4);
		
		sequenza.sequenza[0] = "Sofia";
		sequenza.sequenza[1] = "Ezio";
		sequenza.sequenza[2] = "Sandro";
		sequenza.sequenza[3] = "Lorena";
		
		System.out.println("====Sequenza:");
		for(int i=0; i<sequenza.sequenza.length; i++) {
			System.out.println(sequenza.sequenza[i]);
		}
		
		System.out.println("\nAggiunto in coda: "+sequenza.aggiungiInCoda("Carla"));
		
		System.out.println("\n====Sequenza con aggiunga in coda:");
		for(int i=0; i<sequenza.sequenza.length; i++) {
			System.out.println(sequenza.sequenza[i]);
		}
	}

}
