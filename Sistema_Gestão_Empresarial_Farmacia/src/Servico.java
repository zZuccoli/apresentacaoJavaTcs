import java.util.ArrayList;

public class Servico {
	private Funcionario funcionario;
	ArrayList<Negocio> negocios;
	private Transportadora transportadora;
	private Status status;
	private TipoServico tipoServico;
	private double valor = 0;
	
	
	
	// O Servico sera criado e depois perguntar quais produtos quer vender/comprar e as quantidades, depois fazer o setNegocio para este servico(1-Cria Servico, 2-Pergunta Produtos, 3-Adiciona Produtos na lista do Servico)
	public Servico(Funcionario funcionario, Transportadora transportadora, TipoServico tipoServico) {
		 	this.funcionario = funcionario;
		    this.negocios = new ArrayList<>();   
		    this.transportadora = transportadora;
		    this.status = Status.ABERTO;
		    this.tipoServico = tipoServico;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Negocio> getNegocios() {
		return negocios;
	}

	public void setNegocio(Negocio negocio) {
		int quantidadeEstoque = negocio.getProduto().getQuantidadeEstoque();
		System.out.println(quantidadeEstoque);
		if(tipoServico == TipoServico.VENDA) {
			if(quantidadeEstoque <= 0) {
				System.out.println("Este produto esta esgotado");
				return;
			}
			if(quantidadeEstoque < negocio.getQuantidade()) {
				System.out.println("Não possuimos esta quantidade em estoque");
				return;
			}
			negocio.getProduto().setQuantidadeEstoque(quantidadeEstoque - negocio.getQuantidade());
		}else {
			negocio.getProduto().setQuantidadeEstoque(quantidadeEstoque + negocio.getQuantidade());
		}
		this.negocios.add(negocio);
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Status getStatus() {
		return status;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Servico() {
		
	}
	
	public double calculaValor() {
		for(Negocio ne : negocios) {
			if(this.tipoServico == TipoServico.VENDA) {
				valor += ne.getProduto().getPrecoVenda() * ne.getQuantidade();
			}else if(this.tipoServico == TipoServico.COMPRA) {
				valor += ne.getProduto().getPrecoCusto() * ne.getQuantidade();
			}
		}
		return valor;
	}
	
	public void cancelarServico() {
		if(status == Status.CONCLUÍDO) {
			System.out.println("Não é possivel cancelar um serviço ja concluido");
			return;
		}
		status = Status.CANCELADO;
		System.out.println("Serviço cancelado com sucesso!");
	}
	
	public void checaPagamento() {
		boolean pago = true;
		if(pago) {
			status = Status.CONCLUÍDO;
			System.out.println("Pagamento efetuado!");
		}else {
			System.out.println("O serviço ainda está em aberto!");
		}
	}
	
	
}