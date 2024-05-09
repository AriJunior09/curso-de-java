package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		// Ações que o estabelecimento precisa ter ciência:
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarVitaminaNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();		
		atendente.receberPagamento();

		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
			
	}
}
