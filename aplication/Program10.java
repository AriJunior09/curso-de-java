package aplication;

import java.util.Scanner;

import entidade.Pensionato;

public class Program10 {
    /* Esse programa pede ao usuário a quantidade de quartos a serem alugados e depois disso pede /
    / o nome, e-mail e número do quarto. Por fim é mostra a lista de quartos ocupados com o número/ 
	/ o nome e o e-mail do hospede.  */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de quartos:");
		int n = sc.nextInt();

		Pensionato[] vetor = new Pensionato[10];
		
		
		for (int i=1; i<=n; i++){
			sc.nextLine();
			System.out.println();
			System.out.println("Reserva: #" + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Número do quarto: ");
			int numQuarto = sc.nextInt();
			vetor[numQuarto] = new Pensionato(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i<10; i++){
			if (vetor[i] != null) {
				System.out.println(i +": "+ vetor[i]);
			}
		}
		
		sc.close();

	}

}