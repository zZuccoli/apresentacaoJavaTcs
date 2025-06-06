
public class Cargo {
	private Setor setor;
	private double valeAlimento;
	private double valeTransporte;
	private double planoSaude;
	private double planoOdonto;
	
	public Cargo(Setor setor, double valeAlimento, double valeTransporte, double planoSaude, double planoOdonto) {
		this.setor = setor;
		setValeAlimento(valeAlimento); //validação de numero negativo
		setValeTransporte(valeTransporte); //validação de numero negativo
		setPlanoSaude(planoSaude); //validação de numero negativo
		setPlanoOdonto(planoOdonto); //validação de numero negativo
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getValeAlimento() {
		return valeAlimento;
	}

	public void setValeAlimento(double valeAlimento) {
		try {
			if(valeAlimento < 0) {
				throw new IllegalArgumentException("Valor inválido, o valor do vale alimento deve ser maior que 0"); // mensagem de erro
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		this.valeAlimento = valeAlimento;
	}

	public double getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(double valeTransporte) {
		try {
			if(valeTransporte < 0) {
				throw new IllegalArgumentException("Valor inválido, o valor do vale transporte deve ser maior que 0"); // mensagem de erro
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public double getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(double planoSaude) {
		try {
			if(planoSaude < 0) {
				throw new IllegalArgumentException("Valor inválido, o valor do plano de saúde deve ser maior que 0"); // mensagem de erro
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public double getPlanoOdonto() {
		return planoOdonto;
	}

	public void setPlanoOdonto(double planoOdonto) {
		try {
			if(planoOdonto < 0) {
				throw new IllegalArgumentException("Valor inválido, o valor do plano odontológico deve ser maior que 0"); // mensagem de erro
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
