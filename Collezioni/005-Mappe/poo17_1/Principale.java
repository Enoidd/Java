package poo17_1;

import java.util.*;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l1 = new Libro("Le rose", "Eddy Bolognese");
		Libro l2 = new Libro("La camminata", "Franco Calisse");
		
		RaggruppatoreLibriPerAutore collezione = new RaggruppatoreLibriPerAutore();
		
		collezione.aggiungiLibro(l1);
		collezione.aggiungiLibro(l2);
		
		System.out.println(collezione.autore2Libri());		
	}

}
