package sequenzadistringhe;
ciao
/*
 * Scrivere il metodo haDoppioni() che restituisce true se 
 * all’interno dell’array sequenza , che compare come variabile d’istanza
 * sono presenti almeno due elementi uguali tra loro. 
 * Il metodo restituisce false altrimenti
 */

public class SequenzaDiStringhe {

	private String[] sequenza;
	
	/**
	 * Definisce la dimensione della sequenza
	 * @param dimensione
	 */
	public SequenzaDiStringhe(int dimensione) {
    	this.sequenza = new String[dimensione];
	}

	/**
	 * Aggiunge una nuova stringa alla posiione voluta
	 * @param stringa
	 * @param posizione dove si aggiunge la stringa
	 */
	public void aggiungiStringa(String stringa, int posizione) {
    	this.sequenza[posizione] = stringa;
	}
	
	
	public boolean haDoppioni(){
		boolean ris = false;
		
		for(int i=0; i<sequenza.length-1; i++) {
			if(sequenza[i]!=null)
				for(int j=i+1; j<sequenza.length; j++){
					if(sequenza[j]!=null)
						if(sequenza[i].equals(sequenza[j]))
							ris = true;
			}
		}
		return ris;
	}
	
	/* Scrivere il metodo aggiungiInCoda(String nuovaStringa) che aggiunge la stringa nuovaStringa in coda 
	 * all’array sequenza, che compare come variabile d’istanza, se e solo se l’array 
	 * non ha giá raggiunto la sua capacitá massima. */
	public boolean aggiungiInCoda(String nuovaStringa) {
		
		for(int i=0; i<this.sequenza.length; i++) {
			if(sequenza[i]==null) {
				sequenza[i] = nuovaStringa;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Aggiungi in cosa con for each
	 * @param args
	 */
	/*public boolean aggiungiInCodaForEach(String nuovaStringa) {
		
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SequenzaDiStringhe s = new SequenzaDiStringhe(2);
		
		s.sequenza[0] = "Ciao";
		s.sequenza[1] = "Ciao";
		
		boolean ris = s.haDoppioni();
		
		System.out.println(ris);
		
		SequenzaDiStringhe s1 = new SequenzaDiStringhe(2);
		
		s1.aggiungiStringa("Sofia", 0);
		s1.aggiungiStringa("Sofia", 1);
		System.out.println(s1.aggiungiInCoda("Sofia"));	// Atteso: False
		
	}

}
