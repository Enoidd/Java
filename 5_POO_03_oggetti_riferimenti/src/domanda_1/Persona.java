package domanda_1;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: Bonnie - Clyde
 */

public class Persona {

	private String nome;

	public Persona(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static void main(String[] args) {
        Anagrafe anagrafe = new Anagrafe();
        Persona p = new Persona("Bonnie");	// 'p' Bonnie
        
        System.out.print(p.getNome());	// Stampa: "Bonnie"
        System.out.print("-"); // Stampa: -
        anagrafe.cambiaNome(p, "Clyde"); // Cambia il nome di 'p' in "Clyde" -> perché in cambiaNome
        // ritorna direttamente la Persona passata. Occhio perché se ritorna un altro rif a tipo Persona
        // e questo non viene incluso in un altro rif qui nel main diverso o uguale a 'p' stampa ancora 
        // Bonnie e non Clyde.
        System.out.print(p.getNome());	// Stampa "Clyde"
    }
}
