package mappe;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rubrica r = new Rubrica();	// Creo una rubrica
		
		/* Creo 4 Stringhe */
		String s1 = new String("Paolo"), s2 = new String("Fabio");
		String s3 = new String("Anna"), s4 = new String("Carla");
		
		r.inserisci(s1, 1234001); 	// Inserisco Paolo->1234001
		r.inserisci(s2, 1234002);	// Inserisco Fabio->1234002
		r.inserisci(s3, 1234003); 	// Inserisco Anna->1234003
		r.inserisci(s4, 1234004); 	// Inserisco Carla->1234004
		
		// Stampa la rubrica
		System.out.println(r.toString());
		
		Integer numeroCercato = r.dammiIlNumeroDi(s1);
		
		if(numeroCercato==null)
			System.out.println("Il numero di "+s1+"non esiste.");
		else
			System.out.println("Il numero di "+s1+" è: "+numeroCercato);
		
		// Oppure
		System.out.println("Il numero cercato di "+s2+" è: "+r.dammiIlNumeroDi(s2));	// Se non è null
		
		// Rimuovo s2
		r.rimuovi(s2);
		
		// Stampa la rubrica - MANCA FABIO (è stato rimosso)
		System.out.println(r.toString());
		
		// Cambio il numero di PAOLO (E mi faccio stampare il numero vecchio)
		Integer nuovoNumero = 555001;
		Integer numeroVecchio = r.aggiornaNumero(s1, nuovoNumero);
		
		System.out.println("Aggiornato il numero di "+s1+" da: "+numeroVecchio+" a: "+nuovoNumero);
		
		// Stampa la rubrica
		System.out.println(r.toString());
		
		// Stampa tutti i nomi (chiavi)
		System.out.println("Nomi in rubrica: "+r.nomiInRubrica());
		
		// Verifica se un nome è presente in rubrica
//		System.out.println("Fabio presente in rubrica: "+r.chiavePresente(s2));
		
		
	}

}
