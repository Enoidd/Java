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
