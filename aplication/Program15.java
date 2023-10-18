package aplication;

import java.util.Scanner;

public class Program15 {
/* O Programa cria uma Matriz conforme a necessidade do usuário pergunta qual
 *  o valor ele deseja procurar na Matriz e retorna a Posição desse valor ou 
 *  índice, em seguida mostra também os números que estão ao seu redor, em cima,
 *  embaixo, à direita e a esquerda. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int linhas = sc.nextInt();   //Insira a quantidade de linhas

		System.out.print("Colunas: ");
		int colunas = sc.nextInt();  //Insira a quantidade de colunas

		int[][] matriz = new int[linhas][colunas]; //Criando a Matriz
        System.out.println("Insira os valores: ");

		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				matriz[i][j] = sc.nextInt();       // Inserindo os valores da Matriz
			}
		}
		System.out.println();
		System.out.print("Qual o número deseja procurar?: ");
		int x = sc.nextInt();    // Inserindo o valor que vamos procurar na Matriz
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == x) {
                    // Para trazer a posição exata do valor é so chamar o "i" e o "j"
					System.out.println("Posição [" + i + "] , [" + j + "]:");
					if (i > 0) {
						// Para trazer o valor de cima é só diminuir uma linha
						System.out.println("Em cima: " + matriz[i-1][j]);
					}
					if (i < matriz.length-1) {
						// Para trazer o valor de baixo é só aumentar uma linha
						System.out.println("Embaixo: " + matriz[i+1][j]);
					}
					if (j < matriz[i].length-1) {
						// Para trazer o valor da direita é só aumentar uma coluna
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (j > 0) {
						// Para trazer o valor da esquerda é só diminuir uma coluna
						System.out.println("Esqueda: " + matriz[i][j-1]);
					}
				System.out.println();	
				}
                
			}
		}
		
		sc.close();

	}

}