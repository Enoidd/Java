package main;

import interfacce.Musicista;
import interfacce.Strumento;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musicista m = new Musicista("Giovanni");
		
		/* Sappiamo che:
		 * 's' è di tipo Strumento, dunque possiamo invocare i metodi di 'Strumento' 
		 *  */
		Strumento s = new Strumento("Violino");
		
		Strumento tamburo = new Tamburo("Tamburo");
		Strumento tromba = new Tromba("Tromba");
		
	}

}
