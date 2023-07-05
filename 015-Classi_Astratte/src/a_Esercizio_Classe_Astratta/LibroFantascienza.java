package a_Esercizio_Classe_Astratta;

public class LibroFantascienza extends Libro{

	private int annoPubblicazione;
	
	public LibroFantascienza(String titolo, String autore, int annoPubblicazione) {
		super(titolo, autore);
		this.annoPubblicazione = annoPubblicazione;
	}

	@Override
	public double calcolaPrezzo() {
		return 22.00;
	}

}
