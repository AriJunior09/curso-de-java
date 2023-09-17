package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.ContaBancaria;

public class Program08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;

		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Você vai fazer um depósito inicial(s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, depInicial);
		}
		else {
			conta = new ContaBancaria(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do Depósito: ");
		double depValor = sc.nextDouble();
		conta.deposito(depValor);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do Saque: ");
		double saqValor = sc.nextDouble();
		conta.saque(saqValor);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		sc.close();
	}
}