package contenidors;

public class ElementInteger {
    /**
     * Informaci� de l'element. Integer per poder manejar el valor null
     */
    private Integer info;
    /**
     * "Apuntador" al seg�ent element de la llista encadenada
     */
    private ElementInteger seguent;

    /**
     * Constructor amb par�metres per la informaci� i l'enlla� al seg�ent.
     * @param info Informaci� que cont� l'element.
     * @param seguent Enlla� amb la llista
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
     *  Getter per a la informaci�
     * @return el contingut del camp d'informaci�
     */
    public Integer getInfo() {
        return info;
    }

    /**
     * Getter per a l'enlla�
     * @return El seg�ent element de la llista
     */
    public ElementInteger getSeguent() {
        return seguent;
    }

    /**
     * Modifica l'enlla� amb la llista
     * @param seguent El seg�ent element de la llista
     */
    public void setSeguent(ElementInteger seguent) {
        this.seguent = seguent;
    }

}
