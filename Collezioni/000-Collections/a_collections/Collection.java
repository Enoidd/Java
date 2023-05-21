package a_collections;

import java.util.Collections;
import java.util.Iterator;

/*
 * L'interfaccia Collection:
 * 
 * 	- Dichiara i metodi di una generica collezione:
 * 		
 * 			- Aggiungere un elemento alla collezione.
 * 			- Verificare la dimensione di una collezione.
 * 			- Verificare se la collezione è vuota.
 * 			- Aggiungere tutti gli elementi di un altra collezione.
 * 			- Ottenere un iteratore con cui "scandire" la collezione.
 * 
 * Questi metodi permettono di svolgere operazioni:
 * 
 * 			- Di base.
 * 			- Bulk.
 * 			- Conversione da e verso Array.
 */
	
public interface Collection<E> extends Iterable<E> {
	
	// OPERAZIONI DI BASE
	
	int size();	// Ritorna il numero di elementi presenti nella collezione.
	boolean isEmpty();	// Ritorna TRUE se la collezione è vuota, FALSE altrimenti.
	boolean contains(Object element);	// Ritorna TRUE se la collezione contiene un elemento uguale
										// a quello passato come parametro (l'uguaglianza è verificata
										// dal metodo 'equals'
	
	boolean add(E element);	//Aggiunge alla collezione l'elemento passato, ritorna TRUE se la collezione
							// è cambiata dopo la chiamata a questo metodo
	
	boolean remove(Object element);	// Rimuove dalla collezione gli elementi uguali all'oggetto
									// passato come parametro (uguaglianza verifica da 'equals'.
									// Ritorna TRUE se la collezione è cambiata dopo l'invocazione
									// del metodo.
	
	Iterator<E> iterator();	// Restituisce l'oggetto Iterator, per iterare sugli elementi della
								// collezione.

	
	// BULK OPERATIONS
	
	boolean containsAll(Collection<?> c); // Ritorna TRUE se la collezione contiene tutti gli elementi
										  // della collezione passata come parametro.
	
	boolean addAll(Collection<? extends E> c);	// Aggiunge alla collezione tutti gli elementi della 
												// collezione passata come parametro; ritorna TRUE
												// se la collezione è cambiata dopo l'invocazione
												// del metodo.
	
	boolean removeAll(Collection<?> c);	// Rimuove dalla collezione tutti gli elementi uguali,
										// uguaglianza verificata dal metodo 'equals', che sono contenuti
										// nella collezione passata come parametro.
										// Ritorna TRUE se la collezione è cambiata dopo l'invocazione.
	
	boolean retainAll(Collection<?> c);	// Rimuove dalla collezione tutti gli elementi che non sono
										// presenti nella collezione passata come parametro.
										// Ritorna TRUE se la collezione è cambiata dopo l'invocazione.
	
	void clear();	// Rimuove tutti gli elementi dalla collezione.
	
	// ARRAY OPERATION
	
	Object[] toArray();
	<T> T[] toArray(T[] a);
}
