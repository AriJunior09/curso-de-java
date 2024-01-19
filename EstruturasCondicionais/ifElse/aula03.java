package ifElse;

import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {

        //---------------   ANALISANDO O TIPO DE TRIÂNGULO --------------------//
   
        Scanner sc = new Scanner(System.in);
        int r1, r2, r3;
        System.out.print("Digite o valor da Reta A: ");
        r1 = sc.nextInt();
        System.out.print("Digite o valor da Reta B: ");
        r2 = sc.nextInt();
        System.out.print("Digite o valor da Reta C: ");
        r3 = sc.nextInt();

        if (((r1 + r2) > r3) && ((r2 + r3) > r1) && ((r3 + r1) > r2)){
            System.out.println("Essas 3 retas podem formar um Triângulo!");
        
            if ((r1 == r2) && (r1 == r3) && (r2 == r3)){
            System.out.println("O Triângulo é Equilátero!");
            }
            else if ((r1 == r2 && r2 != r3) || (r2 == r3 && r2 != r1)){
            System.out.println("O Triângulo é Isósceles!");
            }
            else{
            System.out.println("O Triângulo é Escaleno!");
            }
        }
        else{
        System.out.println("Não forma um triângulo!");
        }

        sc.close();
    }
}
