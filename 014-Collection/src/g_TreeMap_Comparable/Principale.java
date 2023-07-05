package g_TreeMap_Comparable;

import java.util.Map;
import java.util.TreeMap;

public class Principale {

	public static void main(String[] args) {
		
		Map<String, Persona> treeMap = new TreeMap<>();
		
		treeMap.put("Giammaria", new Persona("Giammaria", 28));
		treeMap.put("Giammaria", new Persona("Giammaria", 28));
		treeMap.put("Sofia", new Persona("Sofia", 27));
		
		System.out.println(treeMap.toString());
	}
}
