package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.C13Lista;

/* Esse programa pede a quantidade de Funcionários que será cadastrado, após isso pede o código, verifica se o código já foi usado antes, pede o nome e o salário do Funcionário, logo após isso pede o código do Funcionário que terá um aumento de salário e o percentual do aumento e por fim mostra todos os dados na tela, caso o código digitado seja inválido ele trás os dados sem alterações */

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas:");
		int n = sc.nextInt();               // Insere a quantidade de pessoas que será cadastradas
		
		List<C13Lista> list = new ArrayList<C13Lista>();
		
		for (int i=0; i<n; i++){            // Cria um for que percorre toda o tamanho da lista "n"
			sc.nextLine();
			System.out.println("Funcionário: # " + (i+1) + ":");
			System.out.print("cod: "); 
			Integer cod = sc.nextInt();     // Inserimos o Código do Funcionário
			while (existeCod(list, cod)) {  // chamamos uma função para verificar se o código já existe
				System.out.print("Esse código já existe! tente outro: ");
				cod = sc.nextInt();         // Caso seja inserido um código novo ele será salvo
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();    // Inserimos o Nome do Funcionário
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();// Inserimos o Salário do Funcionário
			C13Lista funcionario = new C13Lista(cod, nome, salario);
			list.add(funcionario);           // Adicionamos os dados em uma lista
			System.out.println();
		}
		
		System.out.print("Entre com o código do Funcionário que terá aumento de salário: ");
		int codSalario = sc.nextInt();      // Inserimos o Código do Funcionário que terá aumento
		C13Lista emp = list.stream().filter(x -> x.getCod() == codSalario).findFirst().orElse(null);
        // Verifica se o código é válido, caso não seja retorna "null"
		
		
		if (emp == null) {
			System.out.println("Código não existe!"); // Caso não exista Funcionário com esse código os valores não serão alterados
		}
		else {
			System.out.print("Entre com o percentual de aumento:"); // Caso exista esse código pede-se o pecentual %
			double percent = sc.nextDouble();                         // Inserimos o valor
			emp.aumentoSalario(percent);                              // Chamamos a função "aumentoSalario" que está na pasta 'C13Lista'.
		}	
		
		System.out.println(list);
		
		sc.close();

	}
	// Criamos uma função para verifiar se o código já existe na lista
	public static boolean existeCod(List<C13Lista> list, int cod) {
		C13Lista emp = list.stream().filter(x -> x.getCod() == cod).findFirst().orElse(null);
        /*  Na lista usamos o Stream para adicionar um predicado tipo lambda para filtrar dentre os códigos qual //
        // o primeiro é igual o que foi digitado e caso não tenha nenhum é porque estava nulo  */
		return emp != null;
        // Caso tenha um código então será diferente de nulo
	}

}
