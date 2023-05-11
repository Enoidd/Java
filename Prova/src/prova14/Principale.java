package prova14;

import java.util.*;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studente> lista = new LinkedList<Studente>();
		
		lista.add(new Studente("555", 18));
		lista.add(new Studente("777", 19));
		lista.add(new Studente("888", 20));
		lista.add(new Studente("777", 19));
		
		
		for(Studente l: lista) {
			System.out.println("Eta: "+l.getEta()+" . Matricola: "+l.getMatricola());
		}
		
		
	}

}
