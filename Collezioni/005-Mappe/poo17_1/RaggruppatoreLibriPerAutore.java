package poo17_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RaggruppatoreLibriPerAutore {
	
	// Lista di libri.
	private List<Libro> elencoLibri;
	
	public RaggruppatoreLibriPerAutore() {
		this.elencoLibri = new ArrayList<>();
	}
	
	public void aggiungiLibro(Libro libro){
		this.elencoLibri.add(libro);
	}
	
	/* 
	 * Restituisce una mappa le cui chiavi sono i nomi di autori di libri; la mappa associa ad ogni
	 * nome un valore che risulta essere la lista di tutti gli oggetti Libro da tale autore.
	 */
	public Map<String, List<Libro>> autore2Libri(){
		
		// La mappa che deve restituire.
		// Prende un nome come chiave e una lista di libri come valore.
		Map<String, List<Libro>> autore2Libri = new HashMap<String, List<Libro>>();
		
		// Scorri la lista di libri.
		for(Libro libri : this.elencoLibri) {
			// Se l'elemento corrente contiene la stessa chiave di quella contenuta nell'elencoLibri
			if(autore2Libri.containsKey(libri.getAutore())) {
				// Prendi il valore dell'autore corrente e aggiungilo alla mappa
				autore2Libri.get(libri.getAutore()).add(libri);
			}
			// Altrimenti la mappa non contiene quell'autore
			else {
				// Crea una nuova lista
				List<Libro> li = new ArrayList<>();
				// Aggiungi a li il libro corrente
				li.add(libri);
				// aggiungi alla mappa, l'autore corrente.
				autore2Libri.put(libri.getAutore(), li);
			}
		}
		return autore2Libri;
	}
}
