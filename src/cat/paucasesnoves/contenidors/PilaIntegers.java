package cat.paucasesnoves.contenidors;

/**Exercici 2
 * 
 * Al paquet contenidors crea la classe PilaIntegers que implementi totes les operacions d'una pila.
 * Utilitza la classe ElementInteger per mantenir els elements.
 * 1. La classe tendrà un atribut de tipus ElementIntger que guardarà l'inici de la pila.
 * 2. Els mètodes reben com a paràmetre i tornen com a resultat només el valor del camp info dels elements, no els elements complets.
 * Si la pila és buida, peek i poll tornen null.
 * 3. Programa el toString de la classe PilaIntegers de manera que ens permeti comprovar el seu contingut.
 * 4. A la classe Proves crea el mètode provaPilaIntegers que utilitzi un objecte d'aquesta classe. Prova tots els seus mètodes.
 * 
 * @author Maria Ferrer
 *
 */

public class PilaIntegers {

	private ElementInteger inici;
	
	public boolean isEmpty(){
		return inici == null;
	}
	
	public void push(Integer info) {
		ElementInteger nou = new ElementInteger(info,inici);
			inici = nou;
	}
	
	public Integer peek() {
		if(!isEmpty()) {
			return inici.getInfo();
		}else {
			return null;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			inici = inici.getSegüent();
		}
	}
	
	public Integer poll() {
			peek();
			pop();
			return inici.getInfo();
	}

	@Override
	public String toString() {
		ElementInteger actual = inici;
		String resultat = "";
		while (actual != null) {
			resultat = resultat + actual.getInfo() + " ";
			actual = actual.getSegüent();
		}
		return resultat;
	}
	
}
