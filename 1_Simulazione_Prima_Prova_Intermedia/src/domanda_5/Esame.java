package domanda_5;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: POO-POO
 */

public class Esame {

	private String nome;

	public Esame(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static void main(String[] args) {
    	
        Segreteria segreteria = new Segreteria();	// Creo un rif ad ogg 'Segreteria'
        Esame poo = new Esame("POO");	// Creo un rif ad ogg 'poo' di tipo 'Esame' con nome 'POO'
        
        System.out.print(poo.getNome());	// Stampa: POO
        System.out.print("-");	// Stampa: -
        segreteria.cambiaNome(poo, "ASD");	// Cambio il nome di poo in ASD ma non lo metto dentro
        // nessuna parte  (perché cambiaNome ritorna un Esame). Quindi poo rimane poo.
        System.out.print(poo.getNome());	// Stampa: POO	
    }
}

