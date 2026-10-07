public class Clientes {
    private String nome;
    private String cpf;
    private int pontosFidelidade;

    public Clientes(String nome, String cpf, int pontosFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontosFidelidade = pontosFidelidade;
    }

    public void adicionarPontos(double valorCompra) {
        this.pontosFidelidade += (int) (valorCompra / 10.0);
    }

    public String getNome() {
        return nome;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }
}
