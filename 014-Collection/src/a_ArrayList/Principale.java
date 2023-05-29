package a_ArrayList;

/*
 * Gli ArrayList aumentano la dimensione automaticamente. Inizialmente dimensione vale 10.
 */

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		
		// Index:               1         2         3
		String[] attrezzi = {"Mazza", "Bastone", "Ascia"};
		
		System.out.println("========ARRAY:");
		for(String iteratore : attrezzi) {
			System.out.println(iteratore);
		}
		
		// Se provo ad aggiungere un altro elemento
//		attrezzi[3] = "Pugnale";
		// STAMPA QUESTO ERRORE: Index 3 out of bounds for length 3 perché ho superato la dim max
		
		// Ci vengono in aiuto gli ArrayList
		
		// Creo un ArrayList di Stringhe (per interi: Integer)
		final ArrayList<String> attrezziStringati = new ArrayList<>();
		
		attrezziStringati.add("Spada");
		attrezziStringati.add("Scudo");
		attrezziStringati.add("Sciabola");
		attrezziStringati.add("Lancia");
		
		
		System.out.println("========ArrayList:");
		// Per ogni Stringa iteratore di nome 'attrezziStringati'
		for(String iteratore : attrezziStringati) {
//			System.out.println(iteratore);	// Stampa uno sotto l'altro
			// Se invece volessi la stampa tutta in linea
			System.out.print(iteratore+" ");
		}
		
		// Ottenere gli elementi dall'ArrayList: GET
		System.out.println("\n========Primo attrezzo dell'ArrayList:");
		String primoAttrezzo = attrezziStringati.get(0);
		System.out.println(primoAttrezzo);
		
		// Se non conosco la Size dell'ArrayList ma voglio sapere quale è l'ultimo elemento
		final String ultimoAttrezzo = attrezziStringati.get(attrezziStringati.size()-1);
		System.out.println("\n========Ultimo attrezzo dell'ArrayList:");
		System.out.println(ultimoAttrezzo);
		
		// Assegnare un nuovo valore a qualcosa che già esiste
		attrezziStringati.set(2, "Balestra");
		System.out.println("\nMODIFICO l'ArrayList");
		System.out.println("========ArrayList:");
		// Per ogni Stringa iteratore di nome 'attrezziStringati'
		for(String iteratore : attrezziStringati) {
			System.out.print(iteratore+" ");
		}
		
		// Rimozione elementi
		// Sono Overloadati, posso inserire sia l'indice dell'ArrayList sia l'oggetto
		attrezziStringati.remove(2);
		attrezziStringati.remove("Scudo");
		// Se ho due occorrenze, il remove fornendo l'oggetto, rimuove la PRIMA occorrenza trovata
		
		System.out.println("\n\nRIMOZIONE: Sciabola e Scudo");
		for(String iteratore : attrezziStringati) {
			System.out.print(iteratore+" ");
		}
		
		// Rimozione di tutti gli elementi
		System.out.println("\n\nCANCELLAZIONE DI TUTTI GLI ELEMENTI:");
		attrezziStringati.clear();
		System.out.println("Dimensione ArrayList: "+attrezziStringati.size());
		
		/*
		 * 
		 * LISTA
		 *  __
		 * |__|-------->:ARRAYLIST
		 * 			      _____        :array[]
		 * 				 |     |	   __________      :String
		 * 				 |     |----> |[0] ------|---->|nome: " "|
		 *				 |_____|	  |[1]       |
		 *							  |[2] ------|---->:String
		 *							  |[3]       |     |nome: " "|
		 *                            |__________|
		 *		
		 */						 
	}

}
