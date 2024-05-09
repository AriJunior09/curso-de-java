package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("Escolhendo o Lanche");
	}
	
	public void fazerPedido() {
		System.out.println("Fazendo Pedido");
	}
	
	public void pagarConta() {
		consultandoSaldoAplicativo();
		System.out.println("Pagando a Conta");
	}
	
	private void consultandoSaldoAplicativo() {
		System.out.println("Consultando Saldo no App");
	}
}

