package b_ArrayList_esercizio_Borsa;

import java.util.ArrayList;

public class Borsa {
	
	ArrayList<Attrezzo> attrezzi = new ArrayList<Attrezzo>();
	
	public Borsa() {
	}
	
	
	public void aggiungiAttrezzo(Attrezzo attrezzo) {
		attrezzi.add(attrezzo);
	}
	
	public void removeAttrezzo(String nomeAttrezzo) {
		attrezzi.remove(nomeAttrezzo);
	}
	
	public void clearBorsa() {
		attrezzi.clear();
	}
	
	public String toString() {
		
		for(Attrezzo iteratore : attrezzi) {
			System.out.println(iteratore.getNome()+". Peso: "+iteratore.getPeso()+" ");
		}
		return null;
	}
	
	public int dimensioneBorsa(Borsa borsa) {
		return attrezzi.size();
	}
	
}
