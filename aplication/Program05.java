package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Program05 {
   /* Esse Programa pede ao Usuário os dados do produto(Nome, Preço e Quantidade) e mostra os dados na tela
      junto com o valor total em estoque, depois pede ao usuário uma quantidade para adicionar no estoque,
	  após isso mostra os dados atualizado e por fim pede a quantidade para remover do estoque e depois mostra 
	  novamente os dados atualizados */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		// Abaixo estou usando a classe "Produtos" que está no pacote "entidades" nesse mesmo repositorio //
		Produtos produtoX = new Produtos(nome, preco, quantidade); 

		produtoX.setNome("Celular");         // Usando método setNome para mudar o nome do produto //
		System.out.println("Nome atualizado: " + produtoX.getNome());  // Usando o método getNome para motrar o nome atualizado //

		
		produtoX.setPreco(2000.00);         // Usando método setPreço para mudar o valor do produto //
		System.out.println("Preço atualizado: " + produtoX.getPreco());  // Usando o método getPreço para motrar o valor atualizado //
		
		System.out.println("Dados: " + produtoX); // Mostrando os dados  //
		System.out.println();
		System.out.print("Entre com o número de produtos para adicionar: ");
		
		quantidade = sc.nextInt();
		produtoX.adicionaProdutos(quantidade); // Adicionando quantidade no estoque //
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtoX); // Mostrando dados atualizados //
		
		System.out.println();
		System.out.print("Entre com o número de produtos para remover: ");
		
		quantidade = sc.nextInt();
		produtoX.removeProdutos(quantidade); // Removendo a quantidade do estoque //
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtoX);  // Mostrando dados atualizados //
		
		
				
		sc.close();

	}

}
