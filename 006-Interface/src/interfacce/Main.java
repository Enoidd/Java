package interfacce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musicista ludovico = new Musicista("ludovico");
		
		Tamburo tamburo = new Tamburo();
		Tromba tromba = new Tromba();
		
		/* Prova della interfaccia 'Strumento' 
		 * Si denota che l'oggetto istanziato: Tamburo, Musicista, Tromba hanno accesso
		 * al metodo 'produciSuono' contenuto in 'Strumento' */
		tromba.produciSuono();	// pe-pe-re-pe-pe
		
		tamburo.produciSuono();	// bum-bum-bum
		
		Chitarra c = new Chitarra();
		Strumento t = new Tamburo();	// 'Tamburo' è sotto tipo di 'Strumento' che è supertipo di 'Tamburo'
		ludovico.suona(c);	// Ludovico suona il parametro passato che è la 'Chitarra' - dlen-dlen-dlen
		ludovico.suona(t); 	// Ludovico suona il parametro passato che è la 'Tamburo' - bum-bum-bum
		
		/*************************/
		
		/* Principio di sostituzione: 
		 * Un riferimento ad un sottotipo può essere assegnato ad un riferimento ad un suo supertipo.
		 */
		Strumento strumento;
		Chitarra chitarra;
		
		chitarra = new Chitarra();
		
		// upcasting: promozione da un tipo a supertipo
		// downcasting: promozione di un supertipo a sottotipo
		strumento = chitarra;	// supertipo: 'strumento' - sottotipo: 'chitarra'
		/* In sostanza è l'equivalente di:
		 * Strumento nome_strumento = new Chitarra();
		 */
		ludovico.suona(strumento);
		ludovico.suona(chitarra);
		
		/**************************/
		
		/* TIPO STATICO & TIPO DINAMICO */
		Strumento strumento1 = new Chitarra();
		
		/* 
		 * Quale è il tipo della variabile 'strumento1' ?
		 * 
		 * - Il tipo 'statico' della variabile 'strumento1' è 'Strumento': determinato a tempo di compilazione
		 */
		strumento1.produciSuono();	// CORRETTO
		//strumento1.accorda(2, 1);	// ERRATO: il tipo strumento non possiede il metodo accorda(int, int)
		
		/*
		 * Quale è il tipo dinamico di 'strumento1' ?
		 * 
		 * - Il tipo 'dinamico' della variabile 'strumento1' è 'Chitarraì': stabilisce quale sarà
		 * 	 l'implementazione usata. A tempo di esecuzione il codice del metodo produciSuono() che viene usato
		 *   è quello definito nella classe 'Chitarra'.
		 *   
		 *   
		 * TIPO STATICO: Assegnato dal compilatore, determina l'insieme dei metodi che possono
		 * 				 essere invocati.
		 * 
		 * TIPO DINAMICO: Interviene a tempo di esecuzione e determina l'implementazione che viene eseguita.
		 * 
		 * NB. IL TIPO DICHIARATO DI UNA VARIABILE E' IL SUO TIPO STATICO. 
		 *     IL TIPO DELL'OGGETTO A CUI UNA VARIABILE SI RIFERISCE E' IL SUO TIPO DINAMICO.
		 *     (A TEMPO DI ESECUZIONE VIENE ESEGUITO IL METODO DEL TIPO DINAMICO)
		 *     
		 *     es. 'accorda()' non è tra i metodi di 'Strumento' (tipo statico della variabile locale 'strumento1').
		 */
		
			/* slide 34 */
		
	}

}
