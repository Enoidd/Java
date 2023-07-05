package domanda_4;

// OK

/*
 * Scrivere il codice del metodo:
 * public boolean verificaDuplicati(String nome)
 * affinché ritorni 'true' se nell'array 'nomi' ci sono almeno due elementi uguali alla stringa 'nome'
 * passata come parametro. Ritorna 'false' altrimenti.
 */

public class Persone {

	private String[] nomi;
	
	public Persone(int dimensione) {
		this.nomi = new String[dimensione];
	}
	
	public void aggiungiNome(String nome, int indice) {
		this.nomi[indice] = nome;
	}
	
	public boolean verificaDuplicati(String nome) {
		
		int count = 0;
		// Scorri la sequenza
		for(int i=0; i<nomi.length; i++) {
			if(nomi[i].equals(nome)) {
				count++;
				if(count==2) {
					return true;
				}
			}
		}	// Hai visitato tutta la sequenza e non hai trovato due doppioni
		return false;
	}
	
	public static void main(String[] args) {
		
		Persone sequenza = new Persone(3);
		
		sequenza.nomi[0] = "Paolo";
		sequenza.nomi[1] = "Carmine";
		sequenza.nomi[2] = "Carlo";
		
		System.out.println("Doppioni trovati: "+sequenza.verificaDuplicati("Carlo"));

	}

}
