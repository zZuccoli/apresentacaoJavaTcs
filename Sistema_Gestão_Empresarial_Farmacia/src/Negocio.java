
public class Negocio {
	private int quantidade;
	private Produto produto;
	
	public Negocio(int quantidade, Produto produto) {
		setQuantidade(quantidade); //validação da quantidade
		setProduto(produto);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) { //quantidade > 0
		try {
			if (quantidade < 0) {
				throw new Exception("Quantidade deve ser maior que zero");
			}
			this.quantidade = quantidade;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
