package estruturaSequencial;

import java.util.Scanner;

public class Ex02A {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
	// LER O RAIO DE UM CIRCULO E DEPOIS MOSTRAR O VALOR DA ÁREA DO CÍRCULO	COM 4 CASAS DECIMAIS 
	// Fórmula da área: area = π . raio2	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: "); 
		double raio = sc.nextDouble();    // Pegando o valor do raio e add ele na variavel "raio"
		double area = PI * (raio * raio); // Formula para calcular a área de um circulo
		
		System.out.printf("A Área do círculo é: %.4f%n", area); // Mostrando na tela
		
		sc.close();		
		
	}

}