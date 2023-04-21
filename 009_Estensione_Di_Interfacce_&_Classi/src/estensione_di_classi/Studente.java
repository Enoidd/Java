package estensione_di_classi;

/*
 * Si può pensare che uno 'Studente' sia innanzitutto una persona, perché anche lui ha un nome,
 * un cognome, un età, ma che a differenza di persona, possiede una matricola.
 *
 *
 * La classe 'Studente' è la 'Classe estesa' della 'Classe base' 'Persona' di cui la 'Classe base'
 * è supertipo della 'Classe estesa' 'Studente'. 
 */
public class Studente extends Persona {
	// Variabili di istanza
	private String matricola;	// La classe 'Studente' rispetto a persona possiede una nuova variabile di istanza 
	
	/* Il costruttore di una classe estesa deve inizializzare, direttamente le proprie variabili
	 * di istanza. E indirettamente quelle eredtate dalla classe base.
	 * 
	 * Per principio la classe estesa non può avere la responsabilità di inizializzare direttamente
	 * le variabili di istanza della classe base.
	 * 
	 * Il costruttore delle classe estesa deve poter delegare l'inizializzazione delle variabili di istanza
	 * della classe base ad un costruttore della stessa. 
	 */
	public Studente(String nome, String matricola) {
		super(nome);	// Richiama il costruttore di "persona" che prende una stringa. 
						// Si può fare solo una volta e deve essere sempre nella 1° riga del costruttore
		this.matricola = matricola;
	}
	
	// Matricola
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	/*
	 * 'Studente' sa che esiste 'Persona' ma 'Persona' non sa che esiste 'Studente'
	 * perché 'Studente' ha ereditato le variabili e i metodi di 'Persona'.
	 */
	
	/* 
	 * Alcune implementazioni dei metodi offerti nella classe base possono essere non adatte alla
	 * 'Classe estesa'. Ad esempio il metodo toString(), la stampa dovrebbe permettere di distinguere
	 * le istanze della classe base da quelle della classe estesa, nella stringa restituita per gli
	 * studenti voglia che compaia anche la matricola (che non ha senso per tutte le persone), questo
	 * comportamento si ottiene facendo l'overriding del metodo. 
	 * 
	 * Si utilizza l' @Override perché se il metodo non viene ridefinito, si eredita l'implementazione
	 * della Superclasse, in questo caso si utilizza l'implementazione della classe estesa. 
	 */
	
	@Override
	public String toString() {
		return this.getNome() + " " + this.getMatricola(); 
	}
	
}
