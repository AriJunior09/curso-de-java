package aplication;

import java.util.Scanner;

import util.Program07B;

public class Program07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Program07B prog = new Program07B();
		
		System.out.print("Qual o preço do dollar?: ");
		prog.dollar = sc.nextDouble();
		System.out.print("Quantos dollares você quer comprar?: $");
		prog.reais = sc.nextDouble();
		double conv = prog.converter(prog.dollar, prog.reais);
		double taxa = prog.taxa(conv, prog.IOF);
				
		
		System.out.println("A compra final fica por: R$ " + prog.compraFinal(conv, taxa));

	
		sc.close();

	}

}
