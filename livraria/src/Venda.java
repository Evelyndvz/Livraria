public class Venda {
    private int idVenda;
    private double valorTotal;
    private String status;

    public Venda(int idVenda, double valorTotal) {
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
        this.status = "Pendente";
    }

    public void finalizarVenda(String formaPagamento) {
        this.status = "Finalizada (" + formaPagamento + ")";
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }
}
