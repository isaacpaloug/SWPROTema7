package cat.paucasesnoves.dades;

/**Exercici 4
 * 
 * Al paquet dades crea la classe Preferencia per mantenir els plats preferits de l'usuari:
 * 1. Ha de tenir un atribut de tipus int anomenat ordre.
 * 2. Ha de tenir un atribut de tipus String anomenat plat.
 * 3. Ha de tenir un constructor amb paràmetres per els dos camps, els getters i el toString.
 * 
 * @author Maria Ferrer
 *
 */

public class Preferencia {
	
	private int ordre;
	private String plat;
	
	public Preferencia(int ordre, String plat) {
		this.ordre = ordre;
		this.plat = plat;
	}

	public int getOrdre() {
		return ordre;
	}

	public String getPlat() {
		return plat;
	}

	@Override
	public String toString() {
		return "Preferencia [ordre=" + ordre + ", plat=" + plat + "]";
	}
	
}
