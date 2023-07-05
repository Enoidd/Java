package b_costanti_enumerative;

public class Principale {

	public static void main(String[] args) {
		
		GiornoSettimana lunedi = GiornoSettimana.LUNEDI;
		GiornoSettimana martedi = GiornoSettimana.MARTEDI;
		
		// Utilizzo dei campi personalizzati
		System.out.println(lunedi.getNomeItaliano()); // Lunedì
		System.out.println(martedi.getNumeroOrdine()); // 2
		
		// Utilizzo del metodo switch con l'enumerazione
		GiornoSettimana giorno = GiornoSettimana.MERCOLEDI;
		
		switch (giorno) {
	      case LUNEDI:
	        System.out.println("Oggi è lunedì.");
	        break;
	      case MARTEDI:
	        System.out.println("Oggi è martedì.");
	        break;
	      case MERCOLEDI:
	        System.out.println("Oggi è mercoledì.");
	        break;
	      case GIOVEDI:
	        System.out.println("Oggi è giovedì.");
	        break;
	      case VENERDI:
	        System.out.println("Oggi è venerdì.");
	        break;
	      case SABATO:
	        System.out.println("Oggi è sabato.");
	        break;
	      case DOMENICA:
	        System.out.println("Oggi è domenica.");
	        break;
	    }

	}

}
