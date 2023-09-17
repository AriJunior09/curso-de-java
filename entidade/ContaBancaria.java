package entidade;

public class ContaBancaria {

	private int numero;
	private String nome;
	private double saldo;
	
	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public ContaBancaria(int numero, String nome, double depInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depInicial);
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

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "\nConta nº: "
				+ numero
				+ "\nNome: "
				+ nome.toUpperCase()
				+ "\nSaldo: R$ "
				+ String.format("%.2f", saldo);
	}
}