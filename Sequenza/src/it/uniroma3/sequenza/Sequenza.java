package it.uniroma3.sequenza;

public class Sequenza {
	private int array[];
	
	public Sequenza(int n){
		this.array = new int[n];
	}
	
	/**
	 * Metodo calcola il max
	 * @param array, array è la sequenza
	 * @return il max
	 */
	public int max() {
		int max = 0;
		if(array.length == 0)
			return max;
		else {
			max = array[0];
			for(int i=1; i<array.length; i++) {
				if(array[i]>max)
					max = array[i];
			}
		}
		return max;
	}
	
	public void setElemento(int indice, int valore) {
		array[indice] = valore;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequenza positivi;
		Sequenza negativi;
		Sequenza negEpos;
		Sequenza negEzero;
		Sequenza inPrimaPos;
		Sequenza inUltimaPos;
		
		positivi = new Sequenza(5);
		
		positivi.setElemento(0, 1);
		positivi.setElemento(1, 5);
		positivi.setElemento(2, 8);
		positivi.setElemento(3, 3);
		positivi.setElemento(4, 4);
		
		negativi = new Sequenza(5);
		
		negativi.setElemento(0, -6);
		negativi.setElemento(1, -1);
		negativi.setElemento(2, -8);
		negativi.setElemento(3, -13);
		negativi.setElemento(4, -10);
		
		negEpos = new Sequenza(5);
		
		negEpos.setElemento(0, 100);
		negEpos.setElemento(1, -5);
		negEpos.setElemento(2, -80);
		negEpos.setElemento(3, 1000);	// MAX
		negEpos.setElemento(4, 10);
		
		negEzero = new Sequenza(5);
		
		negEzero.setElemento(0, -1);
		negEzero.setElemento(1, 0);		// MAX
		negEzero.setElemento(2, -80);
		negEzero.setElemento(3, -10);
		negEzero.setElemento(4, -10);
		
		inPrimaPos = new Sequenza(5);
		
		inPrimaPos.setElemento(0, 1000);	// MAX
		inPrimaPos.setElemento(1, 0);
		inPrimaPos.setElemento(2, 80);
		inPrimaPos.setElemento(3, -10);
		inPrimaPos.setElemento(4, -10);
		
		inUltimaPos = new Sequenza(5);
		
		inUltimaPos.setElemento(0, 1);
		inUltimaPos.setElemento(1, 0);
		inUltimaPos.setElemento(2, 80);
		inUltimaPos.setElemento(3, -10);
		inUltimaPos.setElemento(4, 1000);	// MAX
		
		boolean esito = true;
		esito &= (positivi.max()==8);
		System.out.println(positivi.max()==8);
		esito &= (positivi.max()==-1);
		System.out.println(negativi.max()==-1);
		esito &= (negativi .max()==1000);
		System.out.println(positivi.max()==1000);
		esito &= (negEzero.max()==0);
		System.out.println(negEzero.max()==0);
		esito &= (inPrimaPos.max()==1000);
		System.out.println(inPrimaPos.max()==1000);
		esito &= (inUltimaPos.max()==1000);
		System.out.println(inUltimaPos.max()==1000);
		
		System.out.println(esito);
	}
}
