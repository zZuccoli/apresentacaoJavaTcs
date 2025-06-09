import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Transportadora> transportadores = new ArrayList<>();
	private ArrayList<Servico> servicos = new ArrayList<>();

	public Empresa() {

	}

	public void adicionarFuncionario(Funcionario f) {
		boolean achou = false;
		for (int cont = 0; cont < funcionarios.size(); cont++) {
			if (funcionarios.get(cont).getId() == f.getId()) {
				achou = true;
				break;
			}
		}
		if (achou) {
			System.out.println("Funcionário já cadastrado!");
		} else {
			funcionarios.add(f);
			System.out.println("Funcionário adicionado com sucesso!");
		}
	}

	public void removerFuncionario(int id) {
		boolean achou = false;
		for (int cont = 0; cont < funcionarios.size(); cont++) {
			if (funcionarios.get(cont).getId() == id) {
				achou = true;
				funcionarios.remove(cont);
				break;
			}
		}
		if (achou) {
			System.out.println("Funcionário removido com sucesso!");
		} else {
			System.out.println("Funcionário não cadastrado!");
		}
	}

	public void adicionarProduto(Produto p) {
		boolean achou = false;
		for (int cont = 0; cont < produtos.size(); cont++) {
			if (produtos.get(cont).getIdProduto() == p.getIdProduto()) {
				achou = true;
				break;
			}
		}
		if (achou) {
			System.out.println("Produto já cadastrado!");
		} else {
			produtos.add(p);
			System.out.println("Produto adicionado com sucesso!");
		}
	}

	public void removerProduto(int id) {
		boolean achou = false;
		for (int cont = 0; cont < produtos.size(); cont++) {
			if (produtos.get(cont).getIdProduto() == id) {
				achou = true;
				produtos.remove(cont);
				break;
			}
		}
		if (achou) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não cadastrado!");
		}
	}

	public void adicionarTransportadora(Transportadora t) {
		boolean achou = false;
		for (int cont = 0; cont < transportadores.size(); cont++) {
			if (transportadores.get(cont).getCnpj() == t.getCnpj()) {
				achou = true;
				break;
			}
		}
		if (achou) {
			System.out.println("Transportadora já cadastrado!");
		} else {
			transportadores.add(t);
			System.out.println("Transportadora adicionado com sucesso!");
		}
	}

	public void removerTransportadora(int cnpj) {
		boolean achou = false;
		for (int cont = 0; cont < transportadores.size(); cont++) {
			if (transportadores.get(cont).getCnpj() == cnpj) {
				achou = true;
				transportadores.remove(cont);
				break;
			}
		}
		if (achou) {
			System.out.println("Transportadora removida com sucesso!");
		} else {
			System.out.println("Transportadora não cadastrada!");
		}
	}

	public void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado!");
			return;
		}
		for (Produto p : produtos) {
			System.out.println("-------------------------");
			System.out.println("ID: " + p.getIdProduto());
			System.out.println("Nome: " + p.getNome());
			System.out.println("Preço de custo: " + p.getPrecoCusto());
			System.out.println("Preço de venda: " + p.getPrecoVenda());
			System.out.println("Quantidade em estoque: " + p.getQuantidadeEstoque());
		}
	}

	public void listarFuncionarios() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado.");
			return;
		}

		System.out.println("Lista de funcionários:");
		for (Funcionario f : funcionarios) {
			System.out.println("-----------------------------");
			System.out.println("ID: " + f.getId());
			System.out.println("Nome: " + f.getNome());
			System.out.println("Idade: " + f.getIdade());
			System.out.println("Gênero: " + f.getGenero());
			System.out.println("Cargo: " + f.getCargo());
			System.out.println("Imposto devido: R$ " + String.format("%.2f", f.getImposto()));
			System.out.println("Salário Bruto: R$ " + String.format("%.2f", f.getSalarioBruto()));
			System.out.println("Salário Liquido: R$" + String.format("%.2f", f.getSalarioLiquido()));
		}
	}

	public void listarTransportadoras() {
		if (transportadores.isEmpty()) {
			System.out.println("Nenhuma transportadora cadastrada.");
			return;
		}

		System.out.println("Lista de transportadoras:");
		for (Transportadora t : transportadores) {
			System.out.println("----------------------------");
			System.out.println("Nome: " + t.getNome());
			System.out.println("CNPJ: " + t.getCnpj());
			System.out.println("Local Atendimento: " + t.getLocalAtendimento());
		}
	}

	public void adicionarServico(Servico servico) {
		servicos.add(servico);
		System.out.println("Serviço adicionado com sucesso!");
	}

	public double calcularLucro() {
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : servicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.ABERTO) {
				continue;
			}
			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}

	public double calcularEstimativaLucro() {
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : servicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.CONCLUÍDO) {
				continue;
			}
			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}

	public void quantidadeFuncPorSetor() {
		int gerente = 0;
		int atendimento = 0;
		int rh = 0;
		int financeiro = 0;
		int vendas = 0;
		int almoxarifado = 0;
		int trans = 0;
		for (int cont = 0; cont < funcionarios.size(); cont++) {
			if (funcionarios.get(cont).getCargo() == Setor.GERENTE_FILIAL) {
				gerente++;
			} else if (funcionarios.get(cont).getCargo() == Setor.ATENDIMENTO_CLIENTE) {
				atendimento++;
			} else if (funcionarios.get(cont).getCargo() == Setor.GESTAO_PESSOAS) {
				rh++;
			} else if (funcionarios.get(cont).getCargo() == Setor.ALMOXARIFADO) {
				almoxarifado++;
			} else if (funcionarios.get(cont).getCargo() == Setor.FINANCEIRO) {
				financeiro++;
			} else if (funcionarios.get(cont).getCargo() == Setor.TRANSPORTADORAS) {
				trans++;
			} else {
				vendas++;
			}
		}
		System.out.println("--- Funcionários por Setor --- \nGerente: " + gerente + "\nAtendimento: " + atendimento
				+ "\nRH: " + rh + "\nFinanceiro: "
				+ financeiro + "\nVendas: " + vendas + "\nAlmoxarifado: " + almoxarifado + "\nTransportadores: "
				+ trans);
	}

	public double calculaLucroMensal(int mes) {
		List<Servico> listaServicos = servicos.stream()
				.filter(servico -> servico.getData().getMonthValue() == mes).collect(Collectors.toList());
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : listaServicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.ABERTO) {
				continue;
			}
			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}

	public double calculaEstimativaLucroMensal(int mes) {
		List<Servico> listaServicos = servicos.stream()
				.filter(servico -> servico.getData().getMonthValue() == mes).collect(Collectors.toList());
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : listaServicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.CONCLUÍDO) {
				continue;
			}

			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}

	public double calculaLucroAnual(int ano) {
		List<Servico> listaServicos = servicos.stream()
				.filter(servico -> servico.getData().getYear() == ano).collect(Collectors.toList());
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : listaServicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.ABERTO) {
				continue;
			}
			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}

	public double calculaEstimativaLucroAnual(int ano) {
		List<Servico> listaServicos = servicos.stream()
				.filter(servico -> servico.getData().getYear() == ano).collect(Collectors.toList());
		double somaVendas = 0;
		double somaCompra = 0;
		for (Servico s : listaServicos) {
			if (s.getStatus() == Status.CANCELADO || s.getStatus() == Status.CONCLUÍDO) {
				continue;
			}
			if (s.getTipoServico() == TipoServico.COMPRA) {
				somaCompra += s.getValor();
			} else if (s.getTipoServico() == TipoServico.VENDA) {
				somaVendas += s.getValor();
			}
		}
		return somaVendas - somaCompra;
	}
}
