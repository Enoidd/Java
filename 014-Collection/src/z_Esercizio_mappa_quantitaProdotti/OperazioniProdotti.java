package z_Esercizio_mappa_quantitaProdotti;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

/*
 * Scrivere il metodo getProdotto2quantita() della classe OperazioniProdotti. Tale metodo riceve in input due mappe.
 * La prima mappa, cod2prod, associa un codice di tipo String ad un oggetto di tipo prodotto.
 * La seconda mappa, cod2qta, associa un codice di tipo String ad una quantità di tipo Integer.
 * 
 * Il metodo deve restituire una mappa che associa i prodotti della prima mappa alle quantità della seconda mappa, usando
 * la corrispondenza fra codici (le chiavi delle mappe).
 * 
 * E' possibile che per alcuni prodotti non siano riportate le quantità. In quel caso il prodotto deve essere riportato con 
 * quantità pari a -1.
 * 
 */

public class OperazioniProdotti {

	public Map<Prodotto, Integer> getProdotto2quantita(Map<String, Prodotto> cod2prod, Map<String, Integer> cod2qta) {
        
		// Creo una mappa chiave-valore
		Map<Prodotto, Integer> prodotto2quantita = new HashMap<>();
		
		// Itera sull'insieme delle chiavi della mappa cod2prod
		 for (String codice : cod2prod.keySet()) {
	            Prodotto prodotto = cod2prod.get(codice); // Prendi l'oggetto prodotto che corrisponde alla chiave 'codice'
	            Integer quantita = cod2qta.getOrDefault(codice, -1); // Prendi la quantità corrispondente alla chiave 'codice'
	            // se la chiave non è presente restituisce la quantità di default -1
	            prodotto2quantita.put(prodotto, quantita); // inserisce l'oggetto prodotto e la quantità nella nuova mappa
	        }
		 return prodotto2quantita;
	 }
	
	public static void main(String[] args) {
        // Esempio di utilizzo del metodo getProdotto2quantita()

        // Creazione delle mappe di prova
        Map<String, Prodotto> cod2prod = new HashMap<>();
        cod2prod.put("P001", new Prodotto("P001", 10));
        cod2prod.put("P002", new Prodotto("P002", 5));
        cod2prod.put("P003", new Prodotto("P003", 8));

        Map<String, Integer> cod2qta = new HashMap<>();
        cod2qta.put("P001", 3);
        cod2qta.put("P003", 7);

        // Chiamata del metodo getProdotto2quantita()
        OperazioniProdotti op = new OperazioniProdotti();
        Map<Prodotto, Integer> result = op.getProdotto2quantita(cod2prod, cod2qta);

        // Stampa dei risultati
        for (Prodotto prodotto : result.keySet()) {
            int quantita = result.get(prodotto);
            System.out.println("Prodotto: " + prodotto.getCodice() + ", Quantità: " + quantita);
        }
    }
}