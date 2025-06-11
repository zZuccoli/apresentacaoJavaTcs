import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Empresa farmacia = new Empresa();
		Scanner input = new Scanner(System.in);
		int op;
		Cargo gerente = new Cargo(Setor.GERENTE_FILIAL, 800, 500, 5000, 4000);
		Cargo atendimento = new Cargo(Setor.ATENDIMENTO_CLIENTE, 300, 300, 3000, 3000);
		Cargo rh = new Cargo(Setor.GESTAO_PESSOAS, 400, 400, 3000, 3000);
		Cargo financeiro = new Cargo(Setor.FINANCEIRO, 400, 400, 3000, 3000);
		Cargo vendedor = new Cargo(Setor.VENDAS, 300, 300, 3000, 3000);
		Cargo almoxarifado = new Cargo(Setor.ALMOXARIFADO, 300, 300, 3000, 3000);
		Cargo transportador = new Cargo(Setor.TRANSPORTADORAS, 300, 300, 3000, 3000);

		do {
			System.out.println(" ======= Farmácia =======");
			System.out.println("1 - Adicionar Funcionário");
			System.out.println("2 - Remover Funcionário");
			System.out.println("3 - Adicionar Produto");
			System.out.println("4 - Remover Produto");
			System.out.println("5 - Adicionar Transportadora");
			System.out.println("6 - Remover Transportadora ");
			System.out.println("7 - Listar Funcionários");
			System.out.println("8 - Estoque de Produtos");
			System.out.println("9 - Listar Transportadoras");
			System.out.println("10 - Adicionar Serviço");
			System.out.println("11 - Cancelar Serviço");
			System.out.println("12 - Calcular Lucro anual");
			System.out.println("13 - Calcular Lucro mensal");
			System.out.println("14 - Calcular estimativa de Lucro anual");
			System.out.println("15 - Calcular estimativa de Lucro mensal");
			System.out.println("16 - Quantidade de Funcionários por setor");
			System.out.println("17 - Listar Serviços");
			System.out.println("18 - Mostrar Caixa Atual da Empresa");
			System.out.println("0 - Sair do programa!");

			System.out.print("Opção: ");
			op = input.nextInt();
			input.nextLine();

			switch (op) {

				case 0: {
					System.out.println("Encerrando o programa.");
					break;
				}

				case 1: {
					System.out.println("Digite o nome do Funcionário: ");
					String nome = input.nextLine();

					System.out.println("Digite o salário bruto do Funcionário: ");
					double salarioBruto = input.nextDouble();

					System.out.println("Digite a idade do Funcionário: ");
					int idade = input.nextInt();

					System.err.println("Digite o gênero do Funcionário (M/F):");
					char genero = input.next().charAt(0);

					System.out.println("Digite o cargo: ");
					System.out.println("Escolha o cargo do funcionário:");
					System.out.println("1 - Gerente");
					System.out.println("2 - Atendimento ao Cliente");
					System.out.println("3 - RH");
					System.out.println("4 - Financeiro");
					System.out.println("5 - Vendedor");
					System.out.println("6 - Almoxarifado");
					System.out.println("7 - Transportador");
					System.out.print("Opção: ");
					int cargoOp = input.nextInt();
					input.nextLine();

					Cargo cargoEscolhido = null;
					switch (cargoOp) {
						case 1:
							cargoEscolhido = gerente;
							break;
						case 2:
							cargoEscolhido = atendimento;
							break;
						case 3:
							cargoEscolhido = rh;
							break;
						case 4:
							cargoEscolhido = financeiro;
							break;
						case 5:
							cargoEscolhido = vendedor;
							break;
						case 6:
							cargoEscolhido = almoxarifado;
							break;
						case 7:
							cargoEscolhido = transportador;
							break;
						default:
							System.out.println("Opção de cargo inválida. Funcionário não criado!");
							break;
					}

					if (cargoEscolhido != null) {
						Funcionario funcionario = new Funcionario(cargoEscolhido, nome, salarioBruto, idade, genero);
						farmacia.adicionarFuncionario(funcionario);
					}
					break;
				}

				case 2: {
					System.out.println("Digite o ID do Funcionário que queira remover: ");
					int idRemover = input.nextInt();
					farmacia.removerFuncionario(idRemover);
					break;
				}

				case 3: {
					System.out.println("Digite o nome do Produto que queira adicionar: ");
					String nome = input.nextLine();

					System.out.println("Digite o preço de custo do Produto: ");
					double precoCusto = input.nextDouble();

					System.out.println("Digite o preco de venda do Produto: ");
					double precoVenda = input.nextDouble();

					System.out.println("Digite a quantidade do produto no estoque: ");
					int estoque = input.nextInt();

					Produto p = new Produto(nome, precoCusto, precoVenda, estoque);
					farmacia.adicionarProduto(p);
					break;
				}

				case 4: {
					System.out.println("Digite o ID do produto que queira remover: ");
					int idRemove = input.nextInt();
					farmacia.removerProduto(idRemove);
					break;
				}

				case 5: {
					System.out.println("Digite o nome da transportadora: ");
					String nome = input.nextLine();

					System.out.println("Digite o CNPJ da transportadora(SOMENTE NÚMEROS): ");
					int cnpj = input.nextInt();
					input.nextLine();

					System.out.println("Digite o local de atendimento da transportadora: ");
					String localAtendimento = input.nextLine();

					Transportadora trans = new Transportadora(nome, cnpj, localAtendimento);
					farmacia.adicionarTransportadora(trans);
					break;
				}

				case 6: {
					System.out.println("Digite o CNPJ da transportadora (SOMENTE OS NÚMEROS) que queira remover: ");
					int cnpjRemover = input.nextInt();
					farmacia.removerTransportadora(cnpjRemover);
					break;
				}

				case 7: {
					farmacia.listarFuncionarios();
					break;
				}
				case 8: {
					farmacia.listarProdutos();
					break;
				}
				case 9: {
					farmacia.listarTransportadoras();
					break;
				}
				case 10: {
					System.out.println("Digite o tipo do serviço: 1 - REPOSIÇÃO ESTOQUE, 2 - VENDA");
					int tipo = input.nextInt();
					input.nextLine();
					TipoServico tipoServico;
					if (tipo == 1) {
						tipoServico = TipoServico.COMPRA;
					} else if (tipo == 2) {
						tipoServico = TipoServico.VENDA;
					} else {
						System.out.println("Opção inválida.");
						break;
					}

					// Verificar se há funcionários e transportadoras cadastrados
					if (farmacia.getFuncionarios().isEmpty() || farmacia.getTransportadores().isEmpty()
							|| farmacia.getProdutos().isEmpty()) {
						System.out.println(
								"Você precisa de pelo menos um funcionário, transportadora e produto cadastrados para criar um serviço.");
						break;
					}

					// Filtrar apenas funcionários do setor correto
					ArrayList<Funcionario> funcionariosDisponiveis = new ArrayList<>();
					// ArrayList<Funcionario> funcionariosDisponiveis;
					if (tipoServico == TipoServico.VENDA) {
						funcionariosDisponiveis = farmacia.buscaVendedores();
						if (funcionariosDisponiveis.isEmpty()) {
							System.out.println("Não há funcionários cadastrados no setor de VENDAS.");
							break;
						}
					} else { // COMPRA
						funcionariosDisponiveis = farmacia.buscaAlmoxarifado();
						if (funcionariosDisponiveis.isEmpty()) {
							System.out.println("Não há funcionários cadastrados no setor de ALMOXARIFADO.");
							break;
						}
					}

					// Escolher funcionário
					System.out.println("Escolha o ID do funcionário responsável:");
					for (Funcionario f : funcionariosDisponiveis) {
						System.out.println("ID: " + f.getId() + " | Nome: " + f.getNome());
					}
					int idFunc = input.nextInt();
					input.nextLine();

					Funcionario func = farmacia.pegarFuncionarioPorId(idFunc);
					if (func == null) {
						System.out.println("Funcionário inválido ou não pertence ao setor correto.");
						break;
					}

					// Escolher transportadora
					System.out.println("Escolha o CNPJ da transportadora:");
					farmacia.listarTransportadoras();
					int cnpjTransp = input.nextInt();
					input.nextLine();
					Transportadora transp = farmacia.pegarTransportadoraPorCNPJ(cnpjTransp);
					if (transp == null) {
						System.out.println("Transportadora não encontrada.");
						break;
					}

					// Data do serviço
					System.out.println("Digite a data do serviço (dd/MM/yyyy):");
					String data = input.nextLine();

					Servico servico = new Servico(func, transp, tipoServico, data);

					// Adicionar produtos
					boolean adicionarMais;
					do {
						System.out.println("Produtos disponíveis:");
						farmacia.listarProdutos();
						System.out.print("Digite o ID do produto: ");
						int idProd = input.nextInt();
						System.out.print("Digite a quantidade: ");
						int quantidade = input.nextInt();
						input.nextLine();

						Produto prod = farmacia.pegarProdutoPorId(idProd);

						if (prod == null) {
							System.out.println("Produto não encontrado.");
						} else {
							Negocio negocio = new Negocio(quantidade, prod);
							servico.setNegocio(negocio);
						}

						System.out.println("Deseja adicionar outro produto? (s/n)");
						adicionarMais = input.nextLine().trim().equalsIgnoreCase("s");
					} while (adicionarMais);

					servico.calculaValor();

					// Status do serviço
					System.out.println("Defina o status do serviço:");
					System.out.println("1 - ABERTO");
					System.out.println("2 - CONCLUÍDO");
					int opcaoStatus = input.nextInt();
					input.nextLine();

					if (opcaoStatus == 1) {
						servico.setStatus(Status.ABERTO);
						System.out.println("Serviço criado com status ABERTO");
					} else if (opcaoStatus == 2) {
						servico.checaPagamento();
						System.out.println("Serviço concluído e pago com sucesso");
					} else {
						System.out.println("Opção inválida. O serviço será mantido como ABERTO por padrão.");
						servico.setStatus(Status.ABERTO);
					}
					farmacia.adicionarServico(servico);
					break;
				}

				case 11: {
					ArrayList<Servico> servicos = farmacia.getServicos();

					if (servicos.isEmpty()) {
						System.out.println("Nenhum serviço cadastrado.");
						break;
					}

					System.out.println("Serviços cadastrados:");
					for (int i = 0; i < servicos.size(); i++) {
						Servico s = servicos.get(i);
						System.out.println((i + 1) + " - Tipo: " + s.getTipoServico() +
								" | Status: " + s.getStatus() +
								" | Data: " + s.getData() +
								" | Valor: R$ " + String.format("%.2f", s.getValor()));
					}

					System.out.print("Escolha o número do serviço que deseja cancelar: ");
					int escolha = input.nextInt();
					input.nextLine();

					if (escolha < 1 || escolha > servicos.size()) {
						System.out.println("Opção inválida. Cancelamento não realizado.");
						break;
					}

					Servico servicoEscolhido = servicos.get(escolha - 1);
					servicoEscolhido.cancelarServico();
					break;
				}

				case 12: {
					System.out.println("Digite o ano que queira calcular o lucro: ");
					int ano = input.nextInt();
					System.out.println("Lucro anual do ano " + ano + " R$: " + farmacia.calculaLucroAnual(ano));

					break;

				}
				case 13: {
					System.out.println("Digite o número do mês que queira calcular o lucro: ");
					int mes = input.nextInt();
					System.out.println("Lucro mensal do mês " + mes + " R$: " + farmacia.calculaLucroMensal(mes));

					break;
				}

				case 14: {
					System.out.println("Digite o ano que queira calcular o lucro estimado: ");
					int ano = input.nextInt();
					System.out
							.println("Lucro anual do ano " + ano + " R$: " + farmacia.calculaEstimativaLucroAnual(ano));

					break;
				}

				case 15: {
					System.out.println("Digite o número do mês que queira calcular o lucro estimado: ");
					int mes = input.nextInt();
					System.out.println(
							"Lucro mensal do mês " + mes + "R$: " + farmacia.calculaEstimativaLucroMensal(mes));

					break;
				}

				case 16: {
					farmacia.quantidadeFuncPorSetor();
					break;
				}

				case 17: {
					System.out.println("Serviços: ");
					farmacia.listarServicos();
					break;
				}
				case 18: {
					System.out.println("Caixa atual da Empresa: " + Servico.getCaixa());
					break;
				}

				default:
					System.out.println("Opção inválida, digite uma opção válida");

			}

		} while (op != 0);

		input.close();
	}
}
