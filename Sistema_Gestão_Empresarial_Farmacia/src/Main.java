import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Empresa farmacia = new Empresa();
		Scanner input = new Scanner(System.in);
		int op;
		Cargo gerente = new Cargo(Setor.GERENTE_FILIAL, 800, 500, 5000, 4000);
		Cargo atendimento = new Cargo(Setor.ATENDIMENTO_CLIENTE, 300, 300, 3000, 3000);
		Cargo rh = new Cargo (Setor.GESTAO_PESSOAS, 400, 400, 3000, 3000);
		Cargo financeiro = new Cargo(Setor.FINANCEIRO, 400, 400, 3000, 3000);
		Cargo vendedor = new Cargo(Setor.VENDAS, 300, 300, 3000, 3000);
		Cargo almoxarifado = new Cargo(Setor.ALMOXARIFADO, 300, 300, 3000, 3000);
		Cargo transportador = new Cargo(Setor.TRANSPORTADORAS, 300, 300, 3000, 3000);


		do{
			System.out.println(" ==== Farmácia ====");
			System.out.println("1 - Adicionar Funcionário");
			System.out.println("2 - Remover Funcionário");
			System.out.println("3 - Adicionar Produto");
			System.out.println("4 - Remover Produto");
			System.out.println("5 - Adicionar Transportadora");
			System.out.println("6 - Remover Transportadora ");
			System.out.println("7 - Listar Funcionários");
			System.out.println("8 - Listar Produtos");
			System.out.println("9 - Listar Transportadoras");
			System.out.println("10 - Adicionar Serviço");
			System.out.println("11 - Cancelar Serviço");
			System.out.println("12 - Calcular Lucro anual");
			System.out.println("13 - Calcular Lucro mensal");
			System.out.println("14 - Calcular estimativa de Lucro anual");
			System.out.println("15 - Calcular estimativa de Lucro mensal");
			System.out.println("16 - Quantidade de Funcionários por setor");
			System.out.println("17 - Quantidade de Funcionários por setor");
			System.out.println("18 - Sair do programa!");
			System.out.print("Opção: ");
			op = input.nextInt();
			input.nextLine();

			switch (op){
				case 1:{
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
					

					System.out.println("Digite a quantidade a quantidade do produto no estoque: ");
					int estoque = input.nextInt();

					Produto p = new Produto(nome, precoCusto, precoVenda, estoque);
					farmacia.adicionarProduto(p);
					break;
				}

				case 4:{
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

					System.out.println("Digite o local de atendimento da transportadora: ");
					String localAtendimento = input.nextLine();

					Transportadora trans = new Transportadora(nome, cnpj, localAtendimento);
					break;
				}

				case 6: {
					System.out.println("Digite o CNPJ da transportadora (SOMENTE OS NÚMEROS) que queira remover: ");
					int cnpjRemover = input.nextInt();
					farmacia.removerTransportadora(cnpjRemover);
					break;
				}

				case 7:{
					farmacia.listarFuncionarios();
					break;
				}
				case 8:{
					farmacia.listarProdutos();
					break;
				}
				case 9:{
					farmacia.listarTransportadoras();
					break;
				}
				case 10:{
					
				}



					


				}




			} while(op != 18);


	}
}
