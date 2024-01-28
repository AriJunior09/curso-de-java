package estruturasSequencial;

import java.util.Scanner;

public class Ex04B {

	public static void main(String[] args) {
		/*  Programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
            hora e calcula o salário desse funcionário. */

		Scanner sc = new Scanner(System.in);
		double horas, valorHr, salario;
		
		System.out.print("Número do Fucionário: ");
		int num = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Qual o valor da hora? R$ ");
		valorHr = sc.nextDouble();
		
		salario = CalcSalario(horas, valorHr);
		
		System.out.println("O funcionário de inscrição: " + num + " vai ter um salário de: ");
		System.out.printf("R$ %.2f%n", salario);
		
		
		sc.close();
	}
	
	public static double CalcSalario(double horas, double valorHr) { // Metodo para calcular o salario
		return horas * valorHr;
	}
}
