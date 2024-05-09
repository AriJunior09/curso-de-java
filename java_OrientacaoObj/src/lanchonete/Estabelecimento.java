package lanchonete;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// Ações que não precisam estarem disponiveis para toda a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.fritarIngredientesLanche();
		cozinheiro.batendoVitaminaLiquidificador();		
		cozinheiro.selecionarIngredientesLanche();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.PrepararCombo();
		
		// Ações que o estabelecimento precisa ter ciência:
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarVitaminaNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		// Ações que não precisam estarem disponiveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		// Ações que somente o ser pacote cozinha precisa conhecer(default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		// Ações que somente o ser pacote cozinha precisa conhecer(default)
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
		
	}

}
