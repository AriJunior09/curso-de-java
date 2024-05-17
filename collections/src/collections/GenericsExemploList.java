package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsExemploList {

	public static void main(String[] args) {
		// Exemplo sem Generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 01");
		listaSemGenerics.add(10);// Permite add qualquer tipo de obj
		
		// Exemplo com Generics
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento A");
		listaGenerics.add("Elemento B");
		
		// Interando sobre a lista com Generics
		for (String elemento: listaGenerics) {
			System.out.println(elemento);
		}
		
		// Interando sobre a lista sem Generics(necessário fazer o cast)
		for (Object elemento: listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
		

	}

}
