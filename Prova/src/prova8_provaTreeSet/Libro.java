package prova8_provaTreeSet;


class Libro implements Comparable<Libro> {
	private int anno;
	private String titolo;

	Libro(int anno, String titolo) {
		this.anno = anno;
		this.titolo = titolo;
	}

	public int hashCode() {
		return (this.anno + this.titolo.hashCode());
	}

	public int compareTo(Libro libro) {
		int temp = this.anno - libro.getAnno();
			if(temp == 0) {
				temp = this.getTitolo().compareTo(libro.getTitolo());
			}
		return temp;
//		return this.anno - libro.getAnno();
	}

	public String getTitolo() {
		return this.titolo;
	}

	public int getAnno() {
		return this.anno;
	}

	public boolean equals(Object o) {
		Libro l = (Libro) o;
		return ((this.anno == l.getAnno()) &&
				(this.titolo.equals(l.getTitolo())));
	}
}
