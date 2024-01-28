package revisao.secao04;

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
	
					/* OUTRA FORMA É USANDO O METODO "CalcSalario" NÃO ESTATICO: 
	 
	public static void main(String[] args) {
														
		Scanner sc = new Scanner(System.in);
		double horas, valorHr, salario;
		Ex04B instancia = new Ex04B();             // Criando uma Instancia para método não estático
		
		System.out.print("Número do Fucionário: ");
		int num = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Qual o valor da hora? R$ ");
		valorHr = sc.nextDouble();
		
		salario = instancia.calcSalario(horas, valorHr);    // Chamando a Instancia
		
		System.out.println("O funcionário de inscrição: " + num + " vai ter um salário de: ");
		System.out.printf("R$ %.2f%n", salario);
		
		
		sc.close();
	}
	
	public double calcSalario(double horas, double valorHr){ // Metodo não estatico para calcular
		return horas * valorHr;
	} */
    
}
