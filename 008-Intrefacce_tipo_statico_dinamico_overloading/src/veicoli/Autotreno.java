package veicoli;

public class Autotreno implements Veicolo{
	
	public void func(Veicolo v) {
		System.out.println("Autotreno.func(Veicolo) ");
	}
	
	public void func(Autotreno a) {
		System.out.println("Autotreno.func(Autotreno) ");
	}
}
