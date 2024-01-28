package estruturasSequencial;

import java.util.Scanner;

public class Ex04A {

	public static void main(String[] args) {
		/*  Programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
            hora e calcula o salário desse funcionário. */

		Scanner sc = new Scanner(System.in);
		double horas, valorHora, salario;
		
		System.out.print("Número do Fucionário: ");
		int num = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Qual o valor da hora? R$ ");
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("O funcionário de inscrição: " + num + " vai ter um salário de: ");
		System.out.printf("R$ %.2f%n", salario);
		
		
		sc.close();

	}

}