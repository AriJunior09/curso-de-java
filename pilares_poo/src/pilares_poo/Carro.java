package pilares_poo;

public class Carro {
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("Carro Ligado!");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel!");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo Câmbio em P!");
	}
}
