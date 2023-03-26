package esercitazione;

public class dummy {

	/* Cerca all'interno di un array di Stringhe, ritorna l'indice di una stringa
	 * 'parola' se lo trova ritorna l'indice, altrimenti se non lo trova ritorna -1 
	 */
	public int search(String[] elenco, String parola) {
		int i = 0;
		for(String StringaCorrente : elenco) {
			/*if(StringaCorrente == parola) {  confronta la stringa dell'elemento corrente (elenco --> Array) se ha stesso riferimento della parola 'parola' */
			if(StringaCorrente.equals(parola))	{
				return i;
			}
			i++;
		}
		return -1;
	}
	
	/* Dalla riga 26 si crea e definisce l'array. 
	 * Dalla riga 33 invece testa conla funzione 'search' se ciò che è contenuto nella stringa
	 * corrisponde all'indice 2, 3, 1, 4, 0 -1 etc. 
	 */
	public void searchTest() {
		System.out.println("test di search():");
		// inizializza l'elenco di stringhe
		String[] elenco = new String[5];
		elenco[0] = new String("anna");
		elenco[1] = new String("carla");
		elenco[2] = new String("sedia");
		elenco[3] = new String("sei");
		elenco[4] = new String("puma");
		// verifica la presenza di tutte le parole
		System.out.println("\t"+(this.search(elenco, new String("sedia"))==2));
		System.out.println("\t"+(this.search(elenco, new String("sei"))==3));
		System.out.println("\t"+(this.search(elenco, new String("carla"))==1));
		System.out.println("\t"+(this.search(elenco, new String("puma"))==4));
		System.out.println("\t"+(this.search(elenco, new String("anna"))==0));
		System.out.println("\t"+(this.search(elenco, new String("cane"))==-1));
		System.out.println("\t"+(this.search(elenco, new String("lume"))==-1));
		System.out.println("\t"+(this.search(elenco, new String("gino"))==-1));
		System.out.println("\t"+(this.search(elenco, new String("nota"))==-1));


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dummy dummy = new dummy();
		dummy.searchTest();
	}

}
