package veicoli;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veicolo a = new Autotreno();
		Autotreno b = new Autotreno();
		
		a.func(b);	// 'b' ha tipo statico 'Autotreno' --> Invoca func(Autotreno a)
		a.func(a);	// 'a' ha tipo statico 'Veicolo' --> Invoca func(Veicolo v)
		
		/* Una classe può implementare una o più interfacce */
	}

}
