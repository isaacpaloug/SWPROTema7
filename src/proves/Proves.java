package proves;

import dades.Preferencia;
import dades.Preferencia2;
import dades.Preferencia3;
import utilitats.TipusPlat;

import java.util.*;


public class Proves {
    public static void main(String[] args) {
        Proves proves = new Proves();
//        proves.provaPilaArrayDeque();
        proves.provaCoaArrayDQueue();
//        proves.provaHashSet();
//        proves.provaHashSet2();
//        proves.provaHashMap();
//        proves.provaEnumeracions();
    }

    public void provaPilaArrayDeque() {
        ArrayDeque<Preferencia> pila = new ArrayDeque<>();
        //Omplim la pila amb valors de 1 a 10
        for (int index = 1; index <= 10; index++) {
            pila.push(new Preferencia(index, "Plat " + index));
        }
        //Comprovam el funcionament de peek
        System.out.println("Peek: " + pila.peek());
        System.out.println("Peek: " + pila.peek());
        //Comprovam el funcionament de poll
        System.out.println("poll: " + pila.poll());
        System.out.println("Peek: " + pila.peek());
        //Buidam la pila
        while (!pila.isEmpty()) {
            System.out.println("Peek: " + pila.peek());
            pila.pop();
        }
        //Comprovam que sigui buida
        System.out.println("Buida: " + pila.isEmpty());

    }

    public void provaCoaArrayDQueue() {
        ArrayDeque<Preferencia> coa = new ArrayDeque<>();
        //Omplim la pila amb valors de 1 a 10
        for (int index = 1; index <= 10; index++) {
            coa.add(new Preferencia(index, "Plat " + index));
        }
        //Comprovam el funcionament de peek
        System.out.println("Size: " + coa.size());
        System.out.println("Element: " + coa.element());
        System.out.println("Size: " + coa.size());
        //Comprovam el funcionament de poll

        System.out.println("Remove: " + coa.remove());
        System.out.println("Size: " + coa.size());
        //Buidam la pila
        while (!coa.isEmpty()) {
            System.out.println("remove: " + coa.remove());
        }
        //Comprovam que sigui buida
        System.out.println("Buida: " + coa.isEmpty());

    }

    public void provaHashSet() {
        HashSet<Preferencia> conjunt = new HashSet<>();

        Preferencia paella = new Preferencia(1, "Paella");
        System.out.println(conjunt.add(paella));
        Preferencia paella2 = new Preferencia(1, "Paella");
        System.out.println(conjunt.add(paella2));
        System.out.println("Ha inserit el segon objecte perque l'equals per defecte diu que dos objectes són iguals si realment són el mateix objecte, si les dues variables contenen la mateixa referència. Hauriem de definir que vol dir per noltros que dues preferències siguin iguals.");

        Preferencia porcella = new Preferencia(2, "Porcella rostida");
        System.out.println(conjunt.add(porcella));

        if (conjunt.contains(paella)) {
            System.out.println("Paella és al conjunt");
        }

        for (Preferencia pref : conjunt) {
            System.out.print(pref + "\t");
        }
        System.out.println();

        for (Preferencia p : conjunt) {
            System.out.print(p + "\t");
        }

//        Iterator<Preferencia> it = conjunt.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + "\t");
//        }
        System.out.println();

        System.out.println("Mida: " + conjunt.size());

        if (conjunt.remove(porcella)) {
            System.out.println("Porcella eliminada");
        }
        System.out.println(conjunt.isEmpty());

        for (Preferencia pref : conjunt) {
            System.out.print(pref + "\t");
        }
        System.out.println();
    }

    public void provaHashSet2() {
        HashSet<Preferencia2> conjunt = new HashSet<>();

        Preferencia2 paella = new Preferencia2(1, "Paella");
        System.out.println(conjunt.add(paella));
        Preferencia2 paella2 = new Preferencia2(1, "Paella");
        System.out.println(conjunt.add(paella2));
        System.out.println("Hem modificat l'equals de Preferencia. Ara dues preferències són iguals si els seus atributs tenen els mateixos valors. Per tant, el conjunt només admet una paella.");
        Preferencia2 porcella = new Preferencia2(2, "Porcella rostida");
        System.out.println(conjunt.add(porcella));

        if (conjunt.contains(paella)) {
            System.out.println("Paella és al conjunt");
        }

        for (Preferencia2 pref : conjunt) {
            System.out.print(pref + "\t");
        }
        System.out.println();

        Iterator<Preferencia2> it = conjunt.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println();

        System.out.println("Mida: " + conjunt.size());

        if (conjunt.remove(porcella)) {
            System.out.println("Porcella eliminada");
        }
        System.out.println(conjunt.isEmpty());

        for (Preferencia2 pref : conjunt) {
            System.out.print(pref + "\t");
        }
        System.out.println();
    }

    public void provaHashMap() {
        HashMap<String, Preferencia> mapa = new HashMap<>();

        Preferencia pref1 = new Preferencia(1, "Pa amb oli");
        Preferencia pref2 = new Preferencia(2, "Arròs brut");
        Preferencia pref3 = new Preferencia(3, "Porcella rostida");
        Preferencia pref4 = new Preferencia(2, "Pa amb oli");

        System.out.println(mapa.put(pref1.getNom(), pref1));
        System.out.println(mapa.put(pref2.getNom(), pref2));
        System.out.println(mapa.put(pref3.getNom(), pref3));

        System.out.println(mapa.put(pref4.getNom(), pref2));

        if (mapa.containsKey(pref2.getNom())) {
            System.out.println("Clau ja hi és");
        }
        if (mapa.containsValue(pref2)) {
            System.out.println("Valor ja hi és");
        }
        System.out.println(mapa.get("Pa amb oli"));

        for (Preferencia valor : mapa.values()) {
            System.out.print(valor + "\t");
        }

        for (String clau : mapa.keySet()) {
            System.out.print(clau + "\t");
        }

        System.out.println();

        System.out.println("Mida: " + mapa.size());

        mapa.remove(pref1.getNom());

        System.out.println(mapa.isEmpty());

        System.out.println();

    }

    public void provaEnumeracions() {
        ArrayList<Preferencia3> llista = new ArrayList<>();
        llista.add(new Preferencia3(1, "Tumbet", TipusPlat.PRINCIPAL));
        llista.add(new Preferencia3(2, "Pa i alloli", TipusPlat.ENTRANT));
        llista.add(new Preferencia3(3, "Gato�", TipusPlat.POSTRE));
        llista.add(new Preferencia3(4, "Escaldums", TipusPlat.PRINCIPAL));
        llista.add(new Preferencia3(5, "Olives", TipusPlat.ENTRANT));
        llista.add(new Preferencia3(6, "Ensaimada de crema", TipusPlat.POSTRE));
        for (Preferencia3 pref : llista) {
            if (pref.getTipus() == TipusPlat.POSTRE) {
                System.out.println(pref);
            }

        }

    }

    private void mostraLlista(ArrayList<Object> llista) {
        for (Object objecte : llista) {
            System.out.println(objecte);
        }
    }

}
