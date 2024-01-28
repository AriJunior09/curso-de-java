package ifElse;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/** O programa vai pedir ao usuário para digitar uma hora e a partir daí mostrará 3    possíveis respostas:
        * BOM DIA, (se a hora for menor que 12);
        * BOA TARDE, (se a hora estiver entre 12 e 18);
        * BOA NOITE, (se a hora for acima de 18); */
		
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

