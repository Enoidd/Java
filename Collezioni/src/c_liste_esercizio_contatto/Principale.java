package c_liste_esercizio_contatto;

public class Principale {

	public static void main(String[] args) {
		
		Rubrica contacts = new Rubrica();
		
		contacts.aggiungiContatto("Giammaria", "Scardella", "334");
		contacts.aggiungiContatto("Gianmarco", "Scarella", "345");
		contacts.aggiungiContatto("Luigi", "Scarse", "357");
		
		contacts.toString();
		
		contacts.rimuoviContatto("Giammaria");
		
		System.out.println("\nRubrica: ");
		
		contacts.toString();
		
		System.out.println(""+contacts.cerca("Gianmarco", "Scarella"));
	}

}
