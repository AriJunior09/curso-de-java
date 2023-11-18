package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.C17_Cliente;
import entidade.C17_Pedido;
import entidade.C17_ItemPedido;
import entidade.C17_Produto;
import entidadeEnum.StatusPedido;

public class Program17 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Data de aniversário(DD/MM/AAAA): ");
		
		Date aniversario = sdf.parse(sc.next());
		C17_Cliente cliente = new C17_Cliente(nome, email, aniversario);
		
		System.out.println("Digite os dados do Pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		C17_Pedido pedido = new C17_Pedido(new Date(), status, cliente, null);
		
		System.out.print("Quantos itens deseja adicionar ao Pedido?: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do " + i + "º item:");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double precoProd = sc.nextDouble();
			
			C17_Produto produto = new C17_Produto(nomeProd, precoProd);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			C17_ItemPedido itemPedido = new C17_ItemPedido(quantidade, precoProd, produto);
			
			pedido.addItem(itemPedido);
			
		}
		
		System.out.println();
		System.out.println("Resumo do Pedido:");
		System.out.println(pedido);
		
		sc.close();

	}

}
