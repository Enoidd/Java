package g_TreeMap_Comparator;

import java.util.Comparator;

public class ComparatorePerEta implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getEta()-o2.getEta();
	}

}
