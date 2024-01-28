package ifElse;
import java.util.Scanner;

public class Ex01 {
   
    public static void main(String[] args) {
		// Usuário digita um numero e o programa mostra o quadrado e o cubo desse valor 
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
