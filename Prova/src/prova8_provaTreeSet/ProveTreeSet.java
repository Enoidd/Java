package prova8_provaTreeSet;
import java.util.*;

public class ProveTreeSet {
	
	public static void main(String[] argv) {
		  Set<Libro> set1 = new TreeSet<Libro>();
	 	  Libro l1  = new Libro(2000,"Ieri e oggi");
	 	  Libro l2 = new Libro(2000, "Domani e dopodomani");
		  set1.add(l1);
	  	  set1.add(l2);

		  Set<Libro> set2 = new HashSet<Libro>();
		  set2.add(l1);
		  set2.add(l2);

		  System.out.println("set1.size()="+set1.size());
		  System.out.println("set2.size()="+set2.size());
	    }
}
