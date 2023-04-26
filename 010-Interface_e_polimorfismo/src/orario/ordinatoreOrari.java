package orario;

public class ordinatoreOrari {

	/**
	 * La variabile 'orario' essendo di tipo Interface Comparabile possiede il metodo 
	 * offerto dall'interfaccia 'minoreDi'
	 */
	public void ordina(Comparabile[] orario) {

		int min;
		// Scorri tutta la collezione di elementi
		for(int ord=0; ord < orario.length; ord++) {
			min = ord;
			for(int i=ord+1; i<orario.length; i++)
				if(orario[i].minoreDi(orario[min])) {
					// Scambia
					Comparabile temp = orario[i];
					orario[i] = orario[min];
					orario[min] = temp;
				}
		}
	}
}
