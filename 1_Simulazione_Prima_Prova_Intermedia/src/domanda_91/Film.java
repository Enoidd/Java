package domanda_91;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: "Bello! - Brutto!"
 */

public class Film {

	private String recensione;

    public Film(String recensione) {
        this.recensione = recensione;
    }

    public void setRecensione(String recensione) {
        this.recensione = recensione;
    }

    public String getRecensione() {
        return this.recensione;
    }

    public static void main(String[] args) {
        IMDB imdb = new IMDB();
        Film film = new Film("Bello!"); // Rif ogg 'film' di tipo 'Film' con recensione "Bello!"
        
        System.out.print(film.getRecensione());	// Stampa: Bello!
        System.out.print(" - ");	// Stampa: -
        Film film2 = imdb.cambiaRecensione(film, "Brutto!"); // ritorna il film con recensione cambiata
        System.out.print(film.getRecensione()); // Stampa: Brutto!
    }
}