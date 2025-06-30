package br.com.lts.exemplos.limpoesujo;

public class PedidoLimpo {

    public static void main(String[] args) {
        MetodoPagamento opcaoPagamento = new Dinheiro();
        Pedido pedido = new Pedido();
        pedido.processaPedido(opcaoPagamento, 200);
    }
}

class Pedido {
    public void processaPedido(MetodoPagamento metodo, double valor) {
        metodo.pagar(valor);
    }
}

interface MetodoPagamento {
    void pagar(double valor);
}

class Dinheiro implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro no valor de " + valor);
    }
}

class Cartao implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no cartão no valor de " + valor);
    }
}

class Pix implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no pix no valor de " + valor);
    }
}