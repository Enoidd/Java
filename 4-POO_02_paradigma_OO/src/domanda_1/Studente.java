package domanda_1;

/*
 * Scrivete i metodi 'getter' e 'setter' della classe Studente.
 */

public class Studente {
	
	private String cognome;
    private int matricola;
    
    public Studente(String cognome, int matricola) {
    	this.cognome = cognome;
    	this.matricola = matricola;
    }
    
    public void setCognome(String cognome) {
    	this.cognome = cognome;
    }
    
    public String getCognome() {
    	return this.cognome;
    }
    
    public void setMatricola(int matricola) {
    	this.matricola = matricola;
    }
    
    public int getMatricola() {
    	return this.matricola;
    }
}
