package estruturaSequencial;

import java.util.Scanner;

public class Ex02C {

public static final double PI = 3.14159;
	
	public static void main(String[] args) {
    // Ler o raio de um círculo e depois mostra a área.
    // Fórmula da área: area = π . raio^2		
		
		Scanner sc = new Scanner(System.in);
		
		Ex02C instancia = new Ex02C();  // Criando uma instancia da Classe(Quando o método não é static).
		
		System.out.print("Digite o valor do raio: "); 
		double raio = sc.nextDouble();    // Criando a variavel "raio" e add o valor digitado nele.
		double area = instancia.areaCirculo(raio); // Criando a var. "area" e chamando a instância, Só depois de chamar a instancia que é possível chamar o método.
		
		System.out.printf("A Área do círculo é: %.4f%n", area); // Mostrando na tela
		
		sc.close();	

	}
	
	public double areaCirculo(double raio){  // Criando o metodo para calcular a area.
		return PI * (raio * raio);  // Formula para descobrir a área
		
	}

}
