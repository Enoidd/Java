package prova3;

public class K extends C {
	@Override
	public void dim(C c) {
		System.out.println("K.dim(C) ");
	}
	@Override
	public void dim(L l) {
		System.out.println("K.dim(L) ");
	}
	@Override
	public void dim(K k) {
		System.out.println("K.dim(K) ");
	}

}
