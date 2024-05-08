package pacote01;

import java.util.Scanner;

public class Classe01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do Aluno: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Cor: ");
		String cor = sc.nextLine();
		System.out.print("Sexo: ");
		String sexo = sc.next();
		
		Aluno aluno = new Aluno(nome, idade, cor, sexo);
		
		System.out.println(aluno);
		
		sc.close();
	}

}
