
public class Cargo {
	private Setor setor;
	private double valeAlimento;
	private double valeTransporte;
	private double planoSaude;
	private double planoOdonto;
	
	public Cargo(Setor setor, double valeAlimento, double valeTransporte, double planoSaude, double planoOdonto) {
		this.setor = setor;
		setValeAlimento(valeAlimento); //validação de numero negativo
		this.valeTransporte = valeTransporte;
		this.planoSaude = planoSaude;
		this.planoOdonto = planoOdonto;
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
				throw new IllegalArgumentException("Valor inválido, o valor do vale alimento deve ser maior que 0");
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
		this.valeTransporte = valeTransporte;
	}

	public double getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(double planoSaude) {
		this.planoSaude = planoSaude;
	}

	public double getPlanoOdonto() {
		return planoOdonto;
	}

	public void setPlanoOdonto(double planoOdonto) {
		this.planoOdonto = planoOdonto;
	}
	
	
	
}
