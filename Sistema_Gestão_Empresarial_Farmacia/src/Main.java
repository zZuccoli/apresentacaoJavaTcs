import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
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
		farmacia.listarProdutos();
		
		Transportadora trans = new Transportadora("TG", 12, "Londrina" );
		
		//farmacia.listarProdutos();
		//farmacia.removerProduto(1);
		//farmacia.listarProdutos();
		
		Servico venda = new Servico(f1,trans, TipoServico.VENDA);
		Negocio neg = new Negocio(2, p);
		venda.setNegocio(neg);
		venda.calculaValorVenda();
		System.out.println(venda.getValor());
		farmacia.adicionarServico(venda);
		
		
		Servico compra = new Servico(f1, trans, TipoServico.COMPRA);
		Negocio neg1 = new Negocio(1,p);
		compra.setNegocio(neg1);
		compra.calculaValorCompra();
		System.out.println(compra.getValor());
		farmacia.adicionarServico(compra);
		compra.cancelarServico();
			
		System.out.println("Lucro da Farmácia: R$ " + farmacia.calcularLucro());
		
		farmacia.quantidadeFuncPorSetor();
	}
}
