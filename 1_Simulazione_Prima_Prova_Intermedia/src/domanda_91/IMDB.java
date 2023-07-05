package domanda_91;

public class IMDB {
	
	public Film cambiaRecensione(Film film, String nuovaRecensione) {
        Film f = film;
    	film.setRecensione(nuovaRecensione);
        return f;
    }
}
