package cat.paucasesnoves.contenidors;


/**Exercici 5
 * 
 * 2.  Copia la classe PilaIntegers amb el nom Pila, parametritza-la i modifica-la de manera que ara utilitzi Element en lloc de ElementInteger.
 * 
 * @author Maria Ferrer
 *
 */

public class Pila <P>{

	private Element<P> inici;
	
    public Pila() {
        inici = null;
    }

    public void push(P info) {
        if (info != null) {
            Element<P> nou = new Element<>(info, inici);
            inici = nou;
        }
    }

    public P peek() {
        if (!isEmpty()) {
            return inici.getInfo();
        } else {
            return null;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            inici = inici.getSegüent();
        }
    }

    public P poll() {
        P info = peek();
        pop();
        return info;
    }

    public boolean isEmpty() {
        return inici == null;
//        if(inici==null){
//            return true;
//        }else{
//            return false;
//        }
    }

    @Override
    public String toString() {
        String s= "Pila{";
        Element actual=inici;
        String separador="";
        while(actual!=null){
            s+=separador+actual.getInfo();
            separador=", ";
            actual=actual.getSegüent();
        }
        s+="}";
        return s;
}
    
}
