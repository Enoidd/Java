package d_esercizio_comparator_moto;

import java.util.Comparator;

public class ComparatoreMoto implements Comparator<Moto>{

	@Override
	public int compare(Moto o1, Moto o2) {
		// TODO Auto-generated method stub
		return o1.getCilindrata() - o2.getCilindrata();
	}
}
