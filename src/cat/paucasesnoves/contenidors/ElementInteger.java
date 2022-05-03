package cat.paucasesnoves.contenidors;

/**Exercici 1
 * 
 * Al paquet contenidors crea la classe ElementInteger amb dos atributs:
 * 1. Un anomenat info de tipus Integer, que contindrà el valor guardat a l'element.
 * 2. Un de tipus ElementInteger, que serà la referència al següent element del contenidor.
 * 3. Programa un constructor amb paràmetres per els dos atributs, els dos getters, el setter
 * per al següent i el toString que mostri només info.
 * 
 * @author Maria Ferrer
 *
 */

public class ElementInteger {

	private Integer info;
	private ElementInteger següent;
	
	public Integer getInfo() {
		return info;
	}
	
	public ElementInteger getSegüent() {
		return següent;
	}
	public void setSegüent(ElementInteger següent) {
		this.següent = següent;
	}
	
	public ElementInteger (Integer info, ElementInteger següent) {
		this.info = info;
		this.següent = següent;
	}
	@Override
	public String toString() {
		return "ElementInteger [info = " + info + "]";
	}

}


