package a_esercizio1;

import java.util.List;
import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List< Libro > scaffale = new ArrayList< Libro >();	// Creo una collezione 'scaffale'
		Libro l1;	// Dichiaro una variabile riferimento all'oggetto 'libro'

		scaffale.add(new Libro("I Pirati della Malesia"));	// Aggiungo a 'scaffale' il libro
		l1 = scaffale.get(0);	// 
		scaffale.add(l1);
		l1 = new Libro("Le Due Tigri");
		scaffale.add(l1);
		l1.setTitolo("Il Corsaro Nero");
		scaffale.get(2).setTitolo("La Regina dei Caraibi");
		for (Libro libro : scaffale)
			System.out.print(libro.getTitolo() + "; ");
	}

}
