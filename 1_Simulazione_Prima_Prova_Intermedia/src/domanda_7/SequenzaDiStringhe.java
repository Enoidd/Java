package domanda_7;

// OK

/*
 * Scrivere un metodo haDoppioni() che restituisce 'true' se all'interno dell'array 'sequenza'
 * che compare come variabile di istanza, sono presenti almeno due elementi uguali tra loro.
 * Il metodo restituisce 'false' altrimenti.
 * 
 */

public class SequenzaDiStringhe {

	private String[] sequenza;
	
	public SequenzaDiStringhe(int dimensione) {
		this.sequenza = new String[dimensione];
	}
	
	public boolean haDoppioni() {
		// Scorri la sequenza di stringhe
		for(int i=0; i<sequenza.length-1; i++) {
			for(int j=i+1; j<sequenza.length; j++) {
				if(sequenza[i].equals(sequenza[j]))
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		SequenzaDiStringhe sequenza = new SequenzaDiStringhe(4);
		
		sequenza.sequenza[0] = "Ciao";
		sequenza.sequenza[1] = "Ciaaoo";
		sequenza.sequenza[2] = "Ciao";
		sequenza.sequenza[3] = "Ciaaao";
		
		System.out.println("C'è un doppione: "+sequenza.haDoppioni());
	}

}
