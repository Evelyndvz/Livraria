public class Caixa {
    private int idCaixa;
    private double saldoAtual;
    private boolean aberto;

    public Caixa(int idCaixa, double saldoInicial) {
        this.idCaixa = idCaixa;
        this.saldoAtual = saldoInicial;
        this.aberto = true;
    }

    public void registrarEntrada(double valor) {
        if (this.aberto) {
            this.saldoAtual += valor;
        }
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}