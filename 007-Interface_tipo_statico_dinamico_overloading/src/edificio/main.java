package edificio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palazzo p = new Palazzo(4);
		Edificio e = new Palazzo(3);
		Coloratore c = new Coloratore();
		
		/* L'overloading dei metodi viene risolto dal compilatore, quindi staticamente. Infatti
		 * se abbiamo un metodo sovraccarico il compilatore guarda il tipo statico per decidere quale è
		 * il metodo da invocare.
		 */
		
		c.colora(p);	// tipo statico di 'p' è 'Palazzo' --> Invoca (in Coloratore) colora(Palazzo p)
		c.colora(e);	// tipo statico di 'e' è 'Edificio'--> Invoca (in Coloratore) colora(Edificio e)
	}

}
