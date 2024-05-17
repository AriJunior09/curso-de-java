package collections;

import java.util.HashSet;
import java.util.Set;

public class GenericsExemploSet {

	public static void main(String[] args) {
		// Exemplo sem Generics
		Set conjuntoSemGenerics = new HashSet();
		conjuntoSemGenerics.add("Elemento 01");
		conjuntoSemGenerics.add(10); // Permite add qualquer tipo de obj

		// Exemplo com Generics
		Set<String> conjuntoGenerics = new HashSet<>();
		conjuntoGenerics.add("Elemento A");
		conjuntoGenerics.add("Elemento B");

		// Interando sobre a conjunto com Generics
		for (String elemento: conjuntoGenerics) {
			System.out.println(elemento);
		}

		// Interando sobre o conjunto sem Generics(necessário fazer o cast)
		for (Object elemento: conjuntoSemGenerics) {
			String str = elemento.toString();
			System.out.println(str);
		}

	}

}
