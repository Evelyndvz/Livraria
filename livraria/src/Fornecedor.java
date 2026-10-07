public class Fornecedor {
    private String razaoSocial;
    private String cnpj;
    private String email;

    public Fornecedor(String razaoSocial, String cnpj, String email) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
    }

    public String enviarPedido(String nomeLivro, int quantidade) {
        return "Pedido de " + quantidade + " unidades do livro '" + nomeLivro + "' enviado para " + razaoSocial;
    }
}