package d_esercizio_comparator_libro;

public class Libro implements Comparable<Libro> {
	
	private String titolo;
	private int pagine;
	
	public Libro(String titolo, int pagine) {
		this.titolo = titolo;
		this.pagine = pagine;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public int getPagine() {
		return this.pagine;
	}
	
	@Override
	public int compareTo(Libro libro) {
		return this.getTitolo().compareTo(libro.getTitolo());
	}
	
	@Override
	public String toString() {
		return ""+this.titolo+", "+this.pagine;
	}
}

