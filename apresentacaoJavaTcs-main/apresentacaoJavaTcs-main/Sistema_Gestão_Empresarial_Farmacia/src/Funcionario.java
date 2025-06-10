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

	public Funcionario(Cargo cargo, String nome, double salarioBruto, int idade, char genero) {
		this.id = proximoId++;
		this.cargo = cargo;
		setNome(nome); //validação de espaços vazios
		setSalarioBruto(salarioBruto); //validação de salário
		setIdade(idade); //validação de idade
		setGenero(genero); //validação de gênero
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

	public void setNome(String nome) {
		try {
			if(nome.trim().isEmpty()) { //validação de espaços vazios
				throw new Exception("Nome não pode ser vazio");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		try {
			if(salarioBruto <= 0) { //validação de salário
				throw new Exception("Salário não pode ser menor ou igual a zero");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.salarioBruto = salarioBruto;
		setSalarioLiquido();
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		try {
			if(idade <= 0) { //validação de idade
				throw new Exception("Idade não pode ser menor ou igual a zero");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		try {
			if(genero != 'M' && genero != 'F' && genero != 'm' && genero != 'f') { //validação de gênero
				throw new Exception("Gênero inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.genero = genero;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
	
