package g_mappe;

import java.util.*;
/*
 * HashMap<K, V>
 * 
 * Definita attraverso: hashCode() & equals()
 */
public class Rubrica {
	// String <- Chiave, Integer <- Valore
	private Map<String, Integer> rubrica;
	
	public Rubrica() {
		this.rubrica = new HashMap<String, Integer>();
		this.rubrica = new HashMap<>();	// Equivalente a sopra
	}
	
	/*
	 * Inserisce la coppia chiave-valore nella mappa.
	 * 
	 * Se la chiave già esiste, viene aggiornato il valore.
	 * Se la chiave non esiste, viene inserita una nuova coppia e ritorna 'null'
	 */
	public void inserisci(String nome, Integer numero) {
		this.rubrica.put(nome, numero);
	}
	
	/*
	 * Rimuove la coppia associata alla chiave, null se la chiave non esiste
	 */
	public void rimuovi(String nome) {
		this.rubrica.remove(nome);
	}
	
	/*
	 * Restituisce in un insieme tutte le chiavi
	 */
	public Set<String> nomiInRubrica(){
		return this.rubrica.keySet();
	}
	
	/*
	 * Restituisce il valore associato alla chiave
	 */
	public Integer dammiIlNumeroDi(String nome) {
		return this.rubrica.get(nome);
	}
	
	/*
	 * Aggiorna il valore associato alla chiave
	 */
	public Integer aggiornaNumero(String nome, Integer numero) {
		return this.rubrica.put(nome, numero);
	}
	
	/*
	 * Cancella tutte le coppie chiave-valore nella mappa
	 */
	public void cancellaCoppieMappa() {
		this.rubrica.clear();
	}
	
	/*
	 * Restituisce una collezione di valori
	 */
	public Collection<Integer> valori(){
		return this.rubrica.values();
	}
	
	/*
	 * verifica se la chiave è presente nella mappa
	 */
//	public boolean chiavePresente(Object chiave) {
//		Rubrica r = (Rubrica) chiave;
//		return this.rubrica.containsKey());	// NON SO SE E' GIUSTA
//	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("-------------------------");
		str.append("Rubrica\n");
		
		Set<String> nomi = this.nomiInRubrica();
		
		for(String s: nomi) {
			str.append(s);
			str.append(": ");
			str.append(this.dammiIlNumeroDi(s));
			str.append("\n");
		}
		str.append("-------------------------");
		return str.toString();
	}
}
