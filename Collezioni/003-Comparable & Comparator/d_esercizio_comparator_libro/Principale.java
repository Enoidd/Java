package d_esercizio_comparator_libro;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca biblioteca = new Biblioteca();
		
		Libro l1 = new Libro("I misteri", 200);
		Libro l2 = new Libro("La vita", 300);
		Libro l3 = new Libro("Essere", 1000);
		
		biblioteca.aggiungiLibro(l1);
		biblioteca.aggiungiLibro(l2);
		biblioteca.aggiungiLibro(l3);

		biblioteca.toString();
		
		biblioteca.elencoOrdinatoPerPagine();
		
		biblioteca.toString();
		
	}

}