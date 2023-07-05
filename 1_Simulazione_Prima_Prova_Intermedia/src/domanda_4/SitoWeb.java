package domanda_4;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: 
 */

public class SitoWeb {
	// Variabili di istanza
	private Pagina pagina;
    private String indirizzo;
    // Costruttore vuole l'indirizzo del sito web
    public SitoWeb(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    public void setPagina(String titolo) {
        Pagina p = new Pagina(titolo);
        this.pagina = p;
    }
    
    public String getIndirizzo() { return this.indirizzo; }

    public Pagina getPagina() { return this.pagina; }

    public String toString() {
        return this.indirizzo;
    }

    public static void main(String[] args) {
        SitoWeb sito = new SitoWeb("www.sito.it");	// Creo un sito web con indirizzo: www.sito.it

        System.out.println(sito.getPagina().toString()); // Non c'è nessuna pagina: NULLPOINTEREXCEPTION

    }
}

