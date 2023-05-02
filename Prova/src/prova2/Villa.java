package prova2;

public class Villa implements Edificio{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Edificio e = new Edificio();
		Edificio e = new Villa();
		Villa v = new Villa();
		Edificio e1 = new Villa();
		
		e = v;
		
//		v = e;
		v = (Villa) e1;	// Necessario Downcasting
		
		e1.numeroPiani();
		
		// Non esiste la classe Palazzo
//		e = new Palazzo();
		
		// v = e;
		v = (Villa) e;	// Necessario Downcasting
	}

	@Override
	public void numeroPiani() {
		// TODO Auto-generated method stub
		
	}

}
