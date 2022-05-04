package dades;

import java.util.Objects;

public class Preferencia2 {
    int ordre;
    String nom;

    public Preferencia2(int ordre, String nom) {
        this.ordre = ordre;
        this.nom = nom;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Preferencia{" +
                "ordre=" + ordre +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preferencia2)) return false;
        Preferencia2 that = (Preferencia2) o;
        return getOrdre() == that.getOrdre() &&
                Objects.equals(getNom(), that.getNom());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOrdre(), getNom());
    }
}
