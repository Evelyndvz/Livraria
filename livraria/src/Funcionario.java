public class Funcionario {
    private String nome;
    private double salario;
    private double percentualComissao;

    public Funcionario(String nome, double salario, double percentualComissao) {
        this.nome = nome;
        this.salario = salario;
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao(double totalVendas) {
        return totalVendas * (this.percentualComissao / 100.0);
    }

    public String getNome() {
        return nome;
    }
}