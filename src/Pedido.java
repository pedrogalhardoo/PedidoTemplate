// Classe abstrata Pedido com o método template processarPedido
abstract class Pedido {
    protected int quantidadeItens;
    protected double valorItem;
    protected String formaPagamento;

    public Pedido(int quantidadeItens, double valorItem, String formaPagamento) {
        this.quantidadeItens = quantidadeItens;
        this.valorItem = valorItem;
        this.formaPagamento = formaPagamento;
    }

    // O método template
    public final void processarPedido() {
        processarPagamento();
        decidirEntrega();
    }

    // Métodos abstratos que serão definidos nas subclasses
    protected abstract void processarPagamento();
    protected abstract void decidirEntrega();
}




