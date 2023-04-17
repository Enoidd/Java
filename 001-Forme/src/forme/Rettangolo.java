package forme;

public class Rettangolo implements Forma {
	
	/* Variabili di istanza */
	private int base;
	private int altezza;
	private Punto vertice;	// Posizione del vertice in alto a sx (di coordinate x, y)
	
	/* COSTRUTTORI SOVRACCARICHI */
	
	/* Costruttore generico */
	public Rettangolo(Punto vertice, int base, int altezza) {
		//this.vertice = vertice;
		this.vertice = new Punto(vertice.getX(), vertice.getY());
		this.base = base;
		this.altezza = altezza;
	}
	
	/* Costruttore che ha come parametri base e altezza */
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		this.vertice = new Punto(0, 0);
	}
	
	/* Costruttore no-args */
	public Rettangolo() {
		this.base = 0;
		this.altezza = 0;
		this.vertice = new Punto(0, 0);
	}
	
	/* Metodi */
	public void setBase(int b) {
		base = b;
	}
	
	public void setAltezza(int h) {
		altezza = h;
	}
	
	public void setVertice(Punto v) {
		vertice = v;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public Punto getVertice() {
		return vertice;
	}
	
	/* Metodo 'sposta' della classe 'Rettangolo' */
	public void trasla(int deltaX, int deltaY) {
		vertice.trasla(deltaX, deltaY);
		
		/* Nel caso in cui la classe 'Punto' non disponesse di un metodo 'trasla' */
		/*int xVertice = verticeSx.getX();
		int yVertice = verticeSx.getY();
		verticeSx.setX(xVertice + deltaX);
		verticeSx.setY(yVertice + deltaY);*/
	}
	
	/* Metodi sovraccarichi */
	public void scala(float fattore) {
		this.scala(fattore, fattore);
	}
	public void scala(float fattoreBase, float fattoreAltezza) {
		this.base *= fattoreBase;
		this.altezza *= fattoreAltezza;
	}

}
