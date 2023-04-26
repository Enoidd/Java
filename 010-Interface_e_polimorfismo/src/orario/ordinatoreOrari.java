package orario;

public class ordinatoreOrari {

	public static void ordina(Orario[] lista) {

		int min;
		// Scorri tutta la collezione di elementi
		for(int ord=0; ord < lista.length; ord++) {
			min = ord;
			for(int i=ord+1; i<lista.length; i++)
				if(lista[i].minoreDi(lista[min])) {
					// Scambia
					Orario temp = lista[i];
					lista[i] = lista[min];
					lista[min] = temp;
				}
		}
	}
}
