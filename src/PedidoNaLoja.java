// Subclasse para pedidos na loja
class PedidoNaLoja extends Pedido {
    public PedidoNaLoja(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem, "na loja");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Pagamento na loja processado para " + quantidadeItens + " itens.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Cliente levará os itens imediatamente.");
    }
}
