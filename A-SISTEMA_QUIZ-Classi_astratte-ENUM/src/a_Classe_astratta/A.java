package a_Classe_astratta;

public abstract class A {
	
	public abstract void a();
	
	public void b() {
		System.out.println("A.b");
		a();
	}
	
	public void c() {
		System.out.println("A.c");
	}
}
