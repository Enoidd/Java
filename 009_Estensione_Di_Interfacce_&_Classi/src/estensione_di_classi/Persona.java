package estensione_di_classi;

/*
 * E' possibile definire una nuova classe a partire da una classe esistente. Infatti è possibile:
 * 	
 * 	- aggiungere variabili e metodi a quelli della classe originale.
 * 	- sovrascrivere i metodi della classe originale.
 * 
 * La classe di partenza si chiama 'superclasse' mentre la classe definita per estensione a partire 
 * da un altra classe viene chiamata 'classe base' oppure 'classe estesa' oppure 'classe derivata'.
 * 
 * NB. 
 * La classe derivata può essere a sua volta utilizzata come 'classe base' di una nuova classe.
 * 
 * 
 * La classe Object è la classe radice di tutte le lasse in java ed offre dei metodi quali ad es:
 * 
 * tiString(), equals(Object o) etc.
 */
public class Persona extends Object {	// equivale a scrivere public class Persona{ ecc...
	// Variabili di istanza
	private String nome;
//	private String cognome;
//	private int eta;
	
	// Costruttore
	public Persona(String nome) {
		this.nome = nome;
//		this.cognome = cognome;
//		this.eta = 0;
	}
	
	/**
	 * Metodi
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
//	public void setCognome(String cognome) {
//		this.cognome = cognome;
//	}
//	
//	public String getCognome() {
//		return this.cognome;
//	}
//	
//	public void setEta(int eta) {
//		this.eta = eta;
//	}
//	
//	public int getEta() {
//		return this.eta;
//	}
	
	public String toString() {
		return this.getNome();
	}
}
