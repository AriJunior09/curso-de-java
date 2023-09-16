package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Pragram05 {
   // Adiciona produtos e remove produtos //
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos p = new Produtos();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produtos produtoX = new Produtos(nome, preco, quantidade);
		
		System.out.println("Dados: " + produtoX);		
		System.out.println();
		System.out.print("Entre com o número de produtos para adicionar: ");
		
		quantidade = sc.nextInt();
		produtoX.adicionaProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtoX);
		
		System.out.println();
		System.out.print("Entre com o número de produtos para remover: ");
		
		quantidade = sc.nextInt();
		produtoX.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtoX);
		
		
				
		sc.close();

	}

}
