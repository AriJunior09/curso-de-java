package entidade;

public class C17_ItemPedido {
	private Integer quantidade;
	private Double preco;
	
	private C17_Produto produto;
	
	public C17_ItemPedido() {
	}

	public C17_ItemPedido(Integer quantidade, Double preco, C17_Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public C17_Produto getProduto() {
		return produto;
	}

	public void setProduto(C17_Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		return produto.getNome() 
				+ ", R$" 
				+ String.format("%.2f", preco) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Subtotal: R$" 
				+ String.format("%.2f", subTotal());
	}

	

}