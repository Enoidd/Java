package b_ArrayList_esercizio_Borsa;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		
		ArrayList<Attrezzo> list = new ArrayList<>();
		
		Borsa myBorsa = new Borsa();
		
		myBorsa.aggiungiAttrezzo(new Attrezzo("Sciabola", 1));
		myBorsa.aggiungiAttrezzo(new Attrezzo("Spada", 2));
		
		System.out.println("\n=====CONTENUTO BORSA:");
		myBorsa.toString();
		
		System.out.println("\n=====DIMENSIONE BORSA:");
		System.out.println(""+myBorsa.dimensioneBorsa(myBorsa));
		
		/* NEGLI ARRAY LIST POSSO AGGIUNGERE UN ELEMENTO AD UN CERTO INDICE */
		// nome_ArrayList.add(indice, "stringa");
		/* 	SE SUPERO LA DIMENSIONE DEVO PRIMA DARE UNA CAPACITA' INIZIALE */
		// ArrayList<Attrezzo> list = new ArrayList<>(Arrays.asList(new String[10]);
	}
}
