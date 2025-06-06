
public class Transportadora {
	private String nome;
	private int cnpj;
	private String localAtendimento;
	
	public Transportadora() {
		
	}
	
	public Transportadora(String nome, int cnpj, String localAtendimento) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.localAtendimento = localAtendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int id) {
		this.cnpj = id;
	}

	public String getLocalAtendimento() {
		return localAtendimento;
	}

	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}
	
}
