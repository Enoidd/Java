package insiemi_HashSet;

import java.util.*;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Valter", "Crescenzi", 10);
		Persona p2 = new Persona("Roberto", "Menichelli", 11);
		
		Persona p3 = new Persona("Valter", "Crescenzi", 10);
		
		System.out.println("p1: Valter Crescenzi 10 -> p1.hashCode: " + p1.hashCode());	// hashCode uguale a p3
		System.out.println("p2: Roberto Menichelli 11 -> p2.hashCode: " + p2.hashCode());
		System.out.println("p3: Valter Crescenzi 10 -> p3.hashCode: " + p3.hashCode());	// hashCode uguale a p1
		
		Set<Persona> insieme = new HashSet<>();	// Insieme
		
		insieme.add(p1);	// Aggiungi a 'insieme' p1
		insieme.add(p2);	// Aggiungi a 'insieme' p2
		
		System.out.println("Dimensione insieme: " + insieme.size());
		
		p1 = new Persona("Valter", "Crescenzi", 10);
		
		insieme.add(p1);	// Non lo aggiunge perché è duplicato
		
		System.out.println("Dimensione insieme: " + insieme.size()); // Dimensione sempre 2
	
		Persona p4 = new Persona("Valter", "Crescenzi", 10);
		
		insieme.add(p4);	// Non lo aggiunge perché è duplicato
		
		System.out.println("Dimensione insieme: " + insieme.size());	// Dimensione sempre 2
	}

}
