package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		pegarPedidoBalcao();
		System.out.println("Servindo a Mesa");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando o Lanche na Cozinha");
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo o Pagamento");
	}
	
	void trocarGas() {
		System.out.println("Atendente trocando o Gas");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o Pedido no Balcao");
	}	
}
