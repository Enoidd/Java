package domanda_5;

// OK

/*
 * Implementare il metodo ContaOccorrenze(String[] sequenza, String[] daControllare),
 * che dato un array 'daControllare', conti e inserisca in un nuovo array, le occorrenze della parola
 * i-esima dell'array 'daControllare' nell'array 'sequenza'. Le occorrenze delle parole dovranno
 * essere posizionate seguendo gli stessi indici dell'array 'daControllare'.
 * 
 * Es:
 * 
 * se daControllare={"a", "b", "c"} e sequenza={"a", "c", "a","e"} allora il metodo dovrà restituire:
 * {2, 0, 1}.
 */

public class ContatoreOccorrenzePosizione {

	public int[] ContaOccorrenze(String[] sequenza, String[] daControllare) {
		// La sequenza controllata ha la stessa dimensione di quella daControllare
		int[] sequenza_controllata = new int[daControllare.length];

		// Per ogni elemento della sequenza daControllare
		for (int i=0; i<daControllare.length; i++) {
			// E per ogni elemento della sequenza
			for(int j=0; j<sequenza.length; j++) {
				// Verifica se ci sono occorrenze
				if(daControllare[i].equals(sequenza[j])) {
					sequenza_controllata[i]++;
				}
			}
		}
		return sequenza_controllata;
	}

	public static void main(String[] args) {

		ContatoreOccorrenzePosizione s = new ContatoreOccorrenzePosizione();

		String[] sequenza = {"a", "c", "a", "e"};
		String[] daControllare = {"a", "b", "c"};

		int[] sequenza_controllata = s.ContaOccorrenze(sequenza, daControllare);

		for(int i=0; i<sequenza_controllata.length; i++) {
			System.out.println(sequenza_controllata[i]);
		}
	}

}
