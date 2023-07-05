package g_HashMap_hashCode_Equals;

import java.util.Map;
import java.util.HashMap;

public class Principale {

	public static void main(String[] args) {
		
		Map<String, Persona> mappaPersona = new HashMap<>();
		
		mappaPersona.put("Giammaria", new Persona("Giammaria", 28));
		mappaPersona.put("Sofia", new Persona("Sofia", 27));
		mappaPersona.put("Beatrice", new Persona("Beatrice", 25));
		mappaPersona.put("Giordana", new Persona("Giordana", 20));
		mappaPersona.put("Elio", new Persona("Elio", 20));
		// Inserisce prime Elio, Elio 20, ma dato che qui sotto inserisco come chiave Elio
		// lui aggiorna la chiave con Elia 20, perché la chiave deve essere unica.
		mappaPersona.put("Elio", new Persona("Elia", 20));
		// se aggiungo nuovamente chiave valore uguale lui non lo inserisce
		mappaPersona.put("Elio", new Persona("Elia", 20));
		
		System.out.println(mappaPersona.toString());
	}

}
