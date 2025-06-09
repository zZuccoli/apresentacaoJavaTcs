
public class Transportadora {
	private String nome;
	private int cnpj;
	private String localAtendimento;

	public Transportadora() {

	}

	public Transportadora(String nome, int cnpj, String localAtendimento) {
		setNome(nome);
		setCnpj(cnpj);
		this.localAtendimento = localAtendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		try {
			if (nome.trim().isEmpty()) {
				throw new Exception("Nome não pode ser vazio");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		try {
			if (cnpj < 0 || cnpj > 99999999999999L) {
				throw new Exception("CNPJ Inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getLocalAtendimento() {
		return localAtendimento;
	}

	public void setLocalAtendimento(String localAtendimento) {
		try {
			if (localAtendimento.trim().isEmpty()) {
				throw new Exception("Local de atendimento não pode ser vazio");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
