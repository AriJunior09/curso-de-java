package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");    // Adicionando "Maria" na posição 0 da lista;
		list.add("Alex");     // Adicionando "Alex"  na posição 1 da lista;
		list.add("Bob");      // Adicionando "Bob"   na posição 2 da lista;
		list.add("Anna");     // Adicionando "Anna"  na posição 3 da lista;
		list.add("Ari");	    // Adicionando "Ari"   na posição 4 da lista;
		System.out.println("Tamanho da Lista: " + list.size()); // Mostra o tamanho da Lista;		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------");
		
		list.add(2, "Mario"); // Adicionando "Mario" na posição 2(depois do Alex);
		System.out.println("Tamanho da Lista: " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------");
		
		list.remove("Anna");  // Remove a "Anna" da lista(compara pelo nome);
		list.remove(0);       // Remove "Maria" da lista(compara pela posição;
		System.out.println("Tamanho da Lista: " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Removendo nomes que começam com "M"
		System.out.println("Tamanho da Lista: " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------");
		System.out.print("Posição de Bob: ");
		System.out.println(list.indexOf("Bob")); // IndexOf mostra o índice;
		
		System.out.println("--------------");
		/* Criando uma nova lista / Transformando ela em Stream/ add um filtro para pegar as pessoas que 
		começao com "A" e depois usando o collect para converter novamente a stream e lista com ajuda do tolist*/
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String s : resultado) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		/*Criando uma String "name" transformando */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
