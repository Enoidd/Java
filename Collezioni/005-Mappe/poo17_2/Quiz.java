package poo17_2;

import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> codice2nome = new HashMap<Integer, String>();
		
		codice2nome.put(1, new String("Paolo"));
		codice2nome.put(2, new String("Luca"));
		codice2nome.put(3, new String("Paolo"));
		codice2nome.put(1, new String("Stefano"));
		
		List<Integer> ll = new LinkedList<Integer>(codice2nome.keySet());
		
		Collections.sort(ll);
		
		Iterator<Integer> i = ll.iterator();
		while(i.hasNext())
			System.out.println(codice2nome.get(i.next())+" ");
	}

}
