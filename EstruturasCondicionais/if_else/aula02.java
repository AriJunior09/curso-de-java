package if_else;

import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {

        /*___________________    2 NOTAS DE ALUNO PARA ANALISAR    __________________________ */

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = sc.nextDouble();
        double m = media(nota1, nota2);

        if (m < 5){
            System.out.print("Sua média foi de: " + m + " e você ficou Reprovado!");
        }
        else if (m < 7){
            System.out.print("Sua média foi de: " + m + " e você ficou em Recuperação!");
        }
        else{
            System.out.print("Sua média foi de: " + m + " e você foi aprovado!");
        }

        sc.close();
    }


    public static double media(double x, double z){
        return (x + z ) / 2;
    }
    
}
