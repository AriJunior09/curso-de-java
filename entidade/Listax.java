package entidade;

public class Listax{
	private Integer cod;
	private String nome;
	private Double valor;
	
	public Listax() {
		
	}
	

	public Listax(Integer cod, String nome, Double valor) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.valor = valor;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Código : " 
				+ cod
				+ ", Produto: "
				+ nome
				+ ", Valor: R$ "
				+ String.format("%.2f%n", valor);
				
	}
	
}