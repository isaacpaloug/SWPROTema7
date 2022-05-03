package cat.paucasesnoves.dades;

/**Exercici 11
 * 
 * Clona la classe Preferencia amb el nom Preferencia2 i programa els mètodes
 * hashCode i equals utilitzant l'asistent de l'IDE.
 * Utilitza tots els atributs.
 * 
 * @author Maria Ferrer
 *
 */

public class Preferencia2 {
	
	private int ordre;
	private String plat;
	
	public Preferencia2(int ordre, String plat) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ordre;
		result = prime * result + ((plat == null) ? 0 : plat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preferencia2 other = (Preferencia2) obj;
		if (ordre != other.ordre)
			return false;
		if (plat == null) {
			if (other.plat != null)
				return false;
		} else if (!plat.equals(other.plat))
			return false;
		return true;
	}
	
}
