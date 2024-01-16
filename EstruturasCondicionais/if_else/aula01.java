package if_else;

import java.util.Scanner;

public class aula01 {
    // ------------------   USANDO IF E ELSE   ----------------------//

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 à 9: ");
        int n = sc.nextInt();
    	
    	if (n < 4) {
    		System.out.println("Seu número está entre 1 e 3.");
    	}
        else if( n < 7 ){
            System.out.println("Seu número está entre 4 e 6.");
        }
        else if( n == 7 ){
            System.out.println("Seu número é 7.");
        }
        else if( n > 7 ){
        System.out.println("Seu número está entre 8 e 9.");
        }

        sc.close();
    	
    }
}