package entidade;

public class C13Lista {

	private Integer cod;
	private String nome;
	private Double salario;
	
	public C13Lista() {
		
	}
	
	public C13Lista(Integer cod, String nome, Double salario) {
		this.cod = cod;
		this.nome = nome;
		this.salario = salario;
	}

	
	public Integer getCod() {
		return cod;
	}


	public void setCod(Integer cod) {
		this.cod = cod;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double percentual) {
		salario += salario * percentual / 100;
		
	}


	@Override
	public String toString() {
		return "\nCódigo: " 
				+ cod 
				+ "\nNome: " 
				+ nome 
				+ "\nSalário: R$ " 
				+ String.format("%.2f%n", salario);
	}
	
		
}
