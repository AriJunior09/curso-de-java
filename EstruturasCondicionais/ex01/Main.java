package ex01;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o número: ");
			int n = sc.nextInt();
			int i;

			for (i = 1; i <= n; i++){
			    int primeiro = i;         // Mostra o valor 
			    int segundo = i * i;      // Mostra o quadrado 
			    int terceiro = i * i * i; // Mostra o cubo 
				
			    System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

			}
			
			sc.close();
        }
     
    }
	
}
