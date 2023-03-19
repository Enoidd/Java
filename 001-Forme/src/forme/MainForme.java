package forme;

public class MainForme {
	
	/* ' main ' è un metodo */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Creazione di una nuova istanza chiamata ' origine ' di tipo ' Punto ' */
		/* Avendo creato un costruttore per la classe Punto, deve essere modificata la sintassi per la creazione
		 * del nuovo oggetto 
		 */
		Punto origine = new Punto(0, 0);
		
		
		/* Creazione di una nuova istanza chiamata ' unoZero ' di tipo ' Punto ' */
		Punto unoZero = new Punto(2, 2);
		
		
		/* Richiamo dei metodi sull'istanza ' origine ' per definire le coordinate x, y */
		origine.setX(0);
		origine.setY(0);
		
		unoZero.setX(2);
		unoZero.setY(2);
		
		/* Stampa le coordinate dell'istanza ' origine ' */
		System.out.println("Coordinate istanza 'origine':");
		/* Funzione di stampa dei valori inseriti mediante il metodo ' getX/Y ' che restituisce il valore delle coordinate x, y */
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		System.out.println("---");
		
		/* Invocazione metodo ' trasla ' che modifica le coordinate x, y */
		origine.trasla(1, 1);
		
		System.out.println("coordinate traslate di 1:");
		/* Stampa la coordinata x traslata di 1 */
		System.out.println(origine.getX());
		/* Stampa la coordinata y traslata di 1 */
		System.out.println(origine.getY());
		System.out.println("---");
		
		
		/* Stampa delle coordinate dell'istanza ' unoZero ' */
		System.out.println("Coordinate istanza 'unoZero':");
		System.out.println(unoZero.getX());
		System.out.println(unoZero.getY());
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		
		/* Si può vedere dal risultato di stampa che le istanze 'origine' e 'unoZero' sono del tutto indipendenti tra loro,
		 * infatti avranno valori del tutto diversi tra di loro, ciò significa che anche utilizzando lo stesso metodo per due istanze
		 * diverse si hanno risultati diversi.
		 */
		
		
		/* Creazione di una nuova istanza chiamata ' r ' di tipo Rettangolo */
		
		/* Avendo aggiunto alla classe 'Rettangolo' un costruttore deve essere modificata la sintassi della creazione
		 * della nuova istanza oggetto
		 */
		Rettangolo r = new Rettangolo(unoZero, 0, 0);
		
		/* Dopo questa istruzione l'oggetto istanza ' Rettangolo ' conosce l'oggetto istanza ' Punto ' */
		r.setVertice(origine);	// Posso metterci anche 'unoZero' non cambierebbe nulla
		
		/* Richiamo dei metodi sull'istanza ' r ' per definire la base */
		r.setBase(8);
		r.setAltezza(3);
		
		/* Funzioni di stampa - In questo caso la funzione di stampa risulta concatenata con il '+' */
		System.out.println("Base dell'oggetto istanza 'r' di tipo 'Rettangolo' con valore: " + r.getBase() + " e Altezza: " + r.getAltezza());
		System.out.println("Vertice del rettangolo (x,y): " + r.getVertice().getX() + "," + r.getVertice().getY());
		
		/* Richiamo dei metodi sull'istanza ' r ' di tipo Rettangolo per spostare sull'asse delle X il rettangolo */
		r.sposta(+2, +3);
		System.out.println("Vertice del rettangolo spostato (+2, +3) (x,y): " + r.getVertice().getX() + "," + r.getVertice().getY());

		System.out.println("");
		System.out.println("");
		System.out.println("=== MOLTEPLICI RIFERIMENTI PER LO STESSO OGGETTO ===");
		System.out.println("");

		Punto unitario = new Punto(1, 1);
		Punto copia = unitario;	// copia contiene il riferimento contenuto da unitario con valori x=1 e y=1
		
		System.out.println(copia.getX());	// stampa x=1
		System.out.println(copia.getY());	// stampa y=1
		
		copia.setX(2); 	// modifica la x=2
		System.out.println(unitario.getX());	// stampa x=2
		
		System.out.println("");
		System.out.println("");
		System.out.println("=== SIDE-EFFECT E METODI ===");
		System.out.println("");
		
		
		ModificatoreDiPunti m = new ModificatoreDiPunti();
		Punto punto_qualsiasi = new Punto(1,1);
		m.azzera(punto_qualsiasi);
		System.out.println(punto_qualsiasi.getX());	// Stampa 0
		System.out.println(punto_qualsiasi.getY());	// Stampa 0
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("=== EQUIVALENZA TRA OGGETTI vs IDENTICITA' DEI RIFERIMENTI ===");
		System.out.println("");
		
		Punto punto1 = new Punto(0, 0);
		Punto punto2 = new Punto(0, 0);
		
		if(punto1 == punto2)
			System.out.println("uguali");
		else
			System.out.println("diversi");	// stampa diversi
		
		/* Se entrambi hanno lo stesso riferimento */
		punto1 = punto2;
		
		if(punto1 == punto2)
			System.out.println("uguali");	// stampa uguali
		else
			System.out.println("diversi");
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("=== EQUIVALENZA FRA STRINGHE ===");
		System.out.println("");
		
		String nome1 = new String("Alice");
		String nome2 = new String("Alice");
		
		System.out.println(nome1.equals(nome2));	// Stampa 1 (TRUE)
		
		System.out.println(punto1.equals(punto2));
		
		
		/* Esempi per costruttori sovraccarichi */
		
		// base 0, altezza 0, vertice in (0, 0)
		Rettangolo r1 = new Rettangolo();
		
		// base 3, altezza 5, vertice in (0, 0)
		Rettangolo r2 = new Rettangolo(3, 5);
		
		Punto ver = new Punto(4, 9);
		Rettangolo r3 = new Rettangolo(ver, 3, 5);
	}

}
