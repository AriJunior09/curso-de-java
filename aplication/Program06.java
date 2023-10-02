package aplication;

import java.util.Scanner;

import util.Program06B; // Essa classe está no pacote: util

public class Program06 {
		/* Esse programa pede o raio e mostra a circunferência e o volume desse raio */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o Raio: ");
		double raio = sc.nextDouble();
		
		double c = Program06B.circunferencia(raio);
		double v = Program06B.volume(raio);
		
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Program06B.PI);

		
		sc.close();
	}

}
