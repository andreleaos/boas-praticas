package br.com.lts.exemplos.limpoesujo;

public class PedidoSujo {

    public void processaPedido(int tipoPagamento, double valor) {
        if (tipoPagamento == 1) {
            System.out.println("Pagamento em dinheiro no valor de " + valor);
        } else if (tipoPagamento == 2) {
            System.out.println("Pagamento no cartão no valor de " + valor);
        } else {
            System.out.println("Tipo de pagamento inválido");
        }
    }
}
