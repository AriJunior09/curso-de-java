package entidade;

public class ContaBancaria {
	private int numero;
	private String nome;
	private double saldo;
	
	// Construtor Padrão
	public ContaBancaria() {   
	}
	
	// Construtor de Sobrecarga, Caso o Cliente NÃO tenha valor inicial para deposito// 
		public ContaBancaria(int numero, String nome) {
			this.numero = numero;
			this.nome = nome;
		}
	
	// Construtor de Sobrecarga completo // 
	public ContaBancaria(int numero, String nome, double valorInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(valorInicial);
	}
	

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.00;
	}
	
	public String toString() {
		return "Número da conta: " 
				+ numero
				+ ", Nome: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", getSaldo());
				
		}
}