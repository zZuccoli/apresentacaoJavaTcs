import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do caixa inicial
        System.out.print("Informe o valor inicial do caixa da empresa: R$ ");
        double caixaInicial = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        // Criar empresa com caixa inicial
        Empresa empresa = new Empresa(caixaInicial);

        // Cadastrar produtos e transportadora inicial
        empresa.adicionarProduto(new Produto("Paracetamol", 1, 55, 100, 100));
        empresa.adicionarProduto(new Produto("Dipirona", 2, 15, 70, 150));
        empresa.adicionarProduto(new Produto("Ibuprofeno", 3, 20, 60, 200));
        empresa.adicionarProduto(new Produto("Aspirina", 4, 25, 50, 250));
        empresa.adicionarTransportadora(new Transportadora("Transp1", 81841819, "Curitiba"));
        Funcionario funcionario1 = new Funcionario(null, 1, "Jao", 2000, 20, 'h');
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gestão Farmacêutica ===");
            System.out.println("1. Listar funcionários");
            System.out.println("2. Listar produtos em estoque");
            System.out.println("3. Visualizar caixa e estimativa de lucros");
            System.out.println("4. Visualizar transportadoras parceiras");
            System.out.println("5. Visualizar negócios em andamento");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    empresa.listarFuncionarios();
                    break;
                case 2:
                    empresa.listarProdutos();
                    break;
                case 3:
                    empresa.exibirCaixaELucros(); 
                    break;
                case 4:
                    empresa.listarTransportadoras();
                    break;
                case 5:
                    empresa.listarNegociosEmAndamento();
                    break;
                case 6:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
