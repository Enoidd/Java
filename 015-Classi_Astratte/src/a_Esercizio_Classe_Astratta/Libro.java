package a_Esercizio_Classe_Astratta;

public abstract class Libro {
	
	private String titolo;
	private String autore;
	
	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}
	
	// Metodo astratto per calcolare il prezzo del libro - che viene implementato
	// nelle classi derivate.
	public abstract double calcolaPrezzo();
	
	public void stampaDettagli() {
		System.out.println("Autore: "+this.autore+" ,Titolo: "+this.titolo);
	}
}
