package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;

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
