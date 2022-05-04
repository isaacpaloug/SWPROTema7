package contenidors;

public class ElementInteger {
    /**
     * Informació de l'element. Integer per poder manejar el valor null
     */
    private Integer info;
    /**
     * "Apuntador" al següent element de la llista encadenada
     */
    private ElementInteger seguent;

    /**
     * Constructor amb paràmetres per la informació i l'enllaç al següent.
     * @param info Informació que conté l'element.
     * @param seguent Enllaç amb la llista
     */
    public ElementInteger(Integer info, ElementInteger seguent) {
        this.info=info;
        this.setSeguent(seguent);
    }


    @Override
    public String toString() {
        return "ElementInteger{" +
                "info=" + getInfo() +
                '}';
    }

    /**
     *  Getter per a la informació
     * @return el contingut del camp d'informació
     */
    public Integer getInfo() {
        return info;
    }

    /**
     * Getter per a l'enllaç
     * @return El següent element de la llista
     */
    public ElementInteger getSeguent() {
        return seguent;
    }

    /**
     * Modifica l'enllaç amb la llista
     * @param seguent El següent element de la llista
     */
    public void setSeguent(ElementInteger seguent) {
        this.seguent = seguent;
    }

}
