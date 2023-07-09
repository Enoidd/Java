package domanda_2;

/*
 * Cosa stampa questo programma?
 * OUTPUT: I Pirati della Malesia, I Pirati della Malesia, La regina dei Caraibi
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
	
	public static void main(String[] args) {
		
		Libro[] scaffale = new Libro[3];
		Libro l1;
		
		scaffale[0] = new Libro("I Pirati della Malesia");
		l1 = scaffale[0];
		scaffale[1] = l1;	// scaffale[1] -> I Pirati della Malesia
		l1 = new Libro("Le Due Tigri");	// l1 -> Le Due Tigri
		scaffale[2] = l1;	// scaffale[2] -> Le Due Tigri
		l1.setTitolo("Il Corsaro Nero");	// l1 -> da Le Due Tigri A Il Corsaro nero
		scaffale[2].setTitolo("La Regine dei Caraibi");	// scaffale[2] -> La Regina dei Caraibi
			for(Libro libro: scaffale)
				System.out.println(libro.getTitolo()+"; ");
			
		/*
		 * Quando scrive:
		 * l1 = new Libro("Le Due Tigri");
		 * 
		 * istanzia il riferimento l1 di tipo Libro ad un nuovo riferimento e quindi è come se
		 * lo rinizializzasse.
		 */
	}

}
