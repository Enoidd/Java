package mainStanze;

public class MainStanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Creazione di una nuova istanza chiamata 'spada' di tipo attrezzo */
		Attrezzo spada = new Attrezzo();
		spada.setNome("spada");
		spada.setPeso(7);
		
		/* Creazione di una nuova istanza chiamata 'osso' di tipo attrezzo */
		Attrezzo osso = new Attrezzo();
		osso.setNome("osso");
		osso.setPeso(1);
		
		/* Creazione di una nuova istanza chiamata 'n11' di tipo stanza */
		Stanza n11 = new Stanza();
		n11.setNomeStanza("N11");
		
		
		n11.setAttrezzoContenuto(spada);
		n11.setAttrezzoContenuto(osso);
		
		
		
		System.out.println("Nome stanza: " + n11.getNomeStanza());
		//System.out.println("Attrezzo contenuto: " + n11.getAttrezzoContenuto().getNome());
		//System.out.println("Peso: " + n11.getAttrezzoContenuto().getPeso());
		System.out.println(osso);	// vedi <<<--- Metodo toString in Attrezzo
		
		/* Stesso comportamento <<<<-- vedi sempre Metodo toString in Attrezzo */
		String descrizione = "Attrezz contenuto: " + osso;
		System.out.println(descrizione);
		
		/*****************************************************************************************************/
		/* Si vuole stampare il valore delle variabili che contengono i riferimenti:
		 * 
		 * 	- spada
		 * 	- osso
		 * 	- n11
		 * 
		 */
		//System.out.println();
		//System.out.println("/**********************/");
		//System.out.println(n11);	// Atteso: Stanza@3cb5cdba -> è il riferimento in memoria
		
		/* Anche se effettuo una ridefinizione stamperà ovviamente un altro riferimento in memoria */
		//n11 = new Stanza();
		
		//System.out.println(n11);	// Atteso: Stanza@56cbfb61 -> è il nuovo riferimento in memoria
		//System.out.println("/**********************/");
		//System.out.println();
		
		/*****************************************************************************************************/
		
		/* Più riferimento verso lo stesso oggetto */
		Stanza n10 = new Stanza();
		n10.setNomeStanza("N10");
		n10.setStanzaAdiacente(n11); // n10 è adiacente a n11 -> Ossia il quadrato di n10 punta al quadrato di n11
		
		Stanza n12 = new Stanza();
		n12.setNomeStanza("N12");
		n12.setStanzaAdiacente(n11);	// n12 è adiacente a n11 -> Ossia il quadrato di n12 punta al quadrato di n11
		
		System.out.println("Atteso->N10: " + n10.getNomeStanza() + " è adiacente a: " + n10.getStanzaAdiacente().getNomeStanza());
		
		/* Posso anche creare un alias per n12, che avrà lo stesso riferimento di n12, in pratica puoi immaginarlo
		 * come se il blocchetto n12 punta al blocco dell'oggetto creato di tipo Stanza, e n11Alias è un altro blocchetto
		 * chepunta allo stesso blocco dell'oggetto puntato da n12
		 */
		Stanza n12Alias = n12;
		n12Alias.setNomeStanza("alias N12");
		
		/* n12 e n12Alias fanno riferimento allo stesso oggetto */
		System.out.println(n12Alias.getNomeStanza());	// stampa alias N12
		System.out.println(n12.getNomeStanza());	// stampa alias N12
		/* Perché stampa alias N12? 
		 * Questo si chiama effetto collaterale, nel senso che avendo creato l'oggetto n12Alias che ha lo stesso riferimento
		 * del blocchetto n12 ossia il blocco grande della stanza chiamata N12, quindi modificando il nome dell'oggetto sfruttando
		 * una delle due variabili che contengono il riferimento ovviamente la restante variabile non utilizzata per la modifica
		 * punterà sempre al medesimo oggetto con il nome modificato.
		 */
		
		
		/* riferimento a NULL */
		Stanza n13 = new Stanza();
		n13.setNomeStanza("aula N13");
		n13.setStanzaAdiacente(null);	// significa che non possiede stanze adiacenti
		//System.out.println(n13.getStanzaAdiacente().getNomeStanza());	// segnala l'errore NULLPOINTEREXCEPTION
		
	}

}
