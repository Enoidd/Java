package prova15;

class Persona implements Comparable< Persona > {
    private String nome;
    private String[] nomi;
    
    private int eta;
    
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public String getNome() { return this.nome; }
    public int getEta()     { return this.eta;  }
    
    @Override
    public int compareTo(Persona that) {
        return this.getNome().compareTo(that.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        Persona that = (Persona) o;
        return this.getEta()==that.getEta() && this.getNome().equals(that.getNome());
    }
    
    public void aggiungiNome(String nome, int indice) {
        this.nomi[indice] = nome;
    }
    
    /*
     * Scrivere il codice del metodo metodo public boolean verificaDuplicati(String nome)  
     * affinché ritorni true se nell'array nomi ci sono almeno 
     * due elementi uguali alla stringa nome passata come parametro, false altrimenti.
     */
    public boolean verificaDuplicati(String nome) {
    	
    	if(this.nomi==null) {
    		return false;
    	}
    	else {
    		int count = 0;
    		for(int i=0; i<nomi.length-1; i++) {
    			for(int j=0; j<nomi.length; j++) {
    				if(nomi[i].equals(nomi[j]));
    					count++;
    					if(count==2)
    						return true;
    			}
    		}
    	}
        return false;
    }
}