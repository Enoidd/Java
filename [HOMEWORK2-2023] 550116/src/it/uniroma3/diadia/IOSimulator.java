package it.uniroma3.diadia;

/* IOSimulator ci permette di testare intere partite. 
 * 
 * Come funziona? 
 * 
 * 	- Si crea una nuova partita che anziché avere IOConsole ha IOSimulator (ha già tutta una serie di righe in input)
 * 	- Si gioca tutta la partita, si legge il risultato per poter fare in qualche modo fare le dovute asserzioni */
public class IOSimulator implements IO {
	// Per leggere in automatico i comandi (automatizza ciò che deve fare)
	public String[] righeDaLeggere;
	public int indexRigheDaLeggere;
	
	// Per leggere tutti i messaggi che vengono stampati in automatico
	public String[] messaggiStampati;
	public int indexRigheStampate;
	
	// Costruttore
	public IOSimulator(String[] righeDaLeggere) {
		// Per leggere in automatico i comandi introdotti (dice ciò che deve fare)
		this.righeDaLeggere = righeDaLeggere;
		this.indexRigheDaLeggere = 0;
		
		// Per leggere i comandi mostrati a stampa
		this.messaggiStampati = new String[100];
		this.indexRigheStampate = 0;
	}
	
	/* L'idea è immagazzinare tutti i messaggi che si stampano a video */
	@Override
	public void mostraMessaggio(String messaggio) {
		// Ogni qual volta che un messaggio verrà stampato, quest'ultimo verrà immagazzinato
		// all'interno dell'array 'messaggiStampati'
		this.messaggiStampati[this.indexRigheStampate] = messaggio;
		this.indexRigheDaLeggere++;
	}

	/* L'idea è quella di "automatizzare" i comandi in input, per automatizzarli si sfrutta un array, ossia
	 * un array di String, quindi ogni elemento dell'array contiene una stringa che rappresenta un comando.
	 */
	@Override
	public String leggiRiga() {
		// TODO Auto-generated method stub
		String rigaLetta;	// sarebbe l'i-esimo elemento del nostro array
		rigaLetta = this.righeDaLeggere[this.indexRigheDaLeggere]; // dentro 'rigaLetta' mettici l'elemento i-esimo 'Stringa comando' contenuto nell'array
		this.indexRigheDaLeggere++;	// una volta letto passi alla riga comando successiva
		return rigaLetta;	// ritorna la riga comando che hai letto dall'array
	}

}
