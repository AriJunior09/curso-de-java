package operacoes;

import java.util.Scanner;

import entidade.Impostos;

public class Program01 {
	  /* _______________ Calculadora de impostos ICMS e IPI____________________ 
	     Insira o valor inicial em (R$), os percentuais de ICMS e o IPI e o 
	     programa mostra os valores de cada imposto em (R$).               */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Impostos ope = new Impostos();
		
		System.out.print("Digite o valor: R$ ");
		ope.a = sc.nextDouble();
		System.out.print("Digite o ICMS(%): ");
		ope.b = sc.nextDouble();
		System.out.print("Digite o IPI(%): ");
		ope.c = sc.nextDouble();

		System.out.println(ope.toString());
				
		
		sc.close();

	}

}
