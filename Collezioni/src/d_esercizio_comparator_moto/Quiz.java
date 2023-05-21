package d_esercizio_comparator_moto;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Quiz {

	public static void main(String[] args) {
	
		// Le liste ammettono doppioni
		List<Moto> elenco_moto = new LinkedList<Moto>();
		
		elenco_moto.add(new Moto("Guzzi", 500));
		elenco_moto.add(new Moto("Suzuki", 750));
		elenco_moto.add(new Moto("Suzuki", 250));
		elenco_moto.add(new Moto("Honda", 1500));
		
		Collections.sort(elenco_moto, new ComparatoreMoto());
		
		for(Moto persona : elenco_moto) {
			System.out.println(persona.getMarca()+" ");
		}
	}
}
