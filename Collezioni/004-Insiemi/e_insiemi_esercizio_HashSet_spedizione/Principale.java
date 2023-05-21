package e_insiemi_esercizio_HashSet_spedizione;

import java.util.HashSet;
import java.util.Set;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spedizione s1 = new Spedizione("Velletri", 123);
		Spedizione s2 = new Spedizione("Roma", 456);
		Spedizione s3 = new Spedizione("Albano", 789);
		Spedizione s4 = new Spedizione("Albano", 789);
		
		Set<Spedizione> spedizione = new HashSet<>();
		
		spedizione.add(s1);
		spedizione.add(s2);
		spedizione.add(s3);
		spedizione.add(s4);
		
		System.out.println("Dimensione insieme: "+spedizione.size());
		
		for(Spedizione pacco : spedizione) {
			System.out.println(" "+pacco.getCodice()+" ,"+pacco.getDestinazione());
		}
	}

}
