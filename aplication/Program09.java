package aplication;

import java.util.Scanner;

public class Program09 {
	/* Esse programa pergunta ao usuário a quantidade de números que ele deseja digitar e após isso
    pede para o usuário para digitar os números desejados, por fim o programa mostra os números pares e 
    o total de números pares. Nesse programa é usado "vetores" para praticar os exercicios do curso de Java */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números quer digitar?: ");
		int n = sc.nextInt();           // Pega um número que será o tamanho do vetor
		double[] vetor = new double[n]; // Cria o vetor de acordo com o tamanho que foi digitado anteriormente
		for (int i=0; i<n; i++) {       // Percorrendo o vetor do índice zero até o fim
			sc.nextLine();              // Quebra de linha
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();    // Usuário insere os valores desejados
			
		}
		
		System.out.print("Números pares: ");
		int Totalpares = 0;                 // Iniciando uma variável "Totalpares" que servirá para colocar a soma
		for (int i=0; i<n; i++) {           // Percorrendo o vetor do índice zero até o fim
			if (vetor[i] %2 == 0) {         // Condição para ver se o número é par
				System.out.print(vetor[i]); // Mostra o valor do número par
				System.out.print(" | ");  // Separador de números/índices
				Totalpares ++;   	        // Somando os números pares
			}
			
		}
		
		System.out.println();
		System.out.println("Total de pares: " + Totalpares);
		
		sc.close();

	}

}