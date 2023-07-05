package g_HashMap;

import java.util.Map;
import java.util.HashMap;

/*
 * Una 'HashMap' è implementata utilizzando una tabella hash, che non garantisce un ordine
 * specifico degli elementi. Gli elementi vengono organizzati internamente utilizzando una funzione
 * hash, il che significa che l'ordine in cui sono memorizzati e iterati potrebbe variare.
 * 
 * NON AMMETTE CHIAVI DUPLICATE: Se si introduce la stessa chiave, il valore di quella chiave verrà
 * aggiornato.
 */

public class Principale {

	public static void main(String[] args) {

		// Creo la HASHMAP in chiave & valore
		Map<String, String> capitali = new HashMap<String, String>();

		// Inserisco le chiavi e i valori
		capitali.put("Inghilterra", "Londra");
		capitali.put("Italia", "Roma");
		capitali.put("Germania", "Berlino");

		// Come accedere ad un elemento:
		System.out.println(capitali.get("Germania")); // stampa Berlino

		// Se voglio vedere tutta la HashMap
		System.out.println(capitali);

		// Posso rimuovere un elemento in base alla chiave 
		capitali.remove("Inghilterra");

		// Se voglio vedere tutta la HashMap
		System.out.println(capitali);
		
		// Se voglio cancellare l'HashMap
//		capitali.clear();
//		System.out.println(capitali);
		
		// Verifica se una chiave è presente nella mappa
		System.out.println(capitali.containsKey("Italia"));
		
		Map<String, String> animali = new HashMap<String, String>();
		
		animali.put("Delfino", "Mammifero");
		animali.put("Cane", "Mammifero");
		animali.put("Cernia", "Pesce");
		
		// Metti dentro 'capitali' gli 'animali'
		capitali.putAll(animali);
		
		System.out.println(capitali);
		System.out.println(animali);
		
		// Restituisce un insieme di tutte le chiavi
		System.out.println(capitali.keySet());
		
		// Restituisce una collezione di tutti i valori
		System.out.println(capitali.values());
		
	}

}
