package estensione_di_interfacce;

/**
 * Se si volesse definire l'interface 'B' che debba offrire gli stessi metodi di A, ed in più il metodo
 * 'b1' (che è offerto solo dall'interface 'B' e non dall'interface 'A'.
 *
 * Si potrebbe dire che l'interface 'B' è sottotipo dell'interface 'A'.Cioè implementa gli stessi metodi
 * di 'A' ma ne aggiunge anche qualcun'altro, proprio di 'B'.
 */
public interface B extends A{

	// Primo metodo + quelli che estende di 'A'
	public int b1();
	
	/* In sostanza stiamo definendo una nuova interface a partire da una gia esistente. 
	 * 
	 */
}
