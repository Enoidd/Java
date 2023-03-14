package forme;

public class MainForme {
	
	/* ' main ' è un metodo */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ciao
		/* Creazione di una nuova istanza chiamata ' origine ' di tipo ' Punto ' */
		Punto origine = new Punto();
		/* Creazione di una nuova istanza chiamata ' unoZero ' di tipo ' Punto ' */
		Punto unoZero = new Punto();
		
		
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
		Rettangolo r = new Rettangolo();
		
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
		
	}

}
