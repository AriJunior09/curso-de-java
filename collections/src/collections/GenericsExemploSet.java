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
		Set<String> ConjuntoGenerics = new HashSet<>();
		ConjuntoGenerics.add("Elemento A");
		ConjuntoGenerics.add("Elemento B");

		// Interando sobre a conjunto com Generics
		for (String elemento: ConjuntoGenerics) {
			System.out.println(elemento);
		}

		// Interando sobre o conjunto sem Generics(necessário fazer o cast)
		for (Object elemento: conjuntoSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}

	}

}
