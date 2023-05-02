package prova4;

public class Elicottero extends Velivolo {

	public String motore() {
		return "Elicottero-motore";
	}
	@Override
	public String toString() {
		return motore()+" "+super.motore()+" "+this.tipologia();
	}

	public String tipologia() {
		return "tipologia";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velivolo v = new Elicottero();
        System.out.println(v.toString());
        
       Elicottero e = new Elicottero();
       System.out.println(e.toString());
       
       Velivolo v1 = new Velivolo();
       System.out.println(v1.toString());
	}

}
