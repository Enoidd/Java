package domanda_3;

public class Principale {

	public static void main(String[] args) {
		
		SequenzaDiStringhe sequenza = new SequenzaDiStringhe(3);
		
		sequenza.sequenza[0] = "Giammaria";
		sequenza.sequenza[1] = "Gina";
		sequenza.sequenza[2] = "Giordana";
		
		System.out.println(" "+sequenza.aggiungiInCoda("Sofia")); // FALSE
		
		SequenzaDiStringhe s = new SequenzaDiStringhe(3);
		
		s.aggiungiStringhe("Sofia", 0);
		s.aggiungiStringhe("Tondi", 1);
		System.out.println(" " + s.aggiungiInCoda("Amore")); // TRUE
	}

}
