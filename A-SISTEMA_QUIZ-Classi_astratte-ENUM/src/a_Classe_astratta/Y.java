package a_Classe_astratta;

public class Y extends A{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Y.a");
        c();
	}

	@Override
	public void b() {
		super.b();
		System.out.println("Y.b");
	}
}
