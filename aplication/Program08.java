package aplication;

import java.util.Scanner;

import entidade.ContaBancaria;

public class Program08 {
	/* Este programa simula a funcionalidade de abertura de uma conta bancária, incluindo a atribuição de um número de /
	/  conta, nome do titular e um depósito inicial. Após essa etapa, ele exibe o saldo atual da conta e permite a     /
	/  realização de depósitos e saques, garantindo que o saldo seja sempre atualizado após cada operação.            */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Vai fazer um depósito inicial (s/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 's') {
			System.out.print("Digite o valor inicial: ");
			double valorInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, valorInicial);
		}
		else {
			conta = new ContaBancaria(numero, nome);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: R$ ");
		double depValor = sc.nextDouble();
		conta.deposito(depValor);
		System.out.println();
		System.out.println("Dados Atualizado da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor o saque: R$ ");
		double saqValor = sc.nextDouble();
		conta.saque(saqValor);
		System.out.println();
		System.out.println("Dados Atualizado da conta:");
		System.out.println(conta);
		
				
		
		sc.close();

	}

}
