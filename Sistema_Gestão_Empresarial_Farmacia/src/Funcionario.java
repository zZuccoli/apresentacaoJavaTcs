public class Funcionario {

	private Cargo cargo;
	private final int id;
	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private int idade;
	private char genero;
	private double imposto;
	

	public Funcionario(Cargo cargo,int id, String nome, double salarioBruto, int idade, char genero) {
		this.cargo = cargo;
		this.id = id;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.idade = idade;
		this.genero = genero;
		calculoSalarioLiquido();
	}

	public void calculoSalarioLiquido() {
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
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
		calculoSalarioLiquido();
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
	
