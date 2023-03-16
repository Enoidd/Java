package forme;

/* La classe punto rappresenta la "fabbrica" che permette di "costruire" oggetti.
 * Nella classe gli oggetti vengono definiti. La classe defiisce:
 * 		
 * 		- lo stato di un oggetto
 * 		- il comportamento degli oggetti di un certo tipo (metodo)
 */

public class Punto {
	/* Variabili di istanza */
	private int x;
	private int y;
	
	/* Costruttore:
	 * 
	 * 	- Ogni classe ha sempre un costruttore ogni volta che un oggetto della classe viene creato
	 * 	- Il costruttore definisce lo stato iniziale dell'oggetto: in che modo?
	 * 	- Riceve come parametri formali i valori con cui inizializzare le variabili di istanza
	 * 	- Non ha un tipo ma soltanto il modificatore di visibilità
	 * 	- Ha lo stesso nome della classe
	 * 	
	 * Quando il costruttore non viene creato nella classe, ne viene assegnato uno di default:
	 * ad es, quando si crea un oggetto (la cui classe è priva del costruttore) la macchina virtuale definisce
	 * un costruttore di default, quel costruttore è'Punto()' ad es nell'atto della creazine dell'oggetto.
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	/* Metodi */
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int posY) {
		y = posY;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return y;
	}
	
	/* Esercizio:
	 * Aggiungere il metodo ' public void trasla(int dx, int dy) ' che sposta il punto dx sull'asse x e dy sull'asse y
	 */
	public void trasla(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
}
