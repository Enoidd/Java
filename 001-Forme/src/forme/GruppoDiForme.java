package forme;

public class GruppoDiForme implements Forma{

	private static final int MAX_NUMERO_DI_FORME_GRUPPO = 10;
	/* il Gruppo ospita un array */
	private Forma[] componenti; // Forma[i] è null se non presente
	
	// Costruttore
	public GruppoDiForme() {
		this.componenti = new Forma[MAX_NUMERO_DI_FORME_GRUPPO];
	}
	
	public void trasla(int deltaX, int deltaY) {
		/* devo traslare tutte le componenti */
		for(int i=0; i<componenti.length; i++) {
			if(this.componenti[i]!=null) {
				this.componenti[i].trasla(deltaX, deltaY);
			}
		}
	}
	
	public boolean aggiungiForma(Forma nuovaArrivata) {
		for(int i = 0; i<componenti.length; i++) {
			if(this.componenti[i]==null) {	// se l'elemento è null aggiungilo
				this.componenti[i] = nuovaArrivata;
				return true;	// aggiunta andata a buon fine
			}
		}
		return false;	// aggiunta fallita
	}
	
	public Object getNumeroDiForme() {
		int counter = 0;
		for(int i=0; i<componenti.length; i++){
			if(this.componenti[i]!=null) {	// c'è una forma corrente
				counter++;	// contala
			}
		}
		return counter;
	}
}
