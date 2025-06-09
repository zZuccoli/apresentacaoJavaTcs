
public class Produto {
	private String nome;
	private static int proximoId = 1;
	private final int idProduto;
	private double precoCusto;
	private double precoVenda;
	private int quantidadeEstoque;
	
	
	Produto(){
		this.nome = "";
		this.idProduto = proximoId++;
		this.precoCusto = 0.0;
		this.precoVenda = 0.0;
		this.quantidadeEstoque = 0;
	}	

	Produto(String nome, double precoCusto, double precoVenda, int quantidadeEstoque){
		this.idProduto = proximoId++;
		setNome(nome); //validação de espaços vazios
		setPrecoCusto(precoCusto); //validação de preço de custo
		setPrecoVenda(precoVenda); //validação de preço de venda
		setQuantidadeEstoque(quantidadeEstoque); //validação de quantidade em estoque
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		try {
			if(nome.trim().isEmpty()) {
				throw new Exception("Nome não pode ser vazio");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.nome = nome;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		try {
			if(precoCusto <= 0) {
				throw new Exception("Preço de custo não pode ser menor ou igual a zero");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		try {
			if(precoVenda <= 0) {
				throw new Exception("Preço de venda não pode ser menor ou igual a zero");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.precoVenda = precoVenda;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		try {
			if(quantidadeEstoque < 0) {
				throw new Exception("Quantidade em estoque não pode ser menor que zero");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
