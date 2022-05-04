package dades;

import utilitats.TipusPlat;


public class Preferencia3  {
    private int ordre;
    private String nom;
    private TipusPlat tipus;

    public Preferencia3(int ordre, String nom, TipusPlat tipus) {
        this.ordre = ordre;
        this.nom = nom;
        this.tipus = tipus;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getNom() {
        return nom;
    }

    public TipusPlat getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        return "Preferencia3{" +
                "ordre=" + ordre +
                ", nom='" + nom + '\'' +
                ", tipus=" + tipus +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preferencia3)) return false;

        Preferencia3 that = (Preferencia3) o;

        if (ordre != that.ordre) return false;
        if (!nom.equals(that.nom)) return false;
        return tipus == that.tipus;
    }

    @Override
    public int hashCode() {
        int result = ordre;
        result = 31 * result + nom.hashCode();
        result = 31 * result + tipus.hashCode();
        return result;
    }


}
