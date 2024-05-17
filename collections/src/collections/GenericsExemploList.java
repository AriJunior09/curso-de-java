package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsExemploList {

	public static void main(String[] args) {
		// Exemplo sem Generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Palavra");
		listaSemGenerics.add(10);// Permite add qualquer tipo de obj
		listaSemGenerics.add(15.09);

		// Exemplo com Generics
		List<String> listaGenericsSt = new ArrayList<>();
		listaGenericsSt.add("Aqui temos uma String");
		listaGenericsSt.add("Elemento 2");
		listaGenericsSt.add("Abacaxi tem um sabor delicioso");

		List<Integer> listaGenericsInt = new ArrayList<>();
		listaGenericsInt.add(337);
		listaGenericsInt.add(369);
		listaGenericsInt.add(1991);

		List<Double> listaGenericsDb = new ArrayList<>();
		listaGenericsDb.add(10.50);
		listaGenericsDb.add(3633.99);
		listaGenericsDb.add(14.99);

		// Interando sobre a lista com Generics
		System.out.println("\nElementos da Lista de Genericos Tipo String: ");
		for (String elemento: listaGenericsSt) {
			System.out.println(elemento);
		}

		// Interando sobre a lista com Generics02
		System.out.println("\nElementos da Lista de Genericos Tipo Integer: ");
		for (Integer elemento: listaGenericsInt) {
			System.out.println(elemento);
		}

		// Interando sobre a lista com Generics02
		System.out.println("\nElementos da Lista de Genericos Tipo Double: ");
		for (Double elemento: listaGenericsDb) {
			System.out.println(elemento);
		}

		System.out.println("\nElementos da Lista de não Genericos: ");
		// Interando sobre a lista sem Generics(necessário fazer o cast)
		for (Object elemento: listaSemGenerics) {
			String str = elemento.toString();
			System.out.println(str);
		}


	}

}
