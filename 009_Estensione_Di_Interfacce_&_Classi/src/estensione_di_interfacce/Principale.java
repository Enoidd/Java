package estensione_di_interfacce;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new ClasseCheImplementa_A();
		
		B b = new ClasseCheImplementa_B();
		
		/* Se non mettessi l'extends all'interface 'B', fare questo assegnamento sotto
		 * porterebbe alla generazione di un errore a tempo statico. Questo perché se non metto 
		 * l'extends il compilatore considera le due interfacce completamente indipendenti
		 * l'una dall'altra. 
		 */
		
		a = b;	// Mentre in questo caso non da errore perché 'B' è sottotipo di 'A'
		
		/* 
		 * Ovviamente sia prima dell'assegnazione che dopo attraverso 'b' interface 'B' è possibile
		 * utilizzare anche i metodi 'A'
		 */
		b.a1(0);
		b.a2();
		b.b1();
		
		
	}


}
