package prova7_proveHashSet;

public class Evento {
	private int anno;

    Evento (int anno) {
	  this.anno = anno;
    }

    public int hashCode() {
    	return this.anno;
    }

	public int getAnno() {
		return this.anno;
	}

    public boolean equals(Object o) {
	  Evento e = (Evento) o;
	  return this.anno == e.getAnno();
    }
}
