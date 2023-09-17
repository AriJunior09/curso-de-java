package entidade;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;

	public Produtos() {
		
	}
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public double getPreco(){
		return preco;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public int getQuantidade(){
		return quantidade;
	}

	public double totalValorDoEstoque() {
		return preco * quantidade;
	}
	
	public void adicionaProdutos(int quantidade){
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Produto: " 
				+ nome.toUpperCase()
				+ ", Preço: R$ "
				+ String.format("%.2f", preco)
				+ ", Quantidade: "
				+ quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f", totalValorDoEstoque());
	}
}
