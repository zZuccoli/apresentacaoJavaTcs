
public class Negocio {
	private int quantidade;
	private Produto produto;
	
	public Negocio(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
