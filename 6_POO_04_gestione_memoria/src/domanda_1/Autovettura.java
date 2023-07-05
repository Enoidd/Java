package domanda_1;

// OK

/*
 * Scrivere il codice della classe 'Autovettura' in modo che:
 * 
 * 	- Se al momento della creazione di un nuovo oggetto viene passato un modello come parametro
 * 	  allora questo viene assegnato alla variabile modello.
 * 	- Se non viene passato nessun modello allora la variabile modello rimarrà nulla.
 */

public class Autovettura {

	private String modello;
	// Costruttore in overloading:
	// Costruttore che non prende nessun parametro
	public Autovettura() {
		
	}
	// Costruttore che assegna il modello
	public Autovettura(String modello) {
		this.modello = modello;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public static void main(String[] args) {
		
		Autovettura auto = new Autovettura("Opel");
		System.out.println("Modello: "+auto.getModello());	// Stampa: Opel
		
		Autovettura auto1 = new Autovettura();
		System.out.println("Modello: "+auto1.getModello());	// Stampa: null
		

	}
	

}
