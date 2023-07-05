package a_Esercizio_Classe_Astratta;

public class Romanzo extends Libro{

	private String genere; // genere del romanzo
	
	public Romanzo(String titolo, String autore, String genere) {
		super(titolo, autore);
		this.genere = genere;
	}
	

	@Override
	public double calcolaPrezzo() {
		return 10.99;
	}

}
