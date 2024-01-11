package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.C18_Triangulo;

public class Program18 {
    /* Esse Programa pede os lados de dois triângulos e depois diz qual o 
       triangulo que tem a maior área. Pastas usadas: Program08 no pacote aplication e pasta C18_Triangulo no pacote entidade*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		C18_Triangulo x, y;
		x = new C18_Triangulo();
		y = new C18_Triangulo();
		
		System.out.println("Entre com as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do Triangulo X: %.4f%n", areaX);
		System.out.printf("Área do Triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área é: X");
		}
		else {
			System.out.println("Maior área é: Y");
		}
		
		
		sc.close();
	}

}
