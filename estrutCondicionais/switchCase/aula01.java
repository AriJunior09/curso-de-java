package switchCase;

import java.util.Scanner;

public class aula01 {
    // ------------------- SWITCH CASE - DIAS DA SEMANA -------------------- //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numeroDia = scanner.nextInt();

        String nomeDia = obterNomeDia(numeroDia);

        if (nomeDia != null) {
            System.out.println("O dia correspondente é: " + nomeDia);
        } else {
            System.out.println("Número de dia inválido.");
        }

        scanner.close();
    }


    public static String obterNomeDia(int numeroDia) {
        String nomeDia;

        switch (numeroDia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = null;
        }

        return nomeDia;
    }
}
