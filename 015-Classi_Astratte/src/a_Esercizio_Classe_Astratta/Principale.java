package a_Esercizio_Classe_Astratta;

public class Principale {

	public static void main(String[] args) {
		
		Libro libro_romanzo = new Romanzo("Le Aquile", "Rolling", "Romanzo");
		libro_romanzo.stampaDettagli();
		System.out.println("Prezzo: "+libro_romanzo.calcolaPrezzo());
		
		Libro libro_fantascienza = new LibroFantascienza("Alieni", "Klaus", 2022);
		libro_fantascienza.stampaDettagli();
		System.out.println("Prezzo: "+libro_fantascienza.calcolaPrezzo());
	}

}
