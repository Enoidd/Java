package d_esercizio_comparator_libro;

import java.util.List;

import c_liste_esercizio_contatto.Contatto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Biblioteca {
	
	private List<Libro> elenco;
	
	public Biblioteca() {
		this.elenco = new ArrayList<Libro>();
	}
	
	public void aggiungiLibro(Libro libro) {
		this.elenco.add(libro);
	}

	public List<Libro> elencoOrdinatoPerPagine() {
		
		//ComparatorePerPagine cmp = new ComparatorePerPagine();
		Collections.sort(this.elenco);
		return this.elenco;
	}
	
	@Override
	public String toString() {
		
		String s = "Biblioteca:";
		System.out.println("\nBiblioteca");
		System.out.println("---------------------\n");
		Iterator<Libro> it = this.elenco.iterator();
		while(it.hasNext()) {
			Libro libro = it.next();
			System.out.println(libro.toString());
		}
		return s;
	}
}