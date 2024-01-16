package switch_case;

import java.util.Scanner;

public class aula02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um código de operação (1 para Adição, 2 para Subtração): ");
        int codigoOperacao = sc.nextInt();

        realizarOperacao(codigoOperacao);

        sc.close();
    }

    public static void realizarOperacao(int codigoOperacao) {
        switch (codigoOperacao) {
            case 1:
                System.out.println("Você selecionou a operação de Adição.");
                break;
            case 2:
                System.out.println("Você selecionou a operação de Subtração.");
                break;
            default:
                System.out.println("Código de operação inválido.");
        }
    }
}
