package cat.paucasesnoves.contenidors;

/**Exercici 5
 * 
 * Al paquet contenidors:
 * 1. Crea una versió parametritzada de la classe ElementInteger anomenada Element. El paràmetre ha de ser el tipus del camp info.
 * 2. Copia la classe PilaIntegers amb el nom Pila, parametritza-la i modifica-la de manera que ara utilitzi Element en lloc de ElementInteger.
 * 3. A la classe Proves crea un mètode anomenat provaPilaGenerics que utilitzi una pila de Preferencia.
 * 
 * @author Maria Ferrer
 *
 */

public class Element <E> {

	private E info;
	private Element<E> següent;


	public Element(E info, Element<E> següent) {
		this.info = info;
		this.setSegüent(següent);
	}
	
	public Element<E> getSegüent() {
		return següent;
	}

	public void setSegüent(Element<E> següent) {
		this.següent = següent;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Element [info=" + getInfo() + "]";
	}
	
}
