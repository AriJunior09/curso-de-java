package ex01;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int i;

			for (i = 1; i <= n; i++){
			    int primeiro = i;
			    int segundo = i * i;
			    int terceiro = i * i * i;

			    System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

			}

			
			sc.close();
        }
     
    }
	
}
