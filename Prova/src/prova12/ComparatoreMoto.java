package prova12;

import java.util.*;

class ComparatoreMoto implements Comparator<Moto> {
	public int compare(Moto m1, Moto m2) {
		return (m1.getCilindrata()- m2.getCilindrata());
	}
}
