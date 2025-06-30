package br.com.lts.exemplos.solid.ocp;

public class ApplicationOcp {

    public static void main(String[] args) {
        var calc = new CalculadoraDesconto();
        Desconto opcaoDesconto = new DescontoNormal();
        calc.calcular(opcaoDesconto, 300);
    }
}

interface Desconto {
    double aplicar(double valor);
}

class DescontoVIP implements Desconto {
    public double aplicar(double valor) {
        return valor * 0.9;
    }
}

class DescontoNormal implements Desconto {
    public double aplicar(double valor) {
        return valor * 0.95;
    }
}

class CalculadoraDesconto {
    public double calcular(Desconto desconto, double valor) {
        return desconto.aplicar(valor);
    }
}