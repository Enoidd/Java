package iteratorTest;

import java.util.ArrayList;
import java.util.List;

public class iteratore {
	
	/*
	 * L'interface List<E> estende Collection<E> e corrisponde ad una collezione ordinata;
	 * in cui rispetto agli insiemi (Set<E>) possono contenere duplicati.
	 * 
	 * Oltre alle operazioni offerte dal supertipo 'Collection<E>' vengono offerti i metodi di:
	 * 
	 * 	- Accesso posizionale in base alla posizione nella lista.
	 * 	- Ricerca della posizione di un elemento nella lista.
	 */
	private List<String> vuota;
	private List<String> singoletto;
	private String solitario;
	
	public void iteratore() {
		this.vuota = new ArrayList<>();	// Una lista vuota
		this.singoletto = new ArrayList<String>();	// Un solo elemento ('singoletto') in lista
		this.solitario = new String("Solitario");	// Una stringa "Solitario"
		this.singoletto.add(this.solitario);	// aggiungi a 'Singoletto' "solitario"
		
		/*
		 * this.singoletto.add(this.solitario);
		 * 
		 * 	Singoletto    Solitario
		 * 		↓↓           ↓↓
		 * 	   ____         ____
		 *    |____|→→→→→→→|____|
		 *    
		 * 
		 */
		
		
	}
}
