public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DA LIVRARIA ===\n");

        // 1. Livro
        Livro livro = new Livro("O Alquimista", "Paulo Coelho", 50.0);
        livro.aplicarDesconto(10.0);
        System.out.printf("1. LIVRO: %s | Preço com desconto: R$ %.2f\n", livro.getTitulo(), livro.getPreco());

        // 2. Cliente
        Clientes cliente = new Clientes("Ana Silva", "123.456.789-00", 0);
        cliente.adicionarPontos(livro.getPreco());
        System.out.println("2. CLIENTE: " + cliente.getNome() + " | Pontos: " + cliente.getPontosFidelidade());

        // 3. Estoque
        Estoque estoque = new Estoque(15, 5, "Prateleira A1");
        estoque.atualizarQuantidade(-1);
        System.out.println("3. ESTOQUE: Quantidade atual = " + estoque.getQuantidadeAtual());

        // 4. Funcionario
        Funcionario funcionario = new Funcionario("Carlos", 2000.0, 5.0);
        double comissao = funcionario.calcularComissao(1000.0);
        System.out.printf("4. FUNCIONÁRIO: %s | Comissão = R$ %.2f\n", funcionario.getNome(), comissao);

        // 5. Fornecedor
        Fornecedor fornecedor = new Fornecedor("Editora Brasil", "12.345.678/0001-90", "contato@editora.com");
        System.out.println("5. FORNECEDOR: " + fornecedor.enviarPedido("Dom Casmurro", 20));

        // 6. Venda
        Venda venda = new Venda(101, livro.getPreco());
        venda.finalizarVenda("Cartão de Crédito");
        System.out.println("6. VENDA: Status = " + venda.getStatus());

        // 7. Caixa
        Caixa caixa = new Caixa(1, 100.0);
        caixa.registrarEntrada(venda.getValorTotal());
        System.out.printf("7. CAIXA: Saldo atual = R$ %.2f\n", caixa.getSaldoAtual());
    }
}