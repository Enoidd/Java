package prova3;

public class L extends C {
	
	@Override
	public void dim(C c) {
		System.out.println("L.dim(C) ");
	}
	@Override
	public void dim(L l) {
		System.out.println("L.dim(L) ");
	}
	@Override
	public void dim(K k) {
		System.out.println("L.dim(K) ");
	}

}
