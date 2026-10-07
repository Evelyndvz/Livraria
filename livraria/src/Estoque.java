public class Estoque {
    private int quantidadeAtual;
    private int quantidadeMinima;
    private String localizacao;

    public Estoque(int quantidadeAtual, int quantidadeMinima, String localizacao) {
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.localizacao = localizacao;
    }

    public void atualizarQuantidade(int quantidade) {
        this.quantidadeAtual += quantidade;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }
}