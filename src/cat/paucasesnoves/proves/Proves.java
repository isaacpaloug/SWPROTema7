package cat.paucasesnoves.proves;

import cat.paucasesnoves.contenidors.*;
import cat.paucasesnoves.dades.*;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Stack;

/**Classe executable per realitzar les proves.
 * 
 * Exercicis: 2.4, 5.3, 6, 7, 8, 10, 12.
 * 
 * @author Maria Ferrer
 *
 */
public class Proves {

	public static void main(String[] args) {
		
	/*	Proves provaPila = new Proves();
		provaPila.provaPilaIntegers();
		
		
		Proves provaPilaStack = new Proves();
		provaPilaStack.provaPilaStack();
		
		
		Proves provaArrayDeque = new Proves();
		provaArrayDeque.provaPilaArrayDeque();
		
		
		Proves provaCoaDeque = new Proves();
		provaCoaDeque.provaCoaArrayDeque();
	
		Proves provaHashSet = new Proves();
		provaHashSet.provesHashSet();
		System.out.println("Sí que l'ha inserit. No és el que esperàvem,\n"
				+ "perquè els conjunts són col·leccions d'elements únics.\n"
				+ "No s'hauria de permetre el duplicat.");
	*/
		
		Proves provaHash2 = new Proves();
		provaHash2.provesHashSet2();
		System.out.println("No, ara no ha afegit el segon objecte creat,\n"
				+ "perquè hem programat el mètode equals i, com que l'objecte\n"
				+ "ja existeix al conjunt, no s'hi afegeix");
	}

	/*Exercici 2.4*/
	
	public void provaPilaIntegers() {
		
		PilaIntegers novaPila = new PilaIntegers();
		
		novaPila.push(1);
		novaPila.push(2);
		novaPila.push(3);
		novaPila.push(4);
		System.out.println(novaPila);
		
		System.out.println(novaPila.peek());
		
		novaPila.pop();
		System.out.println(novaPila);

		System.out.println(novaPila.poll());
		
		System.out.println(novaPila);
	}
	
	/*Exercici 5.3*/
	
	public void provaPilaGenerics() { 
		
	}
	
	/*Exercici 6*/
	
	public void provaPilaStack() {
		
		Stack nova = new Stack();
		
		Preferencia preferencia1 = new Preferencia(1, "Sopa");
		Preferencia preferencia2 = new Preferencia(2, "Truita");
		Preferencia preferencia3 = new Preferencia(3, "Crema de verdura");
		
		System.out.println(nova.isEmpty());
		
		nova.push(preferencia1);
		nova.push(preferencia2);
		nova.push(preferencia3);
		
		System.out.println(nova);
		
		System.out.println(nova.peek());
		
		System.out.println(nova);
		
		System.out.println(nova.pop());
		
		System.out.println(nova);
		
	}
	
	/*Exercici 7(opcional)*/
	
	public void provaPilaArrayDeque() {
		
		ArrayDeque<Preferencia> provaDeque = new ArrayDeque<>();
		
		Preferencia plat1 = new Preferencia(1, "Pizza");
		Preferencia plat2 = new Preferencia(2, "Pasta carbonara");
		Preferencia plat3 = new Preferencia(3, "Lasagna");
		
		provaDeque.push(plat1);
		System.out.println(provaDeque);
		provaDeque.push(plat2);
		System.out.println(provaDeque);
		provaDeque.push(plat3);
		System.out.println(provaDeque);
		
		System.out.println(provaDeque.peek());
		
		provaDeque.pop();
		System.out.println(provaDeque);
		
		provaDeque.poll();
		System.out.println(provaDeque);
		
		/*Utilitzant els mètodes de la pila, tendrem una pila*/
	}
	
	/*Exercici 8*/
	
	public void provaCoaArrayDeque() {
		/*Utilitzant els mètodes de la coa, tendrem una coa. NO MESCLAR-LOS*/
		
		ArrayDeque<Preferencia> provaCoaDeque = new ArrayDeque<>();
		
		Preferencia plat1 = new Preferencia(1, "Carn");
		Preferencia plat2 = new Preferencia(2, "Peix");
		Preferencia plat3 = new Preferencia(3, "Dolços");
		
		provaCoaDeque.isEmpty();
		provaCoaDeque.add(plat1);
		provaCoaDeque.add(plat2);
		provaCoaDeque.add(plat3);
		System.out.println(provaCoaDeque);
		
		System.out.println(provaCoaDeque.size());
		
		System.out.println(provaCoaDeque.remove());
		System.out.println(provaCoaDeque);
		
		provaCoaDeque.element();
		System.out.println(provaCoaDeque);
		
		provaCoaDeque.clear();
		System.out.println(provaCoaDeque);
	}
	
	/*Exercici 10*/
	
	public void provesHashSet() {
		
		HashSet<Preferencia> provaHash = new HashSet<>();
		
		Preferencia paella = new Preferencia(1, "Paella");
		
		System.out.println(provaHash.add(paella));
		
		Preferencia paella2 = new Preferencia(1, "Paella");
		
		System.out.println(provaHash.add(paella2));
		
		Preferencia entrepa = new Preferencia(2, "Entrepa");
		
		System.out.println(provaHash.add(entrepa));
		
		System.out.println(provaHash.contains(entrepa));
		
		System.out.println(provaHash);
		
		System.out.println("El conjunt conté un total de: " + provaHash.size() + " elements.");
		
		System.out.println(provaHash.remove(paella));
		System.out.println(provaHash);
		
		System.out.println(provaHash.isEmpty());
	}
	
	/*Exercici 12*/
	
	public void provesHashSet2() {
		
		HashSet<Preferencia2> provaHash = new HashSet<>();
		
		Preferencia2 paella = new Preferencia2(1, "Paella");
		
		System.out.println(provaHash.add(paella));
		
		Preferencia2 paella2 = new Preferencia2(1, "Paella");
		
		System.out.println(provaHash.add(paella2));
		
		Preferencia2 entrepa = new Preferencia2(2, "Entrepa");
		
		System.out.println(provaHash.add(entrepa));
		
		System.out.println(provaHash.contains(entrepa));
		
		System.out.println(provaHash);
		
		System.out.println("El conjunt conté un total de: " + provaHash.size() + " elements.");
		
		System.out.println(provaHash.remove(paella));
		System.out.println(provaHash);
		
		System.out.println(provaHash.isEmpty());
	}
	
}
