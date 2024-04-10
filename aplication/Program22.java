package aplication;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = sc.nextInt();

    System.out.println("O número digitado foi: " + numero);

    int teste1 = numero;
    System.out.println("Teste1 = " + teste1);
    System.out.print("Digite o Teste2: ");
    int teste2 = sc.nextInt();
    System.out.println("Teste2 = " + teste2);

    int teste3 = teste1 * teste2;
    System.out.println("Teste3 = " + teste3);

    

    sc.close();


    }   
}
