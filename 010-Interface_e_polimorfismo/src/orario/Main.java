package orario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orario[] orario = new Orario[5];
		
		orario[0] = new Orario(12, 30);
		orario[1] = new Orario(21, 40);
		orario[2] = new Orario(9, 20);
		orario[3] = new Orario(4, 00);
		orario[4] = new Orario(1, 35);
		
		/* Prova di stampa */
		System.out.println("\nNon ordinato:");
		System.out.println("Ore: "+ orario[0].getOre() + ", minuti: " + orario[0].getMinuti());
		System.out.println("Ore: "+ orario[1].getOre() + ", minuti: " + orario[1].getMinuti());
		System.out.println("Ore: "+ orario[2].getOre() + ", minuti: " + orario[2].getMinuti());
		System.out.println("Ore: "+ orario[3].getOre() + ", minuti: " + orario[3].getMinuti());
		System.out.println("Ore: "+ orario[1].getOre() + ", minuti: " + orario[4].getMinuti());
	
		ordinatoreOrari o = new ordinatoreOrari();
		
		/* ordinatoreOrari prende come parametro un riferimento alla interface 'Comparabile', il caso vuole
		 * la classe oggetto 'Orario', implementa l'interface 'Comparabile', infatti quando una classe implementa
		 * l'interface richiesta come in questo caso viene comunque accettata.
		 */
		o.ordina(orario);	// Orario è di tipo 'Orario' che implementa l'interface 'Comparabaile', ma il metodo 'ordina' riceve un riferimento all'interface 'Comparabile'
		
		/* Prova di stampa */
		System.out.println("\nOrdinato:");
		System.out.println("Ore: "+ orario[0].getOre() + ", minuti: " + orario[0].getMinuti());
		System.out.println("Ore: "+ orario[1].getOre() + ", minuti: " + orario[1].getMinuti());
		System.out.println("Ore: "+ orario[2].getOre() + ", minuti: " + orario[2].getMinuti());
		System.out.println("Ore: "+ orario[3].getOre() + ", minuti: " + orario[3].getMinuti());
		System.out.println("Ore: "+ orario[1].getOre() + ", minuti: " + orario[4].getMinuti());
	}

}
