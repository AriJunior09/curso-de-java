package estruturaSequencial;

import java.util.Scanner;

public class Ex02B {

public static final double PI = 3.14159;  // Criando uma variavel constante.
	
	public static void main(String[] args) {
    // Ler o raio de um círculo e depois mostra a área.
    // Fórmula da área: area = π . raio^2	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: "); 
		double raio = sc.nextDouble();    // Criando a variavel "raio" e add o valor digitado nele.
		double area = areaCirculo(raio);  // Criando a var. "area" e chamando o metodo "areaCirculo".
		// Esse método calcula o valor da área se baseando no raio que ele pede.
		
		System.out.printf("A Área do círculo é: %.4f%n", area); // Mostrando na tela
		
		sc.close();	

	}
	
	public static double areaCirculo(double raio){  // Criando o metodo estatico para calcular a area.
		return PI * (raio * raio);  // Formula para descobrir a área
		
	}

}
