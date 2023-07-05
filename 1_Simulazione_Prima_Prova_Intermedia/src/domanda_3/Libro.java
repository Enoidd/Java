package domanda_3;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: "I Pirati della Malesia", "I Pirati della Malesia", "La Regina dei Caraibi"
 */

public class Libro {

	private String titolo;

	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public static void main(String[] argc) {
		Libro[] scaffale = new Libro[3];	// Creo uno scaffale
		Libro l1;	// Dichiaro un libro

		scaffale[0] = new Libro("I Pirati della Malesia");	// Creo una posizione nell'array in pos 0
		l1 = scaffale[0];	// l1 titolo "I Pirati della Malesia"
		scaffale[1] = l1;	// la seconda cella dello scaffale si chiama i "I Pirati della Malesia"
		l1 = new Libro("Le Due Tigri");	// l1 titolo "Le Due Tigri"
		scaffale[2] = l1;	// la terza cella dello scaffale si chiama "Le Due Tigri"
		l1.setTitolo("Il Corsaro Nero");	// cambio il titolo di l1 e quindi di scaffale[2] ora-> "Il Corsaro Nero"
		scaffale[2].setTitolo("La Regina dei Caraibi");	// cambio ancora il titolo ora-> "La Regina dei Caraibi"
		for (Libro libro : scaffale)
			System.out.print(libro.getTitolo() + "; ");
	}
}
