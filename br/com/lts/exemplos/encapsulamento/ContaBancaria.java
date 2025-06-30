package br.com.lts.exemplos.encapsulamento;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
