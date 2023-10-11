package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.C13Lista;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas:");
		int n = sc.nextInt();
		
		List<C13Lista> list = new ArrayList<C13Lista>();
		
		for (int i=0; i<n; i++){
			sc.nextLine();
			System.out.println("Funcionário: # " + (i+1) + ":");
			System.out.print("cod: ");
			Integer cod = sc.nextInt();
			while (existeCod(list, cod)) {
				System.out.print("Esse código já existe! tente outro: ");
				cod = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			C13Lista funcionario = new C13Lista(cod, nome, salario);
			list.add(funcionario);
			System.out.println();
		}
		
		System.out.print("Entre com o código do Funcionário que terá aumento de salário: ");
		int codSalario = sc.nextInt();
		C13Lista emp = list.stream().filter(x -> x.getCod() == codSalario).findFirst().orElse(null);
		
		
		if (emp == null) {
			System.out.println("Código não existe!");
		}
		else {
			System.out.print("Entre com o percentual de aumento:");
			double percent = sc.nextDouble();
			emp.aumentoSalario(percent);
		}	
		
		System.out.println(list);
		
		sc.close();

	}
	
	public static Integer posicao(List<C13Lista> list, int cod) {
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).getCod() == cod) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean existeCod(List<C13Lista> list, int cod) {
		C13Lista emp = list.stream().filter(x -> x.getCod() == cod).findFirst().orElse(null);
		return emp != null;
	}

}
