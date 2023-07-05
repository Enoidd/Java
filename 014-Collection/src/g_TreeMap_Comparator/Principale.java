package g_TreeMap_Comparator;

import java.util.TreeMap;
import java.util.Map;

public class Principale {

	public static void main(String[] args) {
		
		ComparatorePerEta cmp = new ComparatorePerEta();
		Map<Persona, String> treeMap = new TreeMap<>(cmp);
		
		treeMap.put(new Persona("Giammaria", 28), "Giammaria");
		treeMap.put(new Persona("Sofia", 27), "Sofia");
		treeMap.put(new Persona("Giammaria", 28), "Giammaria");	// Non lo inserisce
		
		System.out.println(treeMap.toString());
	}

}
