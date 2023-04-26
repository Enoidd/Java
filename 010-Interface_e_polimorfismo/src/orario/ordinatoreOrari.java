package orario;

public class ordinatoreOrari {

	public void ordina(Comparabile[] lista) {

		int min;
		// Scorri tutta la collezione di elementi
		for(int ord=0; ord < lista.length; ord++) {
			min = ord;
			for(int i=ord+1; i<lista.length; i++)
				if(lista[i].minoreDi(lista[min])) {
					// Scambia
					Comparabile temp = lista[i];
					lista[i] = lista[min];
					lista[min] = temp;
				}
		}
	}
}
