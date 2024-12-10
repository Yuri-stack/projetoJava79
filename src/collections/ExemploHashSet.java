package collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {

		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<String> setFrutas = new HashSet<String>();
		
		NavigableSet<String> setFrutas2 = new TreeSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/**
		 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
		 * foram inseridos apenas uma vez
		 */
		System.out.println("\nDados da Collection: " + setFrutas);
		
		
		for (String fruta : setFrutas) {
			if (fruta != null)
				System.out.println("O Hashcode do Elemento " + fruta + " é " + fruta.hashCode());
		}
		
	}

}
