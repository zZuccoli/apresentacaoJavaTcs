import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner input = new Scanner(System.in);
		int op;

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

			switch (op){
				




			}



		} while(op != 18);


=======
		Empresa farmacia = new Empresa();
		Cargo gerente = new Cargo(Setor.GERENTE_FILIAL, 500, 180, 3000, 3000);
		Cargo atendimento = new Cargo(Setor.ATENDIMENTO_CLIENTE, 300, 160, 3000, 3000);
		Cargo rh = new Cargo(Setor.GESTAO_PESSOAS, 400, 180, 3000, 3000);
		Cargo financeiro = new Cargo(Setor.FINANCEIRO, 400, 180, 3000, 3000);
		Funcionario f1 = new Funcionario(gerente, "Caio", 50000, 29, 'm');
		Funcionario f2 = new Funcionario(atendimento, "Teste", 3000, 29, 'm');
		Funcionario f3 = new Funcionario(rh, "Rafael", 2000, 29, 'm');
		Funcionario f4 = new Funcionario(financeiro, "Sabrina", 1000, 29, 'f');
		Produto p = new Produto("Paracetamol", 20, 40, 3);
		farmacia.adicionarProduto(p);
		farmacia.adicionarFuncionario(f1);
		farmacia.adicionarFuncionario(f2);
		farmacia.adicionarFuncionario(f3);
		farmacia.adicionarFuncionario(f4);
		farmacia.listarFuncionarios();
		
		Transportadora trans = new Transportadora("TG", 12, "Londrina" );
		
		//farmacia.listarProdutos();
		//farmacia.removerProduto(1);
		//farmacia.listarProdutos();
		
		Servico venda = new Servico(f1,trans, TipoServico.VENDA);
		Negocio neg = new Negocio(2, p);
		venda.setNegocio(neg);
		venda.calculaValor();
		System.out.println(venda.getValor());
		farmacia.adicionarServico(venda);
		
		
		Servico compra = new Servico(f1, trans, TipoServico.COMPRA);
		Negocio neg1 = new Negocio(1,p);
		compra.setNegocio(neg1);
		compra.calculaValor();
		System.out.println(compra.getValor());
		farmacia.adicionarServico(compra);
		compra.cancelarServico();
			
		System.out.println("Lucro da Farmácia: R$ " + farmacia.calcularEstimativaLucro());
		
		farmacia.quantidadeFuncPorSetor();
>>>>>>> eea8b2b6466bc98936b35b37ca68b40ea8987646
	}
}
