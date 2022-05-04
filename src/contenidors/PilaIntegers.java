package contenidors;

public class PilaIntegers {
    /**
     * Enllaç al cim de la pila
     */
    private ElementInteger inici;

    /**
     * Inicialitza la pila a null per marcar que es crea la pila buida
     **/
    public PilaIntegers() {
        inici = null;
    }

    /**
     * Afegeix el valor rebut com a paràmetre al cim de la pila si no és null.
     *
     * @param info El nou valor
     */
    public void push(Integer info) {
        if (info != null) {
            ElementInteger nou = new ElementInteger(info, inici);
            inici = nou;
        }
    }

    /**
     * Torna, sense esborrar-lo, el valor guardat al cim de la pila
     *
     * @return El valor del cim de la pila
     */
    public Integer peek() {
        if (!isEmpty()) {
            return inici.getInfo();
        } else {
            return null;
        }
    }

    /**
     * Elimina, sense tornar-lo, el valor guardat al cim de la pila
     **/
    public void pop() {
        if (!isEmpty()) {
            inici = inici.getSeguent();
        }
    }

    /**
     * Torna i elimina el valor del cim de la pila
     *
     * @return el valor del cim de la pila
     */
    public Integer poll() {
        Integer info = peek();
        pop();
        return info;
    }

    /**
     * Comprova si la pila es buida o no
     *
     * @return true si la pila és buida
     */
    public boolean isEmpty() {
        return inici == null;
//        if(inici==null){
//            return true;
//        }else{
//            return false;
//        }
    }

    /**
     * Torna una cadena mab la representació de tots els elements de la pila.
     * @return La representació textual del contingut de la pila.
     */
    @Override
    public String toString() {
        String s= "Pila{";
        ElementInteger actual=inici;
        String separador="";
        while(actual!=null){
            s+=separador+actual.getInfo();
            separador=", ";
            actual=actual.getSeguent();
        }
        s+="}";
        return s;
    }
}
