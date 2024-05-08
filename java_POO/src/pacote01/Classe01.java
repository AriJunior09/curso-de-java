package pacote01;

import java.util.Scanner;

public class Classe01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		int idade = sc.nextInt();
		String cor = sc.next();
		String sexo = sc.next();
		
		Aluno aluno = new Aluno(nome, idade, cor, sexo);
		
		System.out.println(aluno);
		
		sc.close();
	}

}
