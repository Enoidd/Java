package e_generics_con_un_tipo_Emetodi_generici;

import java.util.*;

public class Coppias {
	
	public static void main(String[] args) {
		
		Coppia<Persona> coppiaPersona = new Coppia<>(new Persona("Persona2"), new Persona("Persona1"));
		

		System.out.println("========CoppiaPersona:\n");
		System.out.println("\nPrimo elemento: Persona2");
		System.out.println("Primo elemento: Persona1\n");
		/*
		 * La coppiaPersona ha un primo elemento con lo stesso nome del secondo elemento?
		 */
		System.out.println("========Verifico la coppiaPersona:");
		if(coppiaPersona.getPrimo().getNome().equals(coppiaPersona.getSecondo().getNome()))
			System.out.println("Coppia di persone Uguali.\n");
		else
			System.out.println("Coppia di persone Diverse.\n");
		
		coppiaPersona.setPrimo(new Persona("Persona1"));
		
		System.out.println("MODIFICA: Adesso il primo elemento è: Persona1\n");
		
		System.out.println("========Verifico la coppiaPersona:");
		if(coppiaPersona.getPrimo().getNome().equals(coppiaPersona.getSecondo().getNome()))
			System.out.println("Coppia di persone Uguali.\n");
		else
			System.out.println("Coppia di persone Diverse.\n");
		
		Coppia<Persona> coppiaPersona2 = new Coppia<>(new Persona("Persona3"), new Persona("Persona4"));
		
		System.out.println("Primo elemento: "+ coppiaPersona2.getPrimo().getNome());
		System.out.println("Secondo elemento: "+ coppiaPersona2.getSecondo().getNome());
		
//		System.out.println("========COPY (dest: coppiaPersona2, source: coppiaPersona");
//		coppiaPersona.copy(coppiaPersona2, coppiaPersona);
		
		System.out.println("========COPY (dest: coppiaPersona, source: coppiaPersona2");
		coppiaPersona.copy(coppiaPersona, coppiaPersona2);
		
		System.out.println("Primo elemento: "+ coppiaPersona.getPrimo().getNome());
		System.out.println("Secondo elemento: "+ coppiaPersona.getSecondo().getNome());
	}
}
