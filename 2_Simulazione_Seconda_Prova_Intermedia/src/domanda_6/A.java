package domanda_6;

public class A {
	
	public C1 getC() {
        return new C2();
    }
    
    public void p(C1 c) {
        System.out.println("A.p(C1)");
        c.a();	// DINAMICO C2
    }
    
    public void p(C2 c) {
        System.out.println("A.p(C2)");
        c.a();
    }
}