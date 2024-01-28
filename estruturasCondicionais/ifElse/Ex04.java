package ifElse;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
		/*  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 *  sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
		 *  mínima de 1 hora e máxima de 24 horas*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial");
		int inicio = sc.nextInt();
		System.out.println("Digite a hora final");
		int fim = sc.nextInt();
		
		if (inicio < fim) {
			int duracao = fim - inicio;
			System.out.println("A duração foi de: " + duracao);
		}
		else {
			int duracao = 24 - inicio + fim;
			System.out.println("A duração foi de: " + duracao);
		}

		
		sc.close();

	}
}
