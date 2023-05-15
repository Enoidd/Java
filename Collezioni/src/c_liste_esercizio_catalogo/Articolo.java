package c_liste_esercizio_catalogo;

/*
 * Sia definita una interface Articolo che rappresenta articoli
 * commerciali, dotata dei metodi String getNome() che restituisce il nome dell'articolo, double getPrezzo()
 * che restituisce il prezzo dell'articolo e String toString() che restituisce una descrizione (nome e prezzo)
 * dell'articolo.
 */

public interface Articolo {
	
	public String getNomeArticolo();
	public double getPrezzo();
	public String toString();
}
