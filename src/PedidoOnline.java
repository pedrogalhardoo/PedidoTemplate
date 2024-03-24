// Subclasse para pedidos online
class PedidoOnline extends Pedido {
    public PedidoOnline(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem, "online");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Pagamento online processado para " + quantidadeItens + " itens.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será feita ao endereço do cliente.");
    }
}
