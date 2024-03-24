// Subclasse para pedidos com pagamento em criptomoedas
class PedidoCriptomoedas extends Pedido {
    public PedidoCriptomoedas(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem, "criptomoedas");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Pagamento com criptomoedas processado para " + quantidadeItens + " itens.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será feita digitalmente ou ao endereço do cliente.");
    }
}