// Classe Main para demonstração
public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline(5, 20.0);
        pedidoOnline.processarPedido();

        Pedido pedidoLoja = new PedidoNaLoja(3, 15.0);
        pedidoLoja.processarPedido();

        Pedido pedidoCripto = new PedidoCriptomoedas(2, 50.0);
        pedidoCripto.processarPedido();
    }
}