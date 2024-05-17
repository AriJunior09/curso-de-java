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
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Aqui temos uma String");
		listaGenerics.add("Elemento 2");
		listaGenerics.add("Abacaxi tem um sabor delicioso");

		List<Integer> listaGenerics02 = new ArrayList<>();
		listaGenerics02.add(337);
		listaGenerics02.add(369);
		listaGenerics02.add(1991);

		// Interando sobre a lista com Generics
		System.out.println("\nElementos da Lista de Genericos Tipo String: ");
		for (String elemento: listaGenerics) {
			System.out.println(elemento);
		}

		// Interando sobre a lista com Generics02
		System.out.println("\nElementos da Lista de Genericos Tipo Integer: ");
		for (Integer elemento: listaGenerics02) {
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
