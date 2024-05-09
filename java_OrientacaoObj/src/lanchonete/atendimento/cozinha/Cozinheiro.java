package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando o Pão, Salada, Ovo e Carne");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando o Fruta, Leite, Açucar e Água");
	}
	
	private void lavarIngredientes() {
		selecionarIngredientesLanche();
		System.out.println("Lavando Ingredientes");
	}
	
	private void fritarIngredientesLanche() {
		lavarIngredientes();
		System.out.println("Fritando Ovo e Carne para o Hamburguer");
	}
	
	private void prepararLanche() {
		fritarIngredientesLanche();
		System.out.println("Preparando Lanche tipo Hamburguer");
	}
	
	private void prepararVitamina() {
		selecionarIngredientesVitamina();
		System.out.println("Preparando Vitamina");
	}
	
	
	private void PrepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	// Pode ser defaut
	public void adicionarLancheNoBalcao() {
		prepararLanche();
		
		System.out.println("Adicionando Lanche natural Hamburguer no balcão");
	}
	// Pode ser defaut
	public void adicionarVitaminaNoBalcao() {
		prepararVitamina();
		System.out.println("Adicionando Vitamina no balcão");
	}
	// Pode ser defaut
	public void adicionarComboNoBalcao() {
		PrepararCombo();
	}

}
