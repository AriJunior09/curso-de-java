package revisao;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resultado = 0;
		
		System.out.print("Digite um número: ");
		double x = sc.nextDouble();
		System.out.println();
		
		System.out.println("Agora escolha uma opção:"
				+ "\n2 - Dobro"
				+ "\n3 - Triplo"
				+ "\n4 - Metade"
				+ "\n5 - 1/3");
		System.out.print("Sua resposta: ");
		String escolha = sc.next();
			if (escolha.equals("2")) {
				 resultado = dobro(x);				
			} else if (escolha.equals("3")) {
				 resultado = triplo(x);				
			} else if (escolha.equals("4")) {
				 resultado = metade(x);				
			} else if (escolha.equals("5")) {
				 resultado = terco(x);
			}		
		System.out.println("O Resultado é: " + resultado);
		sc.close();

	}
	
	private static double dobro(double a){
		return a * 2;
	}
	
	private static double triplo(double a){
		return a * 3;
	}
	
	private static double metade(double a){
		return a / 2;
	}
	
	private static double terco(double a){
		return a / 3;
	}
}