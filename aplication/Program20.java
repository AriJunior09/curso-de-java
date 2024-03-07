package aplication;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numero)) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número informado NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int num) {
        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }
}
