package studente;

public class ordinatoreEta {
	/**
	 * La variabile 'orario' essendo di tipo Interface Comparabile possiede il metodo 
	 * offerto dall'interfaccia 'minoreDi'
	 */
	public void ordina(Comparabile[] studente) {
		int min;
		for(int i=0; i<studente.length-1; i++) {
			min = i;
			for(int j=min+1; j<studente.length; j++)
				if(studente[j].minoreDi(studente[min])) {
					// Scambia
					Comparabile temp = studente[j];
					studente[j] = studente[min];
					studente[min] = temp;
				}
		}
	}
}
