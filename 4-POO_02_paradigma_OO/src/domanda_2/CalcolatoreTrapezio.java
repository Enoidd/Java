package domanda_2;

// OK

/*
 * Scrivere il metodo CalcolaArea che calcola l'area di un trapezione,
 * partendo dai dati passati come input. Nel caso in cui la base minore sia più grande
 * della base maggiore, il metodo deve ritornare -1.
 */

public class CalcolatoreTrapezio {

	public double calcolaArea(double baseMinore, double baseMaggiore, double altezza) {
		
		// Se la baseMinore è maggiore della baseMaggiore
		if(baseMinore > baseMaggiore)
			return -1;
		return (baseMaggiore*baseMinore)*(altezza/2);
	}
	
	public static void main(String[] args) {
		
		CalcolatoreTrapezio clt = new CalcolatoreTrapezio();
		
		System.out.println("====Calcolatore Area trapezio con Base minore < di Base Maggiore");
		System.out.println(clt.calcolaArea(2, 3, 4));	// Atteso: il calcolo
		System.out.println("\n====Calcolatore Area trapezio con Base minore > di Base Maggiore");
		System.out.println(clt.calcolaArea(5, 3, 4));	// Atteso: -1
	}
}
