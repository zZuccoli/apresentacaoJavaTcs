public class Funcionario {

	private static int proximoId = 1;
	private Cargo cargo;
	private final int id;
	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private int idade;
	private char genero;
	private double imposto;

	public Funcionario(Cargo cargo, String nome, double salarioBruto, int idade, char genero) throws Exception {
		validateNome(nome);
		validateSalarioBruto(salarioBruto);
		validateIdade(idade);
		validateGenero(genero);
		
		this.id = proximoId++;
		this.cargo = cargo;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.idade = idade;
		this.genero = genero;
		setSalarioLiquido();
	}

	public void setSalarioLiquido() {
		if(this.salarioBruto > 4664.68 ) {
			this.imposto = this.salarioBruto * 0.275;
		}else if(this.salarioBruto >= 3751.06) {
			this.imposto = this.salarioBruto * 0.225;
		}else if(this.salarioBruto >= 2826.66) {
			this.imposto = this.salarioBruto*0.15;
		}else if(this.salarioBruto >= 2428.81) {
			this.imposto = this.salarioBruto*0.075;
		}
		this.salarioLiquido = this.salarioBruto - this.imposto;
	}

	public Setor getCargo() {
		return cargo.getSetor();
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		validateNome(nome);
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) throws Exception {
		validateSalarioBruto(salarioBruto);
		this.salarioBruto = salarioBruto;
		setSalarioLiquido();
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		validateIdade(idade);
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) throws Exception {
		validateGenero(genero);
		this.genero = genero;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	private void validateNome(String nome) throws Exception {
		if(nome == null || nome.trim().isEmpty()) {
			throw new Exception("Nome não pode ser vazio");
		}
	}
	
	private void validateSalarioBruto(double salarioBruto) throws Exception {
		if(salarioBruto <= 0) {
			throw new Exception("Salário não pode ser menor ou igual a zero");
		}
	}
	
	private void validateIdade(int idade) throws Exception {
		if(idade <= 17) {
			throw new Exception("Não pode ser efetivado sendo menor de Idade");
		}
	}
	
	private void validateGenero(char genero) throws Exception {
		if(genero != 'M' && genero != 'F' && genero != 'm' && genero != 'f') {
			throw new Exception("Gênero inválido");
		}
	}
	
}
	
