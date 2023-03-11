package forme;

public class Rettangolo {
	
	/* Variabili di istanza */
	private int base;
	private int altezza;
	private Punto verticeSx;	// Posizione del vertice in alto a sx (di coordinate x, y)
	
	/* Metodi */
	public void setBase(int b) {
		base = b;
	}
	
	public void setAltezza(int h) {
		altezza = h;
	}
	
	public void setVertice(Punto v) {
		verticeSx = v;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public Punto getVertice() {
		return verticeSx;
	}
	
	/* Metodo 'sposta' della classe 'Rettangolo' */
	public void sposta(int deltaX, int deltaY) {
		verticeSx.trasla(deltaX, deltaY);
		
		/* Nel caso in cui la classe 'Punto' non disponesse di un metodo 'trasla' */
		/*int xVertice = verticeSx.getX();
		int yVertice = verticeSx.getY();
		verticeSx.setX(xVertice + deltaX);
		verticeSx.setY(yVertice + deltaY);*/
	}
}
