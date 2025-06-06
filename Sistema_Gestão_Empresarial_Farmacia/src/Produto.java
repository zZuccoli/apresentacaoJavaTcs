
public class Produto {
	private String nome;
	private int idProduto;
	private double precoCusto;
	private double precoVenda;
	private int quantidadeEstoque;
	
	
	Produto(){
		
	}
	
	Produto(String nome, int idProduto, double precoCusto, double precoVenda, int quantidadeEstoque){
		this.nome = nome;
		this.idProduto = idProduto;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.quantidadeEstoque=quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
