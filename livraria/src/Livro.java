public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        this.preco -= this.preco * (percentual / 100.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }
}






