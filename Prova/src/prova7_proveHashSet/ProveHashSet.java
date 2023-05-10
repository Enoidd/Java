package prova7_proveHashSet;
import java.util.*;

public class ProveHashSet {

	public static void main(String[] argv) {
		  Set<Evento> set1 = new HashSet<Evento>();
	 	  Evento e  = new Evento(2000);
		  set1.add(e);
	 	  e = new Evento(2000);
	  	  set1.add(e);

		  Set<Catastrofe> set2 = new HashSet<Catastrofe>();
	 	  Catastrofe c = new Catastrofe(2000);
		  set2.add(c);
		  c = new Catastrofe(2000);
		  set2.add(c);

		  System.out.println("set1.size()="+set1.size());
		  System.out.println("set2.size()="+set2.size());
	    }

}
