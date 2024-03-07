package aplication;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        StringBuilder invertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString();
    }
}
