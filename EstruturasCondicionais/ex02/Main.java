package ex02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;  /// Criando a variável hora para receber um valor.
		
		System.out.println("Que horas?"); /// Dependendo do valor o usuário recebe 3 possíveis respostas.
		hora = sc.nextInt();                /// Recebendo o valor da variável "hora".
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora <= 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}

}

