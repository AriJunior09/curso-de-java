package aplication;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Linhas: ");
		int qtLinhas = sc.nextInt(); // Pergunta a quantidade de linhas da Matriz

		System.out.print("Colunas: ");
		int qtColunas = sc.nextInt(); // Pergunta a quantidade de colunas da Matriz

		int[][] mat = new int[qtLinhas][qtColunas]; // Cria a matriz de acordo com dados inseridos

		for (int i = 0; i < mat.length; i++) { // Também pode ser: i<qtLinhas
			for (int j = 0; j < mat[i].length; j++) { // Também pode ser: j<qtColunas
				mat[i][j] = sc.nextInt(); // Recebe o valor do primeiro indice
			}
		}
		System.out.println();

		System.out.println("Mostrando a Matriz:");
		for (int i = 0; i < qtLinhas; i++) {
			for (int j = 0; j < qtColunas; j++) {
				System.out.print(mat[i][j]);
				System.out.print("    ");

			}
			System.out.println();
		}

		int contNegativo = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) { // Se o número for negativo...
					contNegativo++; // Somar mais um.
				}
			}
		}
		System.out.println();
		System.out.println("Números negativos: " + contNegativo);

		sc.close();

	}
}