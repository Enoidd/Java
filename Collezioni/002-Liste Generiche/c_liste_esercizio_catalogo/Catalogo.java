package c_liste_esercizio_catalogo;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
/*
 * Si scriva una classe Catalogo<E extends Articolo> che rappresenta un catalogo di articoli commerciali. La
 * classe memorizza gli articoli in una lista ed è dotata dei metodi void aggiungiArticolo(E art) che aggiunge un
 * articolo al catalogo, List<E> getArticoliSottoPrezzo(double prezzo) che restituisce una lista degli articoli il cui
 * prezzo è minore del valore passato come parametro, e String toString() che stampa l'intero catalogo.
 */

public class Catalogo<E extends Articolo> {
	
	private List<E> catalogo;	// il catalogo
	
	public Catalogo(String nome, double prezzo) {
		catalogo = new LinkedList<E>();
		
	}
	
	public void aggiungiArticolo(E art) {
		this.catalogo.add(art);
	}
	
	public List<E> getArticoliSottoPrezzo(double prezzo){
		
		List<E> articoli = new LinkedList<>();
		Iterator<E> it = this.catalogo.iterator();
		while(it.hasNext()) {
			E elemento = it.next();
			if(elemento.getPrezzo() < prezzo)
				articoli.add(elemento);
		}
		return articoli;
	}
	
	@Override
	public String toString() {
		
		String s = "Catalogo:";
		s+="-------------------";
		Iterator<E> it = this.catalogo.iterator();
		while(it.hasNext()) {
			E element = it.next();
			s+=element.toString()+"\n";
		}
		return s;
	}
}
