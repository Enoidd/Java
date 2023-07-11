package domanda_1;

public class Quiz {

	public void scrivi(Animale r) {
		System.out.println("Animale ");
	}
	
	public void scrivi(Cane l) {
		System.out.println("Cane ");
	}
	
	public void scrivi(Gatto s) {
		System.out.println("Gatto ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz m = new Quiz();
		
		Cane c = new Cane();
		Gatto g = new Gatto();
		Animale a = new Cane();
		
		a = g; // Dinamica 'a' da Cane a Gatto
		
		m.scrivi(a); // Statico 'a' Animale -> OP: Animale
		m.scrivi(g); // Statico 'g' Gatto -> OP: Gatto
		m.scrivi(c); // Statico 'c' Cane -> OP: Cane
	}

}
